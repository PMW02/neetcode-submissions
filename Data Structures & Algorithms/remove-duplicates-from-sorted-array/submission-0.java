class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}