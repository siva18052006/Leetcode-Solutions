class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int[] res=new int[2];
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
        return res;
    }
}