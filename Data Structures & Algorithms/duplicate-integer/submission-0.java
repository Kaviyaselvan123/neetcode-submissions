class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0){
            return false;
        }
        HashSet<Integer> a=new HashSet<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(a.contains(nums[i])){
                c++;
            }else{
                a.add(nums[i]);
            }
        }
        return c>0?true:false;
    }
}