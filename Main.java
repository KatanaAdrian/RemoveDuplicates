/*
 The first step of this problem is to sort the array in ascending order and then to verify if two consecutive
 numbers are equal.
 If it happens to be equal than the duplicate element is deleted by moving the elements from the right of that
 particular element with a position to the left.
 For the sorting I choose to use Quick Sort because it doesn't use any extra data structures and it has the
 time complexity of O(nLogn) in the Average Case.

 input data:  array's values: {1, 14, 7, 9, 30, 14, 7}
 output data: 1 7 9 14 30.
 */

/**
 * Remove duplicates from an array of positive integers without using any extra data structures.
 *
 * @author Adrian Katana
 */
public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 14, 7, 9, 30, 14, 7}; //input data

        //Create a new object of type QuickSort and calls the sort method.

        QuickSort sort = new QuickSort();
        sort.sort(arr, 0, arr.length - 1);

        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] == arr[i + 1]) {         //Checks if two consecutive elements are equal.
                for (int j = i + 1; j < length - 1; j++) {
                    arr[j] = arr[j + 1];        //Deletes the duplicate element.
                }
                length--;                       //Subtracts the array's length after an element was deleted.
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");     //Displays the final array.
        }
    }
}
