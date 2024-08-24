package Day12;

public class SearchRotatedSortedArray {

        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                // Check if the mid element is the target
                if (nums[mid] == target) {
                    return mid;
                }
    
                // Determine which part is sorted
                if (nums[left] <= nums[mid]) {
                    // Left part is sorted
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1; // Target is in the left part
                    } else {
                        left = mid + 1; // Target is in the right part
                    }
                } else {
                    // Right part is sorted
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1; // Target is in the right part
                    } else {
                        right = mid - 1; // Target is in the left part
                    }
                }
            }
    
            // If the target was not found
            return -1;
        }
    
        public static void main(String[] args) {
            SearchRotatedSortedArray solution = new SearchRotatedSortedArray();
            
            // Example usage
            int[] nums = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;
            int result = solution.search(nums, target);
            System.out.println("Index of " + target + ": " + result);
            
            target = 3;
            result = solution.search(nums, target);
            System.out.println("Index of " + target + ": " + result);
        }
    }
   
