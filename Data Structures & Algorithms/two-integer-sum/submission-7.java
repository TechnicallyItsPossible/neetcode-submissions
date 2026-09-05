class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs=new HashMap <>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(hs.containsKey(diff) && (hs.get(diff)!=i)){
                return new int[]{i, hs.get(diff)};
            }
        }
        return ans;
    }
}
