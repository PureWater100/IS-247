//driver class
public class SortItemList 
{
    public static void main(String[] args)
    {
        //Selection Sort----------------------------------------------------------------------
        //create array with 5 Inventory objects
        Inventory[] invS = new Inventory[5];

        //create & initialize Inventory objects using constructor
        invS[0] = new Inventory("Empanada", 1, 10);
        invS[1] = new Inventory("Dumpling", 2, 20);
        invS[2] = new Inventory("Cake", 3, 30);
        invS[3] = new Inventory("Banana", 4, 40);
        invS[4] = new Inventory("Apple", 5, 50);

        System.out.println("Selection Sort\n--------------------\nUnsorted array:");
        Sorting.printArray(invS);
        System.out.println("Steps:\n--------------------");
        Sorting.selectionSort(invS);
        System.out.println("--------------------\nSorted array: ");
        Sorting.printArray(invS);

        //Insertion Sort----------------------------------------------------------------------
        //create array with 5 Inventory objects
        Inventory[] invI = new Inventory[5];

        //create & initialize Inventory objects using constructor
        invI[0] = new Inventory("Empanada", 1, 10);
        invI[1] = new Inventory("Dumpling", 2, 20);
        invI[2] = new Inventory("Cake", 3, 30);
        invI[3] = new Inventory("Banana", 4, 40);
        invI[4] = new Inventory("Apple", 5, 50);

        System.out.println("\nInsertion Sort\n--------------------\nUnsorted array:");
        Sorting.printArray(invI);
        System.out.println("Steps:\n--------------------");
        Sorting.insertionSort(invI);
        System.out.println("--------------------\nSorted array: ");
        Sorting.printArray(invI);

        //Bubble Sort----------------------------------------------------------------------
        //create array with 5 Inventory objects
        Inventory[] invB = new Inventory[5];

        //create & initialize Inventory objects using constructor
        invB[0] = new Inventory("Empanada", 1, 10);
        invB[1] = new Inventory("Dumpling", 2, 20);
        invB[2] = new Inventory("Cake", 3, 30);
        invB[3] = new Inventory("Banana", 4, 40);
        invB[4] = new Inventory("Apple", 5, 50);

        System.out.println("\nBubble Sort\n--------------------\nUnsorted array:");
        Sorting.printArray(invB);
        System.out.println("Steps:\n--------------------");
        Sorting.bubbleSort(invB);
        System.out.println("--------------------\nSorted array: ");
        Sorting.printArray(invB);

        //Quick Sort----------------------------------------------------------------------
        //create array with 5 Inventory objects
        Inventory[] invQ = new Inventory[5];

        //create & initialize Inventory objects using constructor
        invQ[0] = new Inventory("Empanada", 1, 10);
        invQ[1] = new Inventory("Dumpling", 2, 20);
        invQ[2] = new Inventory("Cake", 3, 30);
        invQ[3] = new Inventory("Banana", 4, 40);
        invQ[4] = new Inventory("Apple", 5, 50);
        
        System.out.println("\nQuick Sort\n--------------------\nUnsorted array:");
        Sorting.printArray(invQ);
        System.out.println("Steps:\n--------------------");
        Sorting.quickSort(invQ);
        System.out.println("--------------------\nSorted array: ");
        Sorting.printArray(invQ);

        //Merge Sort----------------------------------------------------------------------
        //create array with 5 Inventory objects
        Inventory[] invM = new Inventory[5];

        //create & initialize Inventory objects using constructor
        invM[0] = new Inventory("Empanada", 1, 10);
        invM[1] = new Inventory("Dumpling", 2, 20);
        invM[2] = new Inventory("Cake", 3, 30);
        invM[3] = new Inventory("Banana", 4, 40);
        invM[4] = new Inventory("Apple", 5, 50);
        
        System.out.println("\nMerge Sort\n--------------------\nUnsorted array:");
        Sorting.printArray(invM);
        System.out.println("Steps:\n--------------------");
        Sorting.mergeSort(invM);
        System.out.println("--------------------\nSorted array: ");
        Sorting.printArray(invM);
    }
}
