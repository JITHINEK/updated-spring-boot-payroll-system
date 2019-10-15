$(document).ready(function() {
  $("#payroll_print").hide();
  $("#error").hide();
  $("#dorbtn").click(function(){
    var quarter = $("#quarter").val();
    var year = $("#year").val();
    if(quarter == ""  || year == ""){
    	$("#payroll_print").hide();
		$("#error").html("Date is not mentioned!");
		$("#error").show();
    }
    else{
    	var data = [quarter,year];
    	$.ajax({
    		url     : "/viewMboPayout",
    		type     : "POST",
    		contentType: "application/json",
    		data     : JSON.stringify(data),
    		success    : function(result){
    			if($.isEmptyObject(result)){
    				$("#payroll_print").hide();
	    			$("#error").html("Payslip not generated for this date!!");
	    			$("#error").show();
    			}else{
    				$("#error").hide();
    				alert(result.mboPayoutId);
    				$("#payroll_print").show();
    				$("#employeId").html(result.perfomance.employee.employeId);
    				$("#employeName").html(result.perfomance.employee.employeName);
    				$("#qtr").html(quarter);
    				$("#rating").html(result.perfomance.rating);
    				$("#variable").html(result.amount);
    				$("#totalVariable").html(5000);
    				$("#totalAllowance").html(result.amount);
    				$("#totalDeductions").html(5000-result.amount);
    				$("#netSalary").html(result.amount);
    			}
    		},
    		error : function(jqXHR, exception){
    			console.log('Error occured!!');
    		}
    		});
    	
    }
  })
});