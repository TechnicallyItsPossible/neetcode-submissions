class Solution {
    public boolean isAnagram(String s, String t) {
        char arrs[]=s.toCharArray();
        Arrays.sort(arrs);
        char arrt[]=t.toCharArray();
        Arrays.sort(arrt);
        if(arrs.length != arrt.length){
            return false;
        }
        for(int i=0; i< s.length(); i++){
            if(arrs[i] != arrt[i]){
                return false;
            }
        }
        return true;
    }
}
