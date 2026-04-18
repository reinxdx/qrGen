function generate(){
let text=document.getElementById("text").value;

document.getElementById("qrcode").innerHTML="";

new QRCode(document.getElementById("qrcode"),{
text:text,
width:200,
height:200
});
}
