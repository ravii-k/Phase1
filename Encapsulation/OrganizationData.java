package Encapsulation;

public class OrganizationData extends EmployeeData {

	public static void main(String args[]) {
		OrganizationData obj = new OrganizationData();
		obj.setEmpId(1000); 

		obj.setEmpName("Ravi kashyap");

		// getting employeedata with getters
		System.out.println("Employee Id: " + obj.getEmpId());
		System.out.println("Employee Name: " + obj.getEmpName());

	}
}