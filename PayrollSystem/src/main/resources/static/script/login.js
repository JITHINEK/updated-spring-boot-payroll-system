/**/
$(document).ready(function() {
		$('.box').hide().fadeIn(1000);
		$("#form").submit(function(e) {
			var uname = $("#empid").val();
			var passwd = $("#passwd").val();
			if (empid == "" || passwd == "") {
				e.preventDefault();
				alert("Enter your Id and Passwd!.");
			}
		});
});