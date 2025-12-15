package year;

public class Employee {
	
     int id = 12;
     String name;
     double salary;
     public void getSalary() {
    	 System.out.println("The Salaray is :"+salary);
     }
     public void getName() {
    	 System.out.println("The Name is :"+name);
     }
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.id);
	    emp.getName();
	    Employee emp1 = new Employee();
		System.out.println(emp1.id);
	    emp.getName();
	}

}
