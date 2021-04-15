package by.htp.exstudent.start;

import java.util.ArrayList;

import by.htp.exstudent.entity.Student;
import by.htp.exstudent.logic.StudentLogic;
import by.htp.exstudent.present.PrintStudent;

public class Main {

	public static void main(String[] args) {

		int maxStudensInGroup = 10;
		StudentLogic logic = new StudentLogic();
		PrintStudent print = new PrintStudent();

		Student[] studentsMas = logic.genStudent(new Student[maxStudensInGroup]);
		ArrayList<Student> studentsArray = new ArrayList<Student>();
		logic.genStudent(studentsArray, maxStudensInGroup);

		System.out.println("////////////allStudentsArray///////////////////////");
		print.print(studentsArray);
		System.out.println("////////////allStudentsMas///////////////////////");
		print.print(studentsMas);

		System.out.println("////////////studentsArrayFull///////////////////////");
		for (Student student : studentsArray) {
			print.printProgress(student);
		}

		System.out.println("///////////////excl////////////////////");
		for (Student student : studentsArray) {
			print.printProgress(student, logic);
		}

		System.out.println("////////////studentsMasFull///////////////////////");
		print.printProgress(studentsMas);

		System.out.println("///////////////excl////////////////////");
		for (Student student : studentsMas) {
			print.printProgress(student, logic);
		}

	}

}
