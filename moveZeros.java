import java.util.Arrays;
class moveZeros{

    public static void f(int[] nums) {
        int index = 0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for(int j = index; j<nums.length; j++){
            nums[j] = 0;
        }        
    }

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,0,3,12};
        f(nums);
        System.out.println( Arrays.toString(nums));
    }

}