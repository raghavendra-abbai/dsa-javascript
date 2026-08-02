/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let i = 0;
    let j = height.length - 1;
    let maxWater = 0;

    while (i < j) {
        let width = j - i;
        let h = Math.min(height[i], height[j]);
        let currentWater = width * h;

        maxWater = Math.max(maxWater, currentWater);

        if (height[i] < height[j]) {
            i++;
        } else {
            j--;
        }
    }

    return maxWater;
};