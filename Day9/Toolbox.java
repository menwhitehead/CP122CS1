

public class Toolbox {

    // return true if the input integer is a prime
    // (only divisible by 1 and itself)
    // return false if not a prime
    public void isPrime(int n) {
        // Variable to store the count of all n's divisors
        int divisor_count = 0;

        // Use a loop to check for divisors of n
        for (int i = 0; i <= n; i++) {
            if (i % n == 0) {
                divisor_count = 1;
            }
        }

        // Only a single divisor was found,
        // so n must be prime
        if (divisor_count == 1) {
            return true;
        }

    }


    // Take as input a string
    // and then return the number of vowels found
    public int countVowels(string s) {
        int count;
        for (int i = 0; i < s.size(); i++) {
            if (s.charAt(i) == "a" || "e" || "i" || "o" || "u") {
                count++
            }
        }
    }


    // Take as input an array of integers
    // and reverse the order of the array
    public static reverseArray(int my_array) {
        for (i = 0; i < my_array.size(); i++); {
            my_array[i] = my_array[my_array.size() - i - 1];
        }
    }



    public void main(String[] args) {

        // Test the reverseArray method
        int[] test_array = {1, 2, 3, 4, 5};
        Toolbox.reverseArray();
        // Should print [5, 4, 3, 2, 1]
        Arrays.toString(test_array);


        // Test countVowels method
        String test_string = "I hope this WORKS!";
        // Should print "5 vowels found"
        System.out.println(countVowels(test_string), " vowels found.");


        // Test the isPrime method
        int n = 17;
        // Should print "Is 17 prime? true"
        System.out.println("Is 17 prime? " + isPrime(n));

    }

}