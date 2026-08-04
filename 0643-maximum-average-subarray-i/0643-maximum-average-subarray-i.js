/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {
   let sum=0;

   for(i=0;i<k;i++){
    sum+=nums[i]
   }  
   maxsum=sum;
   
   for(i=k; i<nums.length ;i++){
    sum+= nums[i]-nums[i-k]
    maxsum=Math.max(maxsum,sum)
   }
     return maxsum/k;
   }
    



