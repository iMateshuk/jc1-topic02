package by.htp.exstudent.logic;

import java.util.ArrayList;

import by.htp.exstudent.entity.Student;


public class StudentLogic {

	public Student[] genStudent(Student[] student) {

		for (int i = 1; i < student.length + 1; i++) {
			student[i - 1] = genNewStudent(i);
		}

		return student;
	}

	public void genStudent(ArrayList<Student> studens, int studensMax) {

		for (int i = 1; i <= studensMax; i++) {
			studens.add(genNewStudent(i));
		}

	}

	private Student genNewStudent(int i) {
		return new Student("Fam" + i + " IO", (int) (Math.random() * 10 + 1));
	}

	public boolean checkProgress(Student student) {
		int[] progress = student.getProgress();
		for (int i = 0; i < progress.length; i++) {
			if (progress[i] < 9) {
				return false;
			}
		}
		return true;
	}
}
