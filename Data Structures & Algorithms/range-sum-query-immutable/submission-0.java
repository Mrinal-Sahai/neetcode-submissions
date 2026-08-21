class NumArray {
    private final int nums[];

    public NumArray(int[] nums) {
        this.nums=nums;
        
    }
    
    public int sumRange(int left, int right) {
        return  IntStream.range(left,right+1).map(i->nums[i]).sum();
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */