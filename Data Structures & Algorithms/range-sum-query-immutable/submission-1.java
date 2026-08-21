class NumArray {
    private final int nums[];

    public NumArray(int[] nums) {
        int prefixSum[]=new int[nums.length];

         prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

    
        this.nums=prefixSum;
        
    }
    
    public int sumRange(int left, int right) {
        int leftSum=(left>0)?(nums[left-1]):0;
        return  nums[right]-leftSum;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */