/*//function reverseArr(myarr:any)
//function reverseArr(myarr)
//function reverseArr(myarr:number)
//function reverseArr<T>(myarr:T[])
function reverseArr(i:number,j?:any)
{
    for(let i=myarr.length-1;i>=0;i--)
    {
        console.log(myarr[i]);
    }
}
let myarr=[1,2,3,4,5];
reverseArr(myarr);
let myarr1=['a','b','c'];
reverseArr(myarr1);*/
console.log('----optional parameter------');
function myfunc(i, j) {
    console.log(i);
    console.log(j);
}
myfunc(10, 6);
console.log('----rest parameter alais var arg---');
function myfun1(n1, n2) {
    var n3 = [];
    for (var _i = 2; _i < arguments.length; _i++) {
        n3[_i - 2] = arguments[_i];
    }
    console.log(n1);
    console.log(n2);
    for (var _a = 0, n3_1 = n3; _a < n3_1.length; _a++) {
        var i = n3_1[_a];
    }
}
var n1 = 10;
var n2 = 3;
var n3 = [1, 2, 3];
myfun1(n1, n2, n3);
