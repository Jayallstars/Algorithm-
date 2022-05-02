public class selectionSortIdle {
        public static void selectionSort(int[] arr) {
                int i,j,minValue,minIndex,temp = 0;
                for (i = 0; i < arr.length; i++){
                        minValue = arr[i];
                        minIndex = i;
                        for (j = i; j < arr.length; j++){
                                if (arr[j] < minValue){
                                        minValue = arr[j];
                                        minIndex = j;
                                }
                        }
                        if (minValue < arr[i]){
                                temp = arr[i];
                                arr[i] = arr[minIndex];
                                arr[minIndex] = temp;
                        }
                }
        }

        public static void main(String a[]) {
                int[] arr1 = { 50, 15, 4, 9, 3, 91 };
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