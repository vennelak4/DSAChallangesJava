class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int j = 0;
        int count = 0;
        int prevCount = 0;
        while(j<= nums.length-1)
        {
            if(nums[j] == 1)
            {
                count++;

            }else{
                 if(prevCount < count)
                {
                    prevCount = count;
                }
                count = 0;
            }
            j++;
        }
        if(prevCount>count){
            return prevCount;
        }else{
            return count;
        }
    }
}