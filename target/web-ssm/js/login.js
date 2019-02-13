$(document).ready(function(){

	$("#loginBtn").click(function(){
		$.ajax({
             type: "POST",
             url: "/web-ssm/resource/user/loginJudge",
            
             data: {
            	 username:$("#nameText").val(),
            	 password:$("#pwdText").val()},
             dataType: "json",
             success: function(data){
             	if(data==true){
             		window.location.href = "/web-ssm/resource/customer/list";
             	}else if(data== false){
             		alert("账号密码错误");
             	}
             },
        	 error: function(XMLHttpRequest, textStatus, errorThrown){
                 alert(errorThrown);
             }
         });
	});
});

