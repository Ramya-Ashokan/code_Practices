console.log('------in array print index---------')
let myArray=[1,2,3,4,5];
for(let j in myArray)
{
    console.log(j);
}

console.log('------of array print values-> same as for each---------')
for(let k of myArray)
{
    console.log(k);
  
}
console.log('---if we k of in array index it gives udefined  for last index --------')
for(let k of myArray)
{
    
    console.log(myArray[k]);
}