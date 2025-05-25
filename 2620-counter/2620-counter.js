/**
 * @param {number} n
 * @return {Function} counter
 */
var c;
var createCounter = function(n) {  
    return () => n++;
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */