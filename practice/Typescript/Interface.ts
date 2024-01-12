interface student
{
    sid:number;
    sName:string;
    marks:number;
}
console.log('in typescript interface work like structure in funtion give interface name give all attributes in function  for interface')
function interfacefun(student:student)
{
    console.log("Student Details");
    console.log(student.sid+' '+student.sName+' '+student.marks);
}
let s={sid:101,sName:'ramya',marks:90};
interfacefun(s);