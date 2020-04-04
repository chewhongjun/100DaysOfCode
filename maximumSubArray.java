class maximumSubArray{
    
    public static int maxSubArr(int[] nums){
        int max_til_now = 0;
        int max_sub_arr =0;

        for (int i=0;i<nums.length;i++){
            max_til_now += nums[i];
            if (max_til_now < 0){
                max_til_now = 0;
            }
            if(max_sub_arr<max_til_now){
                max_sub_arr = max_til_now;
            }
        }
        return max_sub_arr;
    }

    /*
    int max = Integer.MIN_VALUE, sum = 0;
    for(int i = 0; i < nums.length; i++){
        sum += nums[i];
        if(sum > max)
            max = sum;
        if(sum < 0)
            sum = 0;
    }
    return max;



    int max = Integer.MIN_VALUE, sum = 0;
    for(int i = 0; i < nums.length; i++){
            max = Math.max(sum+=nums[i], max);
            sum = Math.max(sum, 0);
    }
    return max;
    */


    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArr(nums));
    }
}