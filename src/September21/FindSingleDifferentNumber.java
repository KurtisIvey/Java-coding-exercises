package September21;

public class FindSingleDifferentNumber {
    public static int findSingleDifferentNumber(int[] arr) {
        // Initialize a variable to store the result
        int result = 0;

        // Loop through the elements of the array
        for (int num : arr) {
            // XOR the current element with the result
            // This cancels out numbers that are the same
            // and leaves only the single different number
            result ^= num;
        }

        // Return the single different number
        return result;
    }
}

/*
alt, checks if first and second number in arr are the same. If so, return last index num. else return first num.
based on being less than or greater than

static int stray(int[] numbers) {
        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Check if the first two numbers are the same
        if (numbers[0] == numbers[1]) {
            // If they are the same, the stray number is the last number in the sorted array
            return numbers[numbers.length - 1];
        } else {
            // If the first two numbers are different, the stray number is the first number in the sorted array
            return numbers[0];
        }
    }
 */
