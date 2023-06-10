function relate(Type, UID) {
    var isfriend= "<div style='color: blue'><i class='fa-solid fa-user-check'></i> Your Friend </div>";
    var request= "<div style='color: black'><i class='fa-solid fa-people-arrows'></i> Requested </div>";
    var isNotFriend= "<div style='color: black'><i class='fa-solid fa-user-check'></i> Stranger </div>";
    var friendstatus= document.getElementById('friendstatus');
    $.ajax({
        url: "/SocialNetworkIRCNV/Relation",
        type: "POST",
        data: {Type: Type, UID: UID },
        success: function (data) {
            if(data=== "null"){
                alert('Request Fail');
            }else{
                friendstatus.innerHTML= data;
            }

        },
        error: function (xhr) {
            console.log("?ã x?y ra l?i: ");
        }
    });
}

