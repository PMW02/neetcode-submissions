class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        // if(s1.length!=s2.length){
        //     return false;
        // }
        for(int i=0;i<s1.length;i++){
            map.put(s1[i],map.getOrDefault(s1[i],0)+1);
        }

        for(int i=0;i<s2.length;i++){
            map1.put(s2[i],map1.getOrDefault(s2[i],0)+1);
        }
    return map.equals(map1);
    }
}
