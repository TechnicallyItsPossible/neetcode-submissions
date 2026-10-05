class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> freq= new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        ArrayList <Integer>[] bucket = new ArrayList[nums.length+1];

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            if(bucket[count]==null){
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(num);
        }

        int index = 0;
        int result []= new int[k];
        for(int i=bucket.length-1; i>=0; i--){
            if(bucket[i]== null){
                continue;
            }

            for(int ele: bucket[i]){

                result[index] = ele;
                index++;
                if(index == k ){
                    return result;
                }
            }
        }
        return result;
    }
}
