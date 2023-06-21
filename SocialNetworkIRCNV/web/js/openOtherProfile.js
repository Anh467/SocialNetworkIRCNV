/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function otherProfile(UID) {
    window.location.href = "/SocialNetworkIRCNV/PersonalPage/ProfileUser.jsp?UID=" + UID;
}
function openPost(PostID) {
    window.location.href = "/SocialNetworkIRCNV/post?PostID=" + PostID;
}
function openHref(URL) {
    window.location.href = URL;
}