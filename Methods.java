public class Methods {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] arrDup = {1, 1, 2, 2, 3, 4, 5, 5, 6};
    
            // Test calculateSumAndAverage()
            double[] result = calculateSumAndAverage(arr);
            System.out.println("Use calculateSumAndAverage() to produce the elements of the arrays sum and average");
            System.out.println("Sum: " + result[0]);
            System.out.println("Average: " + result[1]);
            System.out.println();
    
            // Test incrementAndPrintArray()
            System.out.println("Use incrementAndPrintArray() to increment every element of the array by one and print the incremented array");
            incrementAndPrintArray(arr);
            System.out.println();
    
            // Test processArray()
            System.out.println("Use processArray() to calculate the squares and cubes of the elements in the array and print the results");
            processArray(arr);
            System.out.println();
    
            // Test findMaxAndPrintIndex()
            System.out.println("Use fincleardMaxAndPrintIndex() to find the largest element in the array and print its index");
            findMaxAndPrintIndex(arr);
            System.out.println();
    
            // Test checkArrayForElement()
            int valueToFind = 5;
            System.out.println("Use checkArrayForElement() to search for the element " + valueToFind + " in the array and print its index");
            checkArrayForElement(arr, valueToFind);
            System.out.println();
    
            // Test sortAndPrintArray()
            System.out.println("Use sortAndPrintArray() to sort the array in ascending order and print the sorted array");
            sortAndPrintArray(arr, "ASC");
            System.out.println();
    
            // Test countOddEvenNumbers()
            System.out.println("Use countOddEvenNumbers() to count the number of odd and even numbers in the array");
            countOddEvenNumbers(arr);
            System.out.println();
    
            // Test printRepeatedNumbersWithFrequency()
            System.out.println("Use printRepeatedNumbersWithFrequency() to print the repeated numbers in the array with their frequency");
            printRepeatedNumbersWithFrequency(arrDup);
            System.out.println();
    
            // Test mergeSortedArrays()
            int[] arr1 = {1, 3, 5, 7, 9};
            int[] arr2 = {2, 4, 6, 8, 10};
            System.out.println("Use mergeSortedArrays() to merge two sorted arrays and print the merged array");
            int[] mergedArray = mergeSortedArrays(arr1, arr2);
            for (int num : mergedArray) {
                System.out.print(num + ",");
            }
            System.out.println();
            System.out.println();
    
            // Test insertElement()
            int[] array = {1, 2, 3, 4, 5};
            int element = 10;
            int position = 2;
            System.out.println("Use insertElement() to insert " + element + " at position " + position + " in the array and print the new array");
            int[] newArray = insertElement(array, element, position);
            for (int num : newArray) {
                System.out.print(num + ",");
            }
            System.out.println();
            System.out.println();
    
            // Test deleteElement()
            int deleteElement = 3;
            System.out.println("Use deleteElement() to delete " + deleteElement + " from the array and print the new array");
            int[] updatedArray = deleteElement(array, deleteElement);
            for (int num : updatedArray) {
                System.out.print(num + ",");
            }
            System.out.println();
        }


    /*Java array methods using logic instead of built in array methods*/
    
    //Java Method to Calculate Sum & Average of all elements of an integer Array size 10
    public static double[] calculateSumAndAverage(int[] arr) {
        int sum = 0;
        double average = 0.0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        if (arr.length > 0) {
            average = (double) sum / arr.length;
        }
        
        return new double[]{sum, average};
    }

    //Java Method to Increment Every Element of the Array by One & Print Incremented Array
    public static void incrementAndPrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Java Method to Input an Array, Store the Squares and cubes of these elements in new Arrays & Print those.
    public static void processArray(int[] numbers) {
        int[] squaredArray = new int[numbers.length];
        int[] cubedArray = new int[numbers.length];
    
        for (int i = 0; i < numbers.length; i++) {
            squaredArray[i] = numbers[i] * numbers[i];
            cubedArray[i] = numbers[i] * numbers[i] * numbers[i];
        }
    
        System.out.println("Squared Array:");
        for (int i = 0; i < squaredArray.length; i++) {
            System.out.print(squaredArray[i]);
            if (i != squaredArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    
        System.out.println("Cubed Array:");
        for (int i = 0; i < cubedArray.length; i++) {
            System.out.print(cubedArray[i]);
            if (i != cubedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    //Java Method that finds largest element present in an integer array. It must also print the location or index at which maximum element occurs in array.
    public static void findMaxAndPrintIndex(int[] array) {
        int maxIndex = 0;
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        System.out.println("The maximum value is " + maxValue + ", and it is found at index " + maxIndex + ".");
    }

    //Java Method to Read an Array and Search for an Element
    public static void checkArrayForElement(int[] array, int valueToFind) {
        if (array == null) {
            System.out.println("Array is null.");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToFind) {
                System.out.println("The value " + valueToFind + " is found at index " + i + ".");
                return;
            }
        }

        System.out.println("The value " + valueToFind + " is not found in the array.");
    }

    //Java Method to Sort the Array in an Ascending Order and Descending Orde
    public static void sortAndPrintArray(int[] array, String order) {
        if (!(order.equals("ASC") || order.equals("DESC"))) {
            System.out.println("Invalid order. Please use 'ASC' or 'DESC'.");
            return;
        }

        int[] sortedArray = array.clone();
        boolean swapped;

        for (int i = 0; i < sortedArray.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if ((order.equals("ASC") && sortedArray[j] > sortedArray[j + 1]) ||
                    (order.equals("DESC") && sortedArray[j] < sortedArray[j + 1])) {
                    // Swap sortedArray[j] and sortedArray[j + 1]
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        // Print sorted array
        System.out.print("Array sorted in " + order + " order: ");
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Java Method to Print the Number of Odd & Even Numbers in an Array
    public static void countOddEvenNumbers(int[] array) {

        int countOdd = 0, countEven = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("The array contains " + countEven + " even numbers and " + countOdd + " odd numbers.");
    }

    //Java Method to Print All the Repeated Numbers with Frequency in an Array
    public static void printRepeatedNumbersWithFrequency(int[] array) {
        int[] frequency = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequency[i]++;
                    // Mark as visited
                    array[j] = Integer.MIN_VALUE;
                }
            }
        }

        // Print the frequency of each element
        for (int i = 0; i < frequency.length; i++) {
            if (array[i] != Integer.MIN_VALUE && frequency[i] > 1) {
                System.out.println("Number " + array[i] + " repeats " + frequency[i] + " times.");
            }
        }
    }

    //Java Method to Merge the Elements of 2 Sorted Array
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of array1, if any
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements of array2, if any
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    //Java Method to Insert an Element in a Specified Position in a given Array
    public static int[] insertElement(int[] array, int element, int position) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }
        if (position < 0 || position > array.length) {
            throw new IllegalArgumentException("Invalid position. Must be between 0 and array length (inclusive).");
        }

        // Create a new array with size one more than the original array
        int[] newArray = new int[array.length + 1];

        // Copy elements from original array to the new array
        // up to the position where the new element will be inserted
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element at the specified position
        newArray[position] = element;

        // Copy the rest of the elements from the original array to the new array
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        // Return the new array
        return newArray;
    }

    //
    public static int[] deleteElement(int[] array, int deleteElement) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        // Count elements that are not equal to deleteElement
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != deleteElement) {
                count++;
            }
        }

        // Create a new array with size of count
        int[] newArray = new int[count];

        // Copy elements from original array to the new array
        // that are not equal to deleteElement
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != deleteElement) {
                newArray[j++] = array[i];
            }
        }

        // Return the new array
        return newArray;
    }
}

