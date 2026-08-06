/**
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function(gain) {

    let height=0;
    let maxheight=0;

    for(i=0;i<gain.length;i++){
        height+=gain[i];
        
        maxheight=Math.max(height,maxheight)
    
    }
    return maxheight;
    
};