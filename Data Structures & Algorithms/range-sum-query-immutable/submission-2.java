class NumArray {
    private final int nums[];

    public NumArray(int[] nums) {
        int prefixSum[]=new int[nums.length+1];

         prefixSum[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }

    
        this.nums=prefixSum;
        
    }
    
    public int sumRange(int left, int right) {
        int leftSum=(left>0)?(nums[left-1]):0;
        return  nums[right+1]- nums[left];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */