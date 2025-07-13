//Implement a program that checks
//whether a given word or phrase is a palindrome. A
//palindrome is a word or phrase that reads the
//same forwards and backward, ignoring spaces and
//punctuation.
public class PalindromeChecker {
    public static void main(String[] args) {
        String word = "madam";
        System.out.println(isPalindrome(word));


    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left += 1;
            right -=1;
        }
        return true;

    }
}
