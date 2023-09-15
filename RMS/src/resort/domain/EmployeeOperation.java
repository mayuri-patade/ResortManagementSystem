package resort.domain;

public class EmployeeOperation {
	
	public static Employee[] getArray() {
		Employee[] arr = new Employee[10];
		arr[0] = new Employee(101, "Sagar KulKarni", "Floor Supervisor", "Day Shift");
		arr[1] = new Employee(102, "Vidya Wagh", "Chef", "Night Shift");
		arr[2] = new Employee(103, "Amay Bide", "H.R", "Day Shift");
		arr[3] = new Employee(104, "Usha Chavan", "Help Desk", "Night Shift");
		arr[4] = new Employee(105, "Sanjay JagTap", "Front Office", "Day Shift");
		arr[5] = new Employee(106, "Mahesh Deshpande", "House Keeping", "Night Shift");
		arr[6] = new Employee(107, "Sandesh Ninawe", "House Keeping", "Day Shift");
		arr[7] = new Employee(108, "Arun Ladi", "Chef", "Night Shift");
		arr[8] = new Employee(109, "Mayuri Patade", "Help Desk", "Day Shift");
		arr[9] = new Employee(110, "Jagdish Jain", "Manager", "Night Shift");
		return arr;
	}

	public static void printRecord(Employee[] arr) {
		if (arr != null) {
			for (Employee emp : arr)
				System.out.println(emp);
		}
		System.out.println();
	}
	
	

	

	
}