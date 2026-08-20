class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);
        int current, maxValue=0;

        for ( int n : numSet)
        {
            if (!numSet.contains(n-1))
            {
                current=n;
                int count=1;
                while (numSet.contains(current+1))
                {
                    current++;
                    count++;
                }
                  maxValue=Math.max(maxValue,count);
            }
        }
        return maxValue;
    
        
    }
}
