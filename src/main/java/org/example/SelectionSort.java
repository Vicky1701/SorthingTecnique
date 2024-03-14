package org.example;

class SelectionSort {

    /*
    Step 1: Array arr with N size
    Step 2: Initialise i=0
    Step 3: If(i<N-1) Check for any element arr[j] where j>i and arr[j]<arr[i] then Swap arr[i] and arr[j]
    Step 4: i=i+1 and Goto Step 3
    Step 5: Exit
    */
    // main function
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = { 64, 25, 12, 22, 11 };

        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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
    Time Complexity:  O(n2)
    Auxiliary Space: O(1)

    */

}