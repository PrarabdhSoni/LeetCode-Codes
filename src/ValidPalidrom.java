import java.lang.Character;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class ValidPalidrom {

        public static boolean isPalindrome(String s) {

            int start = 0;
            int end = s.length() -1;

            while(start <= end){
                char ch1 = s.charAt(start);
                char ch2 = s.charAt(end);

                if(!(Character.isLetterOrDigit(ch1))){
                    start ++;
                    continue;
                }

                if(!(Character.isLetterOrDigit(ch2))){
                    end --;
                    continue;
                }

                if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2)){
                    return false;
                }

                start ++;
                end --;

            }

            return true;

        }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
