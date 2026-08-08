/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[][]}
 */
var findDifference = function(nums1, nums2) {
    let arr1 = nums1.filter(num => !nums2.includes(num));
    let arr2 = nums2.filter(num => !nums1.includes(num));

    return [
        [...new Set(arr1)],
        [...new Set(arr2)]
    ];
};