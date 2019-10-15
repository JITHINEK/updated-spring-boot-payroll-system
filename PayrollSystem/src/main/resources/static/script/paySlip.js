$(document).ready(function() {
  $("#payroll_print").hide();
  $("#error").hide();
  $("#dorbtn").click(function(){
    var date = $("#dor").val();
    if($.isEmptyObject(date)){
    	$("#payroll_print").hide();
		$("#error").html("Date is not mentioned!");
		$("#error").show();
    }
    else{
    	
    	$.ajax({
    		url     : "/viewPayslip",
    		type     : "POST",
    		contentType: "application/json",
    		data     : JSON.stringify(date),
    		success    : function(result){
    			if($.isEmptyObject(result)){
    				$("#payroll_print").hide();
	    			$("#error").html("Payslip not generated for this date!!");
	    			$("#error").show();
    			}else{
    				$("#error").hide();
    				var totalAllowance = result.salary.hra + result.salary.specialAllowance + result.salary.foodReimburse +result.salary.bonus;
	    			var totalDeduction = result.salary.providentFund + result.salary.professionalTax;
    				$("#payroll_print").show();
	    			$("#employeId").html(result.salary.employee.employeId);
	    			$("#employeName").html(result.salary.employee.employeName)
    				$("#dateOfReceive").html(date);
	    			$(".basic").html(result.salary.basicSalary);
	    			$("#hra").html(result.salary.hra);
	    			$("#specialAllowance").html(result.salary.specialAllowance);
	    			$("#foodReimbursement").html(result.salary.foodReimburse);
	    			$("#advanceStatutortBonus").html(result.salary.bonus);
	    			$("#pf").html(result.salary.providentFund);
	    			$("#professionalTax").html(result.salary.professionalTax);
	    			$("#totalAllowance").html(totalAllowance);
	    			$("#totalDeductions").html(totalDeduction);
	    			$("#netSalary").html(result.salary.basicSalary + totalAllowance - totalDeduction);
    			}
    		},
    		error : function(jqXHR, exception){
    		console.log('Error occured!!');
    		}
    		});
    	
    }
  })
});