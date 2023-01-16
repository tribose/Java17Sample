package leetcode;

/*
There is a special keyboard with all keys in a single row.

You have given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25), initially your finger is at index 0. To type a character, you have to move your finger to the index of the desired character. The time taken to move your finger from index i to index j is |i – j|.

You want to type a string word. Write a program to calculate how much time it takes to type it with one finger.

Input :- Keyboard = "abcdefghijklmnopqrstuvwxyz", Word = "cba"
Output :- 4
 */
public class Problem3 {

    public int calTimeRequired(String keyboard, String word) {
        int beginIndex = 0, endIndex = 0, time = 0;

        for(int i = 0 ; i < word.length(); i++){
            endIndex = keyboard.indexOf(word.charAt(i));

            time += Math.abs(endIndex - beginIndex);
            beginIndex = endIndex;
        }
        return time;
    }

    public static void main(String[] args) {
        String keyboard = "pqrstuvwxyzabcdefghijklmno";
        String word = "hello";
        Problem3 problem3 = new Problem3();
        System.out.println(problem3.calTimeRequired(keyboard, word));
    }
}
