package DSA.week1.ex2;

public class MergeSort extends Sort{

    public static void merge_Sort(int[] array, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            merge_Sort(array, l, mid);
            merge_Sort(array, mid + 1, r);
            merge(array, l, mid, r);
        }
    }

    public static void merge(int[] array, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

}
