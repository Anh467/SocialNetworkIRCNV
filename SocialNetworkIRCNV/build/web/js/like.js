/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function like(ObejectID, Type){
    var obeject= document.getElementById(ObejectID);
    $.ajax({
        url: "/SocialNetworkIRCNV/LikeObject",
        type: "POST",
        data: {ObejectID: ObejectID, Type: Type},
        success: function (data) {
            if(data===null){
                alert("you must login to interface with social media");
            }else{
                obeject.innerHTML= data;
            }
            
        },
        error: function (xhr) {
            console.log("?ã x?y ra l?i: ");
        }
    });
}