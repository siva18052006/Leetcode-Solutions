class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int res=Math.abs(nums[0]-nums[nums.length-1]);
        for(int i=0;i<nums.length-1;i++){
            int check=Math.abs(nums[i]-nums[i+1]);
            if(check>res){
                res=check;
            }
        }
        return res;
    }
}