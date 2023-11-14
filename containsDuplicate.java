import java.util.HashSet;

public class containsDuplicate{
        public static void main(String[] args) {
            int [] array = {3,4,2,1,1,5};
           
            System.out.println(checkDuplicate(array));
        }
           public static boolean checkDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i: nums){
            if(hs.contains(i)){
                return true;
            }

            hs.add(i);
        }


        return false;



    }
}