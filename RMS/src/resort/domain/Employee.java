package resort.domain;

public class Employee {

	private int staffId;
	private String name;
	private String department;
	private String shift;

	public Employee(int staffId, String name, String department, String shift) {
		this.staffId = staffId;
		this.name = name;
		this.department = department;
		this.shift = shift;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	@Override
	public String toString() {
		return String.format("%-10d%-30s%-20s%-30s", this.staffId, this.name, this.department, this.shift);
	}
}
