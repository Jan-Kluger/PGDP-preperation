import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class Pgdp_prep {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = str.length(); // length
        char charAtPosition = str.charAt(0); // character at a specific position
        String substring = str.substring(1, 5); // substring

        int[][] matrix = new int[3][3]; // 3x3 matrix


        //Sets in java
        Integer[] array = {1, 2, 3, 3, 4, 5, 5, 6};

        // Converting array to set
        Set<Integer> set = new HashSet<>();
        for (Integer element : array) {
            set.add(element);
        }

        // Getting the size of the set
        int setSize = set.size();
        System.out.println("Number of unique elements in the set: " + setSize);
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while(start < end) {
            // swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // move start and end closer together
            start++;
            end--;

            try {
                System.out.println("Test code here");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

    public static int findElement(int[] array, int element) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) {
                return i; // element found at index i
            }
        }
        return -1; // element not found
    }

    public static void bubbleSort(int[] array) {
        boolean swapped;
        for(int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void sumAndAverage(int[] array) {
        int sum = 0;
        for(int num : array) {
            sum += num;
        }
        double average = (array.length > 0) ? (double)sum / array.length : 0;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }

    public static boolean contains(int[] array, int value) {
        for(int num : array) {
            if(num == value) {
                return true;
            }
        }
        return false;
    }

    public static int[] concatenate(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    public static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        return copy;
    }

    public static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void countElements(int[] array) {
        boolean[] counted = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            // skip if element is already counted
            if (counted[i]) {
                continue;
            }

            int count = 1; // initialize count
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counted[j] = true; // mark as counted
                    count++;
                }
            }

            System.out.println("Element: " + array[i] + ", Count: " + count);
        }
    }



    //Search algorithms, maybe useful??

    public static int linearSearch(int[] array, int element) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] sortedArray, int element) {
        int left = 0, right = sortedArray.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(sortedArray[mid] == element) return mid;
            if(sortedArray[mid] < element) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    //Basic structures

//    switch (variable) { (Also use arrows? "->")
//        case value1:
//            // Code for case value1
//            break;
//        case value2:
//            // Code for case value2
//            break;
//        default:
//            // Code for default case
//    }

    //Hash map

//    Map<KeyType, ValueType> map = new HashMap<>();
//    map.put(key, value); // Adding a key-value pair
//    ValueType value = map.get(key); // Getting a value by key

    // Array to string
    int[] intArray = {1, 2, 3};
    String intArrayString = Arrays.toString(intArray);

    String[] stringArray = {"Hello", "World"};
    String stringArrayString = Arrays.toString(stringArray);

    //string to int
    String numberString = "123";
    int number = Integer.parseInt(numberString);

    // int to string
    int number = 123;
    String numberString = String.valueOf(number);

    //char array to string
    char[] charArray = {'H', 'e', 'l', 'l', 'o'};
    String str = new String(charArray);

    //string to char-array
    String str = "Hello";
    char[] charArray = str.toCharArray();

    //Good extensions to know

//    String Methods:
//              .length(): Returns the length of a string.
//              .charAt(index): Returns the character at the specified index.
//              .substring(beginIndex, endIndex): Returns a substring.
//              .equals(anotherString): Compares two strings for content equality.
//              .equalsIgnoreCase(anotherString): Compares two strings, ignoring case considerations.
//              .contains(sequence): Checks if the string contains the specified sequence of characters.
//              .indexOf(str): Returns the index of the first occurrence of the specified substring.
//              .toLowerCase(): Converts all characters in the string to lower case.
//              .toUpperCase(): Converts all characters in the string to upper case.
//              .trim(): Removes whitespace from both ends of the string.
//              .split(): Convert string to array of words (like python .split()) ("\\s+" for whitespace characters)
//    Array Methods:
//              .length: For arrays (not a method), it returns the length of the array.
//    Set Methods (java.util.Set):
//              .add(element): Adds the specified element to the set if it is not already present.
//              .remove(element): Removes the specified element from the set if it is present.
//              .contains(element): Returns true if the set contains the specified element.
//    StringBuilder Methods:
//              .append(data): Appends the specified data to the string builder.
//              .toString(): Converts the string builder to a String.
//              .length(): Returns the length (character count).
//              .insert(offset, data): Inserts data at the specified position.
//              .delete(start, end): Removes the characters in a substring of this sequence.
//    Math Class Methods (java.lang.Math):
//              Math.abs(number): Returns the absolute value.
//              Math.max(a, b): Returns the greater of two values.
//              Math.min(a, b): Returns the smaller of two values.
//              Math.sqrt(number): Returns the correctly rounded positive square root.
//              Math.pow(a, b): Returns the value of a raised to the power of b.

}
