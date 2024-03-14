package org.example;

/*
    Algorthim:

        1. Start
        2. Initiate two values n as size of array ,also i and j to traverse array.
        3. Put i=0 and j=1.
        4. While traversing if array[i] > array[j] swap both the numbers.
        5. Increment the value i and j then goto Step 3.
        6. If the value of i > n-1 and j > n and n>1 then n=n-1 goto Step 2
        7.Exit

        */
class BubbleSort {

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
   /*
    Time Complexity: O(n2)
    Auxiliary Space: O(1)
    */

}