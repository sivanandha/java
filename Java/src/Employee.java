public class Employee {

	int id_no;

	public int getId_no() {
		return id_no;
	}

	public void setId_no(int id_no) {
		this.id_no = id_no;
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printEmployeeDetails(Employee emp) {
		System.out.println(emp);
	}
}
