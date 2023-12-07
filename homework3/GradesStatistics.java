package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {

    static Scanner scanner = new Scanner(System.in);
    static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.println("The grades are: ");
        print(grades);
        System.out.printf("\nThe average is: %.2f", average(grades));
        Arrays.sort(grades);
        System.out.println("\nThe median is: " + median(grades));
        System.out.println("The max is: "+max(grades));
        System.out.println("The max is: "+min(grades));
        System.out.printf("The standard deviation is %.2f",stdDev(grades));
    }

    public static void readGrades() {
        System.out.print("Enter the number for calculate: ");
        int number = scanner.nextInt();
        grades = new int[number];
        int student = 1;
        int result;
        int indexArray = 0;
        do {
            System.out.print("Enter the grade for student " + student + " : ");
            result = scanner.nextInt();
            if (result >= 0 && result <= 100) {
                grades[indexArray] = result;
                student++;
                number--;
                indexArray++;
            } else {
                System.out.println("Enter again !!");
            }
        } while (number > 0);
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static double average(int[] array) {
        double sumAverage = 0.0;
        for (int i = 0; i < array.length; i++) {
            sumAverage += array[i];
        }
        return sumAverage / array.length;
    }

    public static double median(int[] array) {
        int mid = array[array.length / 2];
        if (array.length % 2 != 0) {
            return mid;
        } else {
            int mid_index = array.length / 2;
            return (array[mid_index - 1] + array[mid_index]) / 2.0;
        }
    }

    public static int max(int [] array){
        return array[array.length-1];
    }

    public static int min(int [] array){
        return array[0];
    }

    public static double stdDev(int [] array){
        int length_array = array.length;
        double average_array = average(array);
        double [] array_stdDev = new double[length_array];
        double sumArray_stdDev = 0;
        for (int i = 0; i < array_stdDev.length; i++) {
            array_stdDev[i]=array[i] - average_array;
            array_stdDev[i]=Math.pow(array_stdDev[i],2);
            sumArray_stdDev+=array_stdDev[i];
        }
        sumArray_stdDev/=array_stdDev.length-1;
        return Math.sqrt(sumArray_stdDev);
    }
}
