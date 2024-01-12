function val(){
var name=document.getElementById("uname").value;
var pass=document.getElementById("pass").value;
if(name=="Admin" && pass=="Reset@123")
{
    swal("hello "+name," ","success");
}
else{
    swal("username or password invalid"," ","error");
}
}