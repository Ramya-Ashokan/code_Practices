/*//Array

let myarr=[1,2,3,4,5];
for(let i=0;i<5;i++)
{
    console.log(myarr[i]);
}
//function
function greet(fname,lname){
    console.log("hi hello "+fname+" "+lname);
}
greet('Ramya');//one value accepted secon var undefined
greet('Ramya','Yamini');
//alert
//let  age=10;
let age=prompt('Enter the age');
if(age<18)
{
    alert("not eligible to vote");
}
else{
    alert("eligible to vote");
}
confirm('exit the window');*/
function display()
{
    var name=document.getElementById("uname").value;
    alert(" hello "+name);
}