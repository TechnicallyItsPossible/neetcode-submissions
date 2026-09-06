class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String currWord= strs[i];
            char chArray[] = currWord.toCharArray();
            Arrays.sort(chArray);
            String sortedWord = new String(chArray);
            hm.computeIfAbsent(sortedWord, k-> new ArrayList<>()).add(currWord);
        }
        return new ArrayList<>(hm.values());
    }
}
