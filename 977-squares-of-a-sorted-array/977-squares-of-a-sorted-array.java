class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int [nums.length];
        int index = result.length - 1;
        while(left <= right && index >=0) {
            int ansleft = nums[left] * nums[left];
            int ansright = nums[right] * nums[right];
            if( ansleft <= ansright) {
                result[index] = ansright;
                right--;
            } else {
                result[index] = ansleft;
                left++;
            }
            index--;
        }
        return result;
    }
}