// https://leetcode.com/problems/jewels-and-stones/

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

//    First Code with high complexity of O(n*n)

//    public int numJewelsInStones(String jewels, String stones) {
//        char[] jewelsArray = jewels.toCharArray();
//        char[] stonesArray = stones.toCharArray();
//
//        int count = 0;
//
//        for(char jewel : jewelsArray){
//
//            for(char stone : stonesArray){
//
//                if(jewel == stone){
//                    count ++;
//                }
//            }
//        }
//
//        return count;
//    }

    public static int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewel = new HashSet<>();

        for (char j : jewels.toCharArray()){
            jewel.add(j);
        }

        int count = 0;

        for (char s : stones.toCharArray()){
            if(jewel.contains(s)){
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "hdhhdAhdafhajdjAA"));
    }
}
