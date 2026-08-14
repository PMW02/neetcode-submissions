class Solution {
    public void reverseString(char[] s) {
        int a=0;
        int b=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char temp=s[a];
            s[a]=s[b];
            s[b]=temp;
            a++;
            b--;
        }
        System.out.println(Arrays.toString(s));
    }
}