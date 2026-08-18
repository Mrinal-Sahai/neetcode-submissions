class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product= Arrays.stream(nums).filter(n->n!=0).reduce(1,(a,b)-> a*b);
        long zeroCount = Arrays.stream(nums)
                .filter(n -> n == 0)
                .count();

        if (zeroCount >= 2) {
            return new int[nums.length];
        }

        if(zeroCount==1)
        {
            int zeroIndex= IntStream.range(0,nums.length)
            .filter(i-> nums[i]==0)
            .findFirst()
            .getAsInt();

            int arr[]=new int[nums.length];
            arr[zeroIndex]=product;
            return arr;
        }

        return Arrays.stream(nums)
        .map(n-> product/n)
        .toArray();

        
    }
}  
