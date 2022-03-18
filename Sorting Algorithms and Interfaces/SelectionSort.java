//package com.example.demo;

// Java program for implementation of Selection Sort

// arr = [4, 3 ,9, 10, 1]
// 1st iteration:
//arr = [1, 4, 3, 9, 10]
//2nd iteration: [4, 3, 9, 10]
//arr: [1, 3, 4, 9, 10]
// 3rd iteration: [3, 9, 10]
class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

            //print out the elements of the array
            // int m = arr.length;
            // for (int k=0; k<m; ++k)
            //     System.out.print(arr[k]+" ");
            // System.out.println();
            printArray(arr); //this works the same 

        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        //System.out.println("Unsorted array:");
        int arr[] = {64,25,12,22,11};
        //printArray(arr);
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}