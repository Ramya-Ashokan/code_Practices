console.log('------in array print index---------');
var myArray = [1, 2, 3, 4, 5];
for (var j in myArray) {
    console.log(j);
}
console.log('------in array print values-> same as for each---------');
for (var _i = 0, myArray_1 = myArray; _i < myArray_1.length; _i++) {
    var k = myArray_1[_i];
    console.log(k);
}
console.log('---if we k of in array index it gives udefined  for last index --------');
for (var _a = 0, myArray_2 = myArray; _a < myArray_2.length; _a++) {
    var k = myArray_2[_a];
    console.log(myArray[k]);
}
