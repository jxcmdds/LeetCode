class Solution {
    public int search(int[] nums, int target) {
        //首先判断数组是否为空 和 数组长度是否为0
        if(nums == null || nums.length == 0) {
            return -1;
        }

        // 有序数组 无重复 可二分法
        int left = 0;
        int right = nums.length -1;
        
        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]==target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } return -1;
    }
}