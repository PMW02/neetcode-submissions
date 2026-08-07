class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int y=s.length()-1;
        int x=0;
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
