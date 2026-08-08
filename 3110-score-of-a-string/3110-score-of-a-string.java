class Solution {
    public int scoreOfString(String s) {
        int sum = 0;

        for(int i=0;i<s.length()-1;i++){
            int c1 =(int) s.charAt(i);
            int c2 = (int) s.charAt(i+1);
            int diff = (c1-c2);
            if(diff < 0) diff = -diff;
            sum += diff;
        }
        return sum;
    }
}