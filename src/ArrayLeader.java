import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {
        public static ArrayList<Integer> leaders(int[] arr) {
            // code here
            ArrayList<Integer> leader = new ArrayList<>();

            int n = arr.length;
            leader.add(arr[n-1]);
            int max = arr[n-1];

            for(int i = n-2; i>=0 ; i--){
                if(max <= arr[i]){
                    leader.add(arr[i]);
                    max = arr[i];
                }
            }


            int start = 0;
            int end = leader.size()-1;

            while(start <= end){

                Collections.swap(leader, start, end);
                start ++;
                end --;
            }

            return leader;

        }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        leaders(arr);
    }

}
