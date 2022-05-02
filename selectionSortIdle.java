public class selectionSortIdle {
        public static void selectionSort(int[] arr) {
                for (int i = 0; i < arr.length - 1; i++) {
                        int index = i;
                        for (int j = i + 1; j < arr.length; j++) {
                                if (arr[j] < arr[index]) {
                                        index = j;// searching for lowest index
                                }
                        }
                        int smallerNumber = arr[index];
                        arr[index] = arr[i];
                        arr[i] = smallerNumber;
                }
        }

        public static void main(String a[]) {
                int[] arr1 = { 50, 15, 4, 9, 3, 91, 8, 2, 45, 66, 23 };
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