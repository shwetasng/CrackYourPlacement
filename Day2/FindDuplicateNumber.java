package Day2;

// SOLUTION-1--> This will not work efficiently for larger arrays bcx of time complexity
class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}


// SOLUTION-2--> LINKED LIST CYCLE DETECTION PROBLEM

class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];

        }while(slow!=fast);

        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}