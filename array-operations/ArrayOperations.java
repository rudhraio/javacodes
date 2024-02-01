import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class ArrayOperations{
    public static void main(String args[]){
        System.out.println("##################################");
        System.out.println("--------Array Operations----------");
        System.out.println("##################################");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        int[] arrayNumbers = new int[arraySize];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < arraySize; i++){
            arrayNumbers[i] = scanner.nextInt();
        };
        Arrays.sort(arrayNumbers);
        System.out.println("Sorted Array: " + Arrays.toString(arrayNumbers));
        System.out.println("Length of Array: " + arrayNumbers.length);

        // Taking ArrayList input from the user
        ArrayList<Integer> arrayListNumbers = new ArrayList<>();
        System.out.print("Enter the size of the ArrayList: ");
        int arrayListSize = scanner.nextInt();

        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < arrayListSize; i++) {
            arrayListNumbers.add(scanner.nextInt());
        }
        System.out.println("ArrayList: " + arrayListNumbers);

        // Accessing Elements in ArrayList
        System.out.print("\nEnter the index to retrieve from the ArrayList: ");
        int indexToRetrieve = scanner.nextInt();
        if (indexToRetrieve >= 0 && indexToRetrieve < arrayListNumbers.size()) {
            int retrievedNumber = arrayListNumbers.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedNumber);
        } else {
            System.out.println("Invalid index.");
        }

        // Updating Elements in ArrayList
        System.out.print("\nEnter the index to update in the ArrayList: ");
        int indexToUpdate = scanner.nextInt();
        if (indexToUpdate >= 0 && indexToUpdate < arrayListNumbers.size()) {
            System.out.print("Enter the new value: ");
            int newValue = scanner.nextInt();
            arrayListNumbers.set(indexToUpdate, newValue);
            System.out.println("Updated ArrayList: " + arrayListNumbers);
        } else {
            System.out.println("Invalid index.");
        }

        // Removing Elements from ArrayList
        System.out.print("\nEnter the index to remove from the ArrayList: ");
        int indexToRemove = scanner.nextInt();
        if (indexToRemove >= 0 && indexToRemove < arrayListNumbers.size()) {
            arrayListNumbers.remove(indexToRemove);
            System.out.println("Updated ArrayList after removal: " + arrayListNumbers);
        } else {
            System.out.println("Invalid index.");
        }


        // List (using ArrayList)
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("List of Strings: " + stringList);


scanner.close();
    }
}