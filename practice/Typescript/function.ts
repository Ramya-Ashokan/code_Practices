

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
console.log('----optional parameter------')
function myfunc(i:number,j?:any)
{
    console.log(i);
    console.log(j);
}
myfunc(10,6);
console.log('----rest parameter alais var arg---')
function myfun1(n1:number,n2?:number,...n3:any)
{
console.log(n1);
console.log(n2);
for(let i of n3)
{

}
}
let n1=10;
let n2=3;
let n3=[1,2,3];
myfun1(n1,n2,n3);
