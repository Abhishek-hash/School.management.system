package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author AbhishekMaurya.
 * Date 21/02/2022.
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Teacher racheal = new Teacher(1, "Racheal", 500);
		Teacher phillip = new Teacher(2, "Phillip", 700);
		Teacher john = new Teacher(3, "John", 600);
		//Teacher racheal = new Teacher(1, "Racheal", 500);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(racheal);
		teacherList.add(phillip);
		teacherList.add(john);
		
		Student lily = new Student(1, "Lily", 2);
		Student jolly = new Student(2, "Jolly", 6);
		Student rohny = new Student(3, "Rohny", 11);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(lily);
		studentList.add(jolly);
		studentList.add(rohny);
		
		
		
		School dps = new School(teacherList,studentList);
		System.out.println("DPS has earned totalMoney till now: "+ "$"+dps.getTotalMoneyEarned());
	}
	
}
