package Day2;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // first declare resulting set
        List<Integer> resultSet = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int index= Math.abs(nums[i])-1;
            // check if the value of the index is negative
            if(nums[index]<0){
                resultSet.add(index+1);
            }
        // mark the value at this index as negative stating it is already visited
        nums[index]=nums[index]*-1;
        }
        return resultSet;
    }
}
