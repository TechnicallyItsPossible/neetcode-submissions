class Solution {
    public int[] productExceptSelf(int[] nums) {

        int l=nums.length;
        int res[]=new int[l];

        //prefix
        res[0]= 1;
        for(int i=1;i<l;i++){
            res[i] = res[i-1] * nums[i-1];
        }

        //postfix

        int postfix = 1;
        for(int i=l-1;i>=0;i--){
            res[i] = postfix*res[i];
            postfix = postfix *nums[i];
        }
        return res;
    }
}  
