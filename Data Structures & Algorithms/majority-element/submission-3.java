class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int k=0;
        int max=0;
        for(int i:map.keySet()){
            if (max < map.get(i)) {
                max = map.get(i);
                k = i;
            }
        }
        return k;
    }
}