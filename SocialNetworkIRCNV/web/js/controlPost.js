/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
function deletePost(PostID) {
    var post= document.getElementById(PostID);
    var postContain= document.getElementById("post");
    $.ajax({
        url: "/SocialNetworkIRCNV/DeletePost",
        type: "POST",
        data: {PostID: PostID},
        success: function (data) {
           post.setAttribute('style','display: none');
           postContain= data+ postContain;
        },
        error: function (xhr) {
            console.log("Đã xảy ra lỗi: ");
        }
    });
}

