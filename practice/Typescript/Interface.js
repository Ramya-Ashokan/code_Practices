console.log('in typescript interface work like structure in funtion give interface name');
function interfacefun(student) {
    console.log("Student Details");
    console.log(student.sid + ' ' + student.sName + ' ' + student.marks);
}
var s = { sid: 101, sName: 'ramya', marks: 90 };
interfacefun(s);
