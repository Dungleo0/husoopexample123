package lab3;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = new int[]{9,2,4,1,5};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void bubbleSort(int [] array) {
        int n = array.length;
        boolean swapped;
        do{
            swapped = false;
            for (int i = 1; i < n; i++) {
                if(array[i-1] > array[i]){
                    int temp = array[i-1];
                    array[i-1]=array[i];
                    array[i]=temp;
                    swapped=true;
                }
            }
            n--;
        }while (swapped);
    }
}
