package by.htp.exstudent.start;

import java.util.ArrayList;

import by.htp.exstudent.entity.Student;
import by.htp.exstudent.generator.StudentGenerator;
import by.htp.exstudent.logic.StudentLogic;
import by.htp.exstudent.present.PrintStudent;

public class Main {

	public static void main(String[] args) {

		int maxStudensInGroup = 10;
		int maxScoreCell = 5;
		StudentLogic logic = new StudentLogic();
		PrintStudent print = new PrintStudent();
		StudentGenerator studGen = new StudentGenerator();

		Student[] studentsMas = studGen.genStudent(maxStudensInGroup);
		
		Student[] studentsMasOther = logic.createStudent(maxStudensInGroup);
		studentsMasOther[0] = logic.createStudent("Ivani Van", 0);
		studentsMasOther[0].setProgress(new int[] {9,9,9,9,10});

		ArrayList<Student> studentsArray = new ArrayList<Student>(maxStudensInGroup);
		studGen.genStudent(studentsArray, maxStudensInGroup);
		
		for (int i = 0; i < studentsMas.length; i++) {
			studentsMas[i].setProgress(studGen.genScore(maxScoreCell));
		}

		for (int i = 0; i < studentsArray.size(); i++) {
			studentsArray.get(i).setProgress(studGen.genScore(maxScoreCell));
		}
		
		studentsArray.add(logic.createStudent("Ivanov Iv", 0));
		studentsArray.get(studentsArray.size() - 1).setProgress(new int[] {9,9,9,9,10});

		System.out.println("////////////allStudentsArray///////////////////////");
		print.print(studentsArray);

		System.out.println();
		System.out.println("////////////allStudentsMas///////////////////////");
		print.print(studentsMas);

		System.out.println("////////////studentsArrayFull///////////////////////");
		for (Student student : studentsArray) {
			print.printProgress(student);
		}

		System.out.println();
		System.out.println("///////////////excl////////////////////");
		for (Student student : studentsArray) {
			print.printProgress(student, logic);
		}

		System.out.println();
		System.out.println("////////////studentsMasFull///////////////////////");
		print.printProgress(studentsMas);

		System.out.println();
		System.out.println("///////////////excl////////////////////");
		for (Student student : studentsMas) {
			print.printProgress(student, logic);
		}

	}

}
