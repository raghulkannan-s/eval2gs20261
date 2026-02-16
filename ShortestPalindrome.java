


public class ShortestPalindrome {
    
    public static void main(String[] args) {
        
        String input = "";
        System.out.println(solve(input));
    }

    public static String solve(String s){

        

        return "";
    }


}



// Shortest Palindrome
// You are given a string s. You need to construct the shortest palindrome that can be formed by adding characters only in front of s. Return the resulting shortest palindrome.


// Your goal is to find the longest palindromic prefix of s. Once found, prepend the reverse of the remaining suffix to the front, yielding the shortest possible palindrome.


// Rules & Constraints:

// 1 ≤ s.length ≤ 5 * 10^4
// s consists of lowercase English letters.
// You may only add characters to the front of s; no changes inside s are allowed.

// Example 1:

// Input: s = "aacecaaa"

// Output: "aaacecaaa"

// Explanation: The longest palindromic prefix is "aacecaa". Add the remaining suffix's reverse ("a") to the front.


// Example 2:

// Input: s = "abcd"
// Output: "dcbabcd"

// Explanation: The longest palindromic prefix is "a". Prepend the reverse of "bcd" to form the shortest palindrome.


// Example 3:

// Input: s = "race"

// Output: "ecarace"

// Explanation: Longest palindromic prefix is "r". Add reverse of "ace" in front.


// Expected Time Complexity: O(N), where N is the length of s (using prefix-function / KMP-style or rolling-hash approaches).

// Expected Space Complexity: O(N) for auxiliary arrays (or O(1) with certain rolling-hash implementations).