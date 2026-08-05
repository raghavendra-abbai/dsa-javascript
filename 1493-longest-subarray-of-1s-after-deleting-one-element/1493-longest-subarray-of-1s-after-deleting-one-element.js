/**
 * @param {number[]} nums
 * @return {number}
 */
var longestSubarray = function(nums) {

    let l=0;
    let r=0;
    let zeros=0;
   
   
   let  maxcount=0;
           

    for(r=0;r<nums.length;r++){
        if(nums[r]===0){
            zeros++;
        }
        while(zeros>1){
            if(nums[l]===0){
          zeros--;
            }
            l++
        }
        maxcount=Math.max(maxcount,r-l);
    }

    return maxcount;
    
    
};