class Solution:
        def twoSum(self, nums: List[int], target: int) -> List[int]:
            # Creates a hashmap
            # {Key:Value} keys are the numbers from the list, value is the position
            dictOfNum = {nums[i]:i for i in range(0,len(nums))}
                for num in nums:
                # the Dictionary.get() function returns the value
                    if(dictOfNum.get((target-num)) and nums.index(num)!=dictOfNum.get(target-num)):
                        return[nums.index(num),dictOfNum.get(target-num)]
                        
            #this is a 1 pass solution however this is not the best solution
            #The current solution follows an O(N) complexity, 
            #That being said the best way to have done this is through the enumerate method which can be called on the list
