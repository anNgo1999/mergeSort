import java.util.Scanner;
public class Runner {

    public static void main(String[] args)
    {
        //Initialize scanner
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a size for the array: ");
        int arraySize = scn.nextInt();
        System.out.println("Generating array with size " + arraySize + " to sort using Merge Sort");

        System.out.println("\nUnsorted Array: ");
        mergeSort sortAlgo = new mergeSort(arraySize);
        sortAlgo.printArray();

        System.out.println("\nSorted Array: ");
        sortAlgo.sort(0,arraySize-1);
        sortAlgo.printArray();
    }
}
