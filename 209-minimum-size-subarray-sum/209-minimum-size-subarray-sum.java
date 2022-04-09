class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        //如果数组长度为空, 直接返回0
        if(nums.length==0) {
            return 0;
        }

        int ans = Integer.MAX_VALUE; //MAX_VALUE 全部大写
        //为了代码的简洁性, 保证第一次min一定会end-start+1的同时也方便之后ans和新的ans比较
        int start = 0;
        int end = 0;
        int sum = 0;
        while(end < nums.length) {
            sum += nums[end];
            while(sum >= s) {
                ans = Math.min(ans, end-start + 1);//这一步的注释在上面
                sum -= nums[start];
                start++;;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}