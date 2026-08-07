class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len=s.length();
        int x=0,y=len-1;
        while(x<y){
            if(s.charAt(x)!=s.charAt(y)){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
}
