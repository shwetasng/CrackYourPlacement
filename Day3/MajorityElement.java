package Day3;

// Solution-1: Brute Force
class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0; j<n;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
                if(count>(n/2)){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}

// Solution-2: Using the concept of Hashing
class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;

        // Iterate through the array
        for (int num : nums) {
            // Update the count for each element
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            
            // Check if the current element is the majority element
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }
}

// Solution-3: Optimal Solution- Using Moore's Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        // Using Moore's Voting Algorithm
       int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }

        return candidate;
    }
}
