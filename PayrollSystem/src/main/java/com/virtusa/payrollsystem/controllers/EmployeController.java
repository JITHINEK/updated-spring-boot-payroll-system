package com.virtusa.payrollsystem.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.virtusa.payrollsystem.models.Employee;
import com.virtusa.payrollsystem.models.MBOPayout;
import com.virtusa.payrollsystem.models.Payslip;
import com.virtusa.payrollsystem.services.DepartmentService;
import com.virtusa.payrollsystem.services.EmployeService;
import com.virtusa.payrollsystem.services.LoginService;
import com.virtusa.payrollsystem.services.MBOPayoutService;
import com.virtusa.payrollsystem.services.PayslipService;

@Controller
@SessionAttributes("employeId")
public class EmployeController {

	@Autowired
	private EmployeService employeService;

	@Autowired
	private PayslipService payslipService;

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private MBOPayoutService mboPayoutService;
	
	@Autowired
	private LoginService loginService;

	@GetMapping("/home")
	public String home(Model model) {
		SecurityContext context = SecurityContextHolder.getContext();
		model.addAttribute("employeId", context.getAuthentication().getName());
		return "home";

	}

	@RequestMapping("/profile")
	public String profile(@ModelAttribute("employeId") int employeId, Model model) {

		model.addAttribute("profile", employeService.getEmployeById(employeId));
		return "profile";

	}
	
	//Controller for edit profile page
	@RequestMapping("/editProfile")
	public String editProfile(@ModelAttribute("employeId") int employeId, Model model) {

		model.addAttribute("profile", employeService.getEmployeById(employeId));
		return "editProfile";

	}

	@RequestMapping(value = "/saveProfile", method = RequestMethod.POST)
	public String saveProfile(@ModelAttribute Employee employee, Model model) {
		employee.setDepartment(departmentService.getDepartmentById(employeService.getEmployeById(employee.getEmployeId()).getDepartment()));
		employee.setDateOfJoin(employeService.getEmployeById(employee.getEmployeId()).getDateOfJoin());
		employee.setDesignation(employeService.getEmployeById(employee.getEmployeId()).getDesignation());
		employee.setGender(employeService.getEmployeById(employee.getEmployeId()).getGender());
		employee = employeService.updateEmployeDetails(employee);
		return "redirect:/profile";
	}

	@GetMapping("/payslip")
	public String getPayslip() {
		return "payslip";
	}

	@PostMapping("/viewPayslip")
	public @ResponseBody Payslip getPayslip(@ModelAttribute("employeId") int employeId, @RequestBody LocalDate date) {
		Payslip payslip = payslipService.getPaySlip(employeService.getEmployeById(employeId), date);
		return payslip;

	}

	@GetMapping("/mboPayout")
	public String getMboPayout() {
		return "mboPayout";
	}

	@PostMapping("/viewMboPayout")
	public @ResponseBody MBOPayout mboPayout(@ModelAttribute("employeId") int employeId, @RequestBody int[] data) {
		return mboPayoutService.getMBOPayout(employeService.getEmployeById(employeId), data[0], data[1]);
	}

	@RequestMapping("/declaration")
	public String form(@ModelAttribute("employeId") int employeId, Model model) {
		model.addAttribute("employeName", employeService.getEmployeById(employeId).getEmployeName());
		return "declaration";
	}
	
	@RequestMapping("/")
	public String loginController() {
		return "login";
	}
	
	@RequestMapping("/resetPassword")
	public String resetPasswordPage() {
		return "resetPassword";
	}
	
	@PostMapping("/reset")
	public @ResponseBody int resetPassword(@ModelAttribute("employeId") int employeId, @RequestBody String[] data) {
		return loginService.reset(employeId, data[0], data[1]);
	}
}
