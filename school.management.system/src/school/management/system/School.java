package school.management.system;

import java.util.List;

/**
 * 
 * @author AbhishekMaurya.
 * Date 21/02/2022
 * This is a Teacher class which is responsible for keeping track of teacher's id, name, and salary.
 * 
 * There are many teachers, many students.
 * It implements teachers and students using an ArrayList.
 *
 */

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private int totalMoneyEarned;
	private int totalMoneySpent;
	
	
	// ***************** Constructor ****************//
	
	/**
	 * Creating a constructor- To create a new student by initializing.
	 * 
	 * Creates a new school object.
	 * @param teachers- List of teachers in the school. 
	 * @param students- List of students in the school.
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		
		this.teachers = teachers;
		this.students = students;
		
		// As soon as the school is created.
		
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	
	}
	
	
	// ***************** Getter methods ****************//

	/**
	 * 
	 * @return- Returns the list of teachers in the school. 
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	
	
	/**
	 * 
	 * @return- Returns the list of students in the school. 
	 */
	public List<Student> getStudents() {
		return students;
	}

	
	
	/**
	 * 
	 * @return- Returns the totalMoneyEarned by the school. 
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	
	
	/**
	 * 
	 * @return- Returns the totalMoneySpent by the school. 
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	
	// ***************** Setter methods ****************//

	/**
	 * Adds a teacher to the school.
	 * @param teacher- The teacher to be added.
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}


	
	/**
	 * Adds a student to the school.
	 * @param students- The student to be added.
	 */
	public void addStudents(Student student) {
		students.add(student);
	}


	
	/**
	 * Adds the total money earned by the school.
	 * @param moneyEarned- New money will be added to the existing totalMoneyEarned.
	 */
	public void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}


	
	/**
	 * Going to update the money spent by the school.
	 * Here the school is spending money only on giving the salary to it's teachers.
	 * @param moneySpent- New moneySpent will be added to the existing totalMoneySpent.
	 */
	public void updateTotalMoneySpent(int moneySpent) {
		//totalMoneySpent += moneySpent;
		totalMoneyEarned -= moneySpent;
	}

	
}
