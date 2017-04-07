package model;

/* Use Employee class to create lists of employees with its attributes
 * */
public class Employee {
	
	int emp_id;
	String emp_fName;
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_fName() {
		return emp_fName;
	}

	public void setEmp_fName(String emp_fName) {
		this.emp_fName = emp_fName;
	}

	public String getEmp_mName() {
		return emp_mName;
	}

	public void setEmp_mName(String emp_mName) {
		this.emp_mName = emp_mName;
	}

	public String getEmp_lName() {
		return emp_lName;
	}

	public void setEmp_lName(String emp_lName) {
		this.emp_lName = emp_lName;
	}

	String emp_mName;
	String emp_lName;
	
	Employee(String emp_fName, String emp_mName, String emp_lName){
		setEmp_fName(emp_fName);
		setEmp_mName(emp_mName);
		setEmp_lName(emp_lName);
		setEmp_id(emp_id);
	}
	
	
	
	
}
