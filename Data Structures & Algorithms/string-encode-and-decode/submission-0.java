class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String word: strs){
            sb.append(word.toString().length());
            sb.append("#");
            sb.append(word);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List <String>decodedList = new ArrayList();
        String wordLimit = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != '#'){
                wordLimit = wordLimit + Character.toString(str.charAt(i));
            }
            else{
                int j = Integer.parseInt(wordLimit);
                String word = "";
                for(int k=i+1;k<i+j+1;k++){
                    word = word + Character.toString(str.charAt(k));
                }
                decodedList.add(word);
                i=i+j;
                wordLimit = "";
            }
        }
        return decodedList;
    }
}
