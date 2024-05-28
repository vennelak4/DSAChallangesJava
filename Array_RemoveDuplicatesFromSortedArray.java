class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int i = 0;
        int j = 1;
        int count = 1;
        while(j<nums.length)
        {
            if(nums[j]>=nums[i])
            {
                if(nums[j]>nums[i])
                {
                    if(count>1 && i!=j){
                        i++;
                        count++;
                        nums[i]=nums[j];
                        j++;
                    }else{
                        i++;
                        j++;
                        count++;
                    }
                }else{
                    while(true){
                       j++; 
                       if(j == nums.length || nums[j]>nums[i])
                       {
                        break;
                       }
                    }
                    if(j< nums.length && nums[j]>nums[i]){
                            i++;
                            count++;
                            nums[i]=nums[j];
                            j++;
                       }
                }
            }
        }
        return count;
    }
}