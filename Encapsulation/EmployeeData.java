package Encapsulation;

public class EmployeeData {

	private int empId;   // encapsulated data members
	private String empName;

	public int getEmpId() { 

		return empId;
	}

	public void setEmpId(int Id) {
		empId = Id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String name) {
		empName = name;
	}

}
