class Solution {
    public int numSubseq(int[] nums, int target) {
         Arrays.sort(nums);
         int mod=1000000007;
         int i=0,j=nums.length-1;
         long sum=0;
         int[] pow=new int[nums.length];
         pow[0]=1;
         for(int k=1;k<nums.length;k++){
            pow[k]=(pow[k-1]*2)%mod;
         }
         while(i<=j){
            if(nums[i]+nums[j]<=target){
                // sum+=Math.pow(2,j-i);
                sum=(sum+pow[j-i])%mod;
                i++;
            }
            else{
                if(nums[j]+nums[j]<=target){
                    sum+=1;
                }
                j--;
            }
         }
         return (int)sum;
    }
}