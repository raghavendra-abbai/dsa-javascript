var uniqueOccurrences = function(arr) {
    let map = {};

    for (let i = 0; i < arr.length; i++) {
        if (!map[arr[i]]) {
            map[arr[i]] = 1;
        } else {
            map[arr[i]]++;
        }
    }

    let values = Object.values(map);

    return new Set(values).size === values.length;
};