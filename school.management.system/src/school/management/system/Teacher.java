package school.management.system;

/**
 * 
 * @author AbhishekMaurya.
 * Date 21/02/2022
 * This is a Teacher class which is responsible for keeping track of teacher's id, name, and salary.
 *
 */
public class Teacher {
	
	/**
	 * Properties of Teacher class
	 */
	
	private int id;
	private String name;
	private int salary;
	
	
	// ***************** Constructor ****************//
	
	/**
	 * Creating a constructor- To create a new student by initializing.
	 * 
	 * Creates a new teacher object.
	 * @param id- id for every teacher is unique.
	 * @param name- Name of the teacher.
	 * @param salary- Salary is different for every teacher. And it depends on the years of experience and other thing.
	 */
	
	public Teacher(int id, String name, int salary) {
		
		this.id = id;
		this.name =  name;
		this.salary = salary;
		
		
	}
	
	// ***************** Getter methods ****************//
	
	/**
	 * 
	 * @return the id of the teacher.
	 */
	
	public int getId() {
		return this.id;
	}
	
	/**
	 * 
	 * @return the name of the teacher.
	 */
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * @return the salary of the teacher.
	 */
	
	public int getSalary() {
		return this.salary;
	}
	
	
	// ***************** Setter methods ****************//
	
	// We are not going to alter the teacher's id, name and feeTotal.
	
	/**
	 * set the salary.
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
