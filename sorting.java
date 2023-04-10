
/* 3 types of sorting- bubble sort, selection sort, insertion sort */
import java.util.*;

class sorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER OF ELEMENTS IN THE ARRAY=");
        int n = sc.nextInt();

        // creation of array
        int arr[] = new int[n];

        // insertion to the array
        System.out.println("ENTER ELEMENTS TO THE ARRAY:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // BUBBLE SORT

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        // displaying the sorted array
        System.out.println("THE SORTED ARRAY IS =");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        }

        // SELECTION SORT

        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            // finding the smallest of all the number
            for (int j = i + 1; i < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
                // swap
                int temp = arr[smallest];
                arr[smallest] = arr[j];
                arr[i] = temp;
            }
        }

        // printing the sorted array

        System.out.println("THE SORTED ARRAY IS =");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        }

        // INSERTION SORT

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = current;
        }

        // printing the sorted array

        System.out.println("THE SORTED ARRAY IS =");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        }
    }
}