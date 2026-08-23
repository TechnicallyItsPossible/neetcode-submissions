class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hs = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char chArray[] = strs[i].toCharArray();
            Arrays.sort(chArray);
            String sortedS=new String(chArray);
            hs.putIfAbsent(sortedS, new ArrayList<>());
            hs.get(sortedS).add(strs[i]);
        }
        return new ArrayList<>(hs.values());
    }
}
