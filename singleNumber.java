import java.util.HashMap;

class singleNumberSoln{
    
    // this is my own solution that is ranked at about the 40 percentile which is quite low
    public static int singleNumber(int[]nums){
        
        HashMap<Integer,Integer> numberCount = new HashMap<Integer,Integer>();
        for(Integer i : nums){
            
            if(numberCount.get(i)==null){
                numberCount.put(i, 0);
            }
            else{
                numberCount.remove(i);
            }
            for (Integer j: numberCount.keySet()){
                return j;
            }
        }
        return -1;
    }

    // this is one of the proposed solution that i find quite interesting
    //https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3283/discuss/558955/Java-100-runtime-No-Extra-Space-and-O(n)-complexity-using-XOR-with-explaination
    public static int singleNumberAlt(int[] nums){

        for(int i = 1; i<nums.length; i++){
            nums[0] = nums[0]^nums[i];
            System.out.println(nums[0]);
        }
        return nums[0];
        
    }


    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(1^2);
        System.out.println(singleNumber(nums));
        System.out.println(singleNumberAlt(nums));
    }
}