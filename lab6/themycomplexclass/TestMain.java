package lab6.themycomplexclass;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complex number 1 is: ");
        double real = scanner.nextDouble();
        double imag = scanner.nextDouble();
        Mycomplex mycomplex1 = new Mycomplex(real, imag);

        System.out.print("Enter complex number 2 is: ");
        double realNew = scanner.nextDouble();
        double imagNew = scanner.nextDouble();
        Mycomplex mycomplex2 = new Mycomplex(realNew, imagNew);

        System.out.println("Number 1 is " + mycomplex1.toString());
        if(mycomplex1.isReal()){
            System.out.println(mycomplex1 +" is real");
        }else {
        System.out.println(mycomplex1+ " is NOT a pure real number");
        }
        if(mycomplex1.isImaginary()) {
            System.out.println(mycomplex1 +" is imag");
        }else {
            System.out.println(mycomplex1 + " is NOT a pure imaginary number");
        }


        System.out.println("Number 2 is" + mycomplex2.toString());
        if(mycomplex2.isReal()){
            System.out.println(mycomplex2 +" is real");
        }else {
            System.out.println(mycomplex2 + " is NOT a pure real number");
        }
        if(mycomplex2.isImaginary()) {
            System.out.println(mycomplex2 +" is imag");
        }else {
            System.out.println(mycomplex2 + " is NOT a pure imaginary number");
        }

        if (mycomplex1.equals(mycomplex2)) {
            System.out.println(mycomplex1 + " equals to " + mycomplex2);
        } else {
            System.out.println(mycomplex1 + " is NOT equals to " + mycomplex2);
        }

        System.out.println(mycomplex1 + " + "+mycomplex2+" = "+ mycomplex1.addNew(mycomplex2));
    }
}
