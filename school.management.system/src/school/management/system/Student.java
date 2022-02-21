package school.management.system;

/**
 * 
 * @author AbhishekMaurya.
 * Date 21/02/2022
 * This is a student class which is responsible for keeping track of students id, name, grade, fee paid, and fee total.
 *
 */
public class Student {
	
	/**
	 * Properties of Student class
	 */
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	
	// ***************** Constructor ****************//
	
	/**
	 * Creating a constructor- To create a new student by initializing.
	 * 
	 * Fee for every student is $30000.
	 * Fee paid initially at the time of admission is $0.
	 * @param id- It is an unique key to recognize a specific student.
	 * @param name- For a student.
	 * @param grade- Grade of the student.
	 */
	
	public Student(int id, String name, int grade) {
		
		this.id =  id;
		this.name = name;
		this.grade = grade;
		
		this.feesPaid = 0;
		this.feesTotal = 30000;
		
	}
	
	
	// ***************** Setter methods ****************//
	
	// We are not going to alter the student's id, name and feeTotal.
	
	
	/**
	 * This setGrade method is used to update the student's grade.
	 * @param grade- New grade of the student. 
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	/**
	 * Keep adding the new fees to feesPaid field.
	 * feesPaid += fees.
	 * The school is to receive funds in the form of fees paid by all the students.
	 * 
	 * @param fees- The fee the student pays.
	 */
	public void updateFeesPaid(int fees) {
		
		feesPaid += fees;
	}

	
	// ***************** Getter methods ****************//
	
	
	
	/**
	 * 
	 * @return id of the student.
	 */
	public int getId() {
		return id;
	}

	
	/**
	 * 
	 * @return name of the student.
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * 
	 * @return grade/class/standard of the student.
	 */
	public int getGrade() {
		return grade;
	}

	
	/**
	 * 
	 * @return feesPaid by the student.
	 */
	public int getFeesPaid() {
		return feesPaid;
	}

	
	/**
	 * 
	 * @return the totalFees of the student.
	 */
	public int getFeesTotal() {
		return feesTotal;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
