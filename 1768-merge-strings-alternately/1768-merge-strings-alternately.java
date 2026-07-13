class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder(200);
        int i=0;
        int j=0;
        // String[] merge = new String[200];
        while(true){
            if(word1.length() != i){
                merge.append(word1.charAt(i));
                i++;
            }
            if(word2.length() != j){
                merge.append(word2.charAt(j));
                j++;
            }
            if((word1.length() == i) && word2.length() == j ){
                return merge.toString();
            }
        }
    }
}