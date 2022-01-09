package Assignment_9;

public class Employee {
	private String firstName;
	private String lastname;
	private double salary;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		
	}

	public Employee(String firstName, String lastname, double salary) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.salary = salary;
				
	}
	
	public Employee() {
		
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.firstName = "akshay";
		emp.lastname = "chavan";
		emp.salary = 10000;
		
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastname());
		System.out.println(emp.getSalary());
	}

}
