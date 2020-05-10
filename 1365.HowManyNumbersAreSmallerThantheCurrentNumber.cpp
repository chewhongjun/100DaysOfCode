class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> sorted = nums;
        vector<int> soln;
        
        sort(sorted.begin(),sorted.end());
        
        for(int num:nums){
            int index = lower_bound(sorted.begin(),sorted.end(),num)-sorted.begin();
            soln.push_back(index);
        }
        return soln;
    }
};
