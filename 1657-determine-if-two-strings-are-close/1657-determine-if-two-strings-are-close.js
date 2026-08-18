var closeStrings = function(word1, word2) {

    if(word1.length != word2.length){
        return false;
    }

    let map1 = {};
    let map2 = {};

    let i = 0;

    while(i < word1.length){
        map1[word1[i]] = (map1[word1[i]] || 0) + 1;
        map2[word2[i]] = (map2[word2[i]] || 0) + 1;
        i++;
    }

    if(Object.keys(map1).sort().join() != Object.keys(map2).sort().join()){
        return false;
    }

    let a = Object.values(map1).sort();
    let b = Object.values(map2).sort();

    i = 0;

    while(i < a.length){
        if(a[i] != b[i]){
            return false;
        }
        i++;
    }

    return true;
};