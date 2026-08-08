class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];//7-3=4
            if(map.containsKey(res)){//false
                return new int[]{map.get(res),i};
            }else{
                map.put(nums[i],i);//3,0
            }
        }
        return new int[]{0,0};
    }
}
