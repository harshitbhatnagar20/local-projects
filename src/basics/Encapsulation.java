package basics;

/**
 * @author Harshit.Bhatnagar
 * Encapuslation : Binding together all attributes & methods together and hiding sensible data.
 *  uses getters & setters.
 */

class Employee04 {
	private String Name;
	private double salary;
	private int age;
	
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}


}





public class Encapsulation {
	
	public static void main(String[] args) {
		Employee04 employee = new Employee04();

		employee.setName("Harshit");
		employee.setSalary(20000);
		employee.setAge(21);

		System.out.println("Name: " + employee.getName());
		System.out.println("Salary : " + employee.getSalary());
		System.out.println("Age " + employee.getAge());
	}

}


