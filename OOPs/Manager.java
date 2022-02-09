package OOPs;

//Manager.java inheritance
import java.util.List;

public class Manager extends Employee {

	private List<Employee> subordinates;

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}

	@Override
	public String toString() {
		return "Manager [subordinates=" + subordinates + ", details=" + super.toString() + "]";
	}
}