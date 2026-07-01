class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0){
            return false;
        }
        HashSet<Integer> a=new HashSet<>();
        for(int n:nums){
            if(!a.add(n)){
                return true;
            }
        }
        return false;
    }
}