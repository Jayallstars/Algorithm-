import java.util.Arrays;

public class selectionSortIdle {
        public static void selectionSort(int a[]) {
                for (int pass = a.length - 1; pass > 0; pass--) {
                        int max = pass;
                        for (int n = pass; n >= 0; n--) { // find max value
                                if (a[n] > a[max])
                                        max = n;
                        }
                        if (pass != max) {
                                int temp = a[pass];
                                a[pass] = a[max];
                                a[max] = temp;
                                // System.out.println("Pass value " + pass);
                                // for (int i : a) {
                                //         System.out.print(i + " ");
                                // }
                                // System.out.println();
                        }
                }
        }

        public static void main(String a[]) {
                int[] arr1 = { 2, 6, 4, 8, 10, 12, 89, 68, 45, 37 };
                System.out.println("Before Selection Sort");
                for (int i : arr1) {
                        System.out.print(i + " ");
                }
                System.out.println();

                selectionSort(arr1);// sorting array using selection sort

                System.out.println("After Selection Sort");
                for (int i : arr1) {
                        System.out.print(i + " ");
                }
        }
}