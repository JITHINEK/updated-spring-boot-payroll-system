$(document).ready(function() {
	$("#submit_btn").click(function(e){
		
		var currentPasswd = $("#currentPasswd").val();
		var newPasswd =$("#newPasswd").val();
		var reEnteredPasswd = $("#reEnteredPassword").val();
		
		
		if($.isEmptyObject(currentPasswd) || $.isEmptyObject(newPasswd) || $.isEmptyObject(reEnteredPasswd)){
			$("#msg").html("Enter all Requrired Information");
			$("#msg").css("color", "red");
			e.preventDefault();
		}else if(newPasswd != reEnteredPasswd){
				 e.preventDefault();
				 $("#msg").html("Password Mismatch!!");
				 $("#msg").css("color", "red");
		}
		else {
			var data = [currentPasswd,newPasswd];
	    	$.ajax({
	    		url     : "/reset",
	    		type     : "POST",
	    		contentType: "application/json",
	    		data     : JSON.stringify(data),
	    		success    : function(result){
	    			if(result == 0){
		    			$("#msg").html("Reseting password faild!!");
		    			$("#msg").css("color", "red");
	    			}else{
	    				window.location.assign("/");
	    			}
	    		},
	    		error : function(jqXHR, exception){
	    			console.log('Error occured!!');
	    		}
	    		});
		}
	});
});