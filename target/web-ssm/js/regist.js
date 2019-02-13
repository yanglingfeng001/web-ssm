
$(document).ready(function(){
	
	$("#regBtn").click(function(){
		
		$.ajax({
             type: "POST",
             url: "/web-ssm/resource/user/registJudge",
             data: {
            	 username:$("#regNameText").val(), 
            	 password:$("#regpwdText").val()
           	 },
             dataType: "json",
             success: function(data){
             	if(data == true){
             		alert("注册成功");
             		window.location.href = "/web-ssm/";
             	}else if(data == false){
             		alert("账号密码错误");
             	}
             },
            error: function(XMLHttpRequest, textStatus, errorThrown){
                alert(errorThrown);
            }
         });
	});
});

