class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
            for(int i=0; i<s.length(); i++){
                hms.put(s.charAt(i),(hms.getOrDefault(s.charAt(i),0)+1));
                hmt.put(t.charAt(i),(hmt.getOrDefault(t.charAt(i),0)+1));
            }

            return hmt.equals(hms);
    }
}
