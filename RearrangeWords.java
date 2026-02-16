

public class RearrangeWords{

    public static void main(String[] args) {
        String i1 = "Leetcode makes me happy";
        String i2 = "Keep calm and carry on";
        String i3 = "To be or not to be";
        System.out.println(rearrange(i2));
    }

    public static String rearrange(String s){

        s = s.toLowerCase();
        String[] words = s.split(" ");

        sorter(words);
        words[0] = ""+ Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
        StringBuilder res = new StringBuilder();
        
        for( String w : words ){
            res.append(w);
            res.append(" ");
        }
        return res.toString();

    }

    public static void sorter(String[] a){
        for( int i = 0; i < a.length - 1; i++ ){
            for( int j = 0; j < a.length - i - 1; j++ ){
                if( a[j].length() > a[j+1].length() ){
                    swap(a, j, j+1);
                }
            }
        }
    }

    public static void swap( String[] arr, int left, int right ){
        String temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


}



// Rearrange Words in a Sentence
// Given a sentence of words separated by spaces, you need to rearrange the words in the sentence such that the words are sorted by their length in ascending order. If multiple words have the same length, their relative order in the original sentence should be preserved.


// Your task is to return the rearranged sentence with exactly one space between each word, and the first word should be capitalized.


// Rules & Constraints:

// sentence contains only lowercase and uppercase English letters and spaces.
// There is exactly one space between two consecutive words.
// All words in sentence have the same case (either all lowercase or first word capitalized).
// The length of sentence is in the range [1, 10^5].
// Words in sentence have lengths in the range [1, 10^4].

// Example 1:

// Input: sentence = "Leetcode makes me happy"

// Output: "Me makes happy leetcode"

// Explanation: Words sorted by length: "Me" (2), "makes" (5), "happy" (5), "leetcode" (8). Words with the same length maintain their original relative order.


// Example 2:

// Input: sentence = "Keep calm and carry on"

// Output: "On and keep calm carry"

// Explanation: Words sorted by length: "On" (2), "and" (3), "keep" (4), "calm" (4), "carry" (5). Words maintain their relative order within the same length group.


// Example 3:

// Input: sentence = "To be or not to be"

// Output: "To be or to be not"

// Explanation: Words sorted by length: "To" (2), "be" (2), "or" (2), "to" (2), "be" (2), "not" (3). All words of length 2 maintain their original order, followed by "not".


// Expected Time Complexity: O(N log N), where N is the number of words in the sentence.

// Expected Space Complexity: O(N) for storing the words and result.