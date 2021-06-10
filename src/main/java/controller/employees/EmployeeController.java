package controller.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import command.EmployeeCommand;
import service.employees.EmployeeService;

@Controller
@RequestMapping("emp")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("empList")
	public String empList() {
		return "employee/empList";
	}
	@RequestMapping("empReget")
	public String empReget() {
		return "employee/employeeForm";
	}
	@RequestMapping(value="empJoin", method=RequestMethod.POST)
	public String  empJoin(EmployeeCommand employeeCommand) {
		employeeService.insertEmp(employeeCommand);
		return "redirect:empList";
	}
}
