/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function reply(CmtID, name){
    var btn= document.getElementById('button-load-comment');
    var content = document.getElementById("NewPostTextarea");
    btn.setAttribute('onclick','loadComment(\''+CmtID+'\')');
    content.value= '@'+name+' '+ content.value;
}
function loadComment(id){
    //id có thể là PostID hoặc là CmtID tùy thuộc vào nó là comment hay commentChild
     var fileInput = document.querySelector('input[name="photo"]');
        var file = fileInput.files[0];
        var formData = new FormData();
        var content = document.getElementById("NewPostTextarea").value;
        var previewImage = document.getElementById('previewImage');
        formData.append('photo', file);
        formData.append('content', content);
        formData.append('id', id);
        //formData.append('PostID', PostID);
        $.ajax({
            url: "/SocialNetworkIRCNV/NewComment",
            type: "POST",
            processData: false,
            contentType: false,
            data: formData,
            success: function (data) {
                var row = document.getElementById('comment-'+id);
                row.innerHTML =  row.innerHTML+data ;
                previewImage.style = "display: none";
            },
            error: function (xhr) {
                console.log("?? x?y ra l?i: ");
            }
        });
}