package by.htp.exstudent.logic;

import by.htp.exstudent.entity.Student;

public class StudentLogic {

	public Student createStudent(String fio, int group) {
		
		if (fio == null) {
			throw new IllegalArgumentException("fio �� ������ ���� null");
		}
		
		if (group < 0) {
			throw new IllegalArgumentException("lenght �� ������ ���� < 0");
		}

		return new Student(fio, group);
	}

	public Student[] createStudent(int lenght) {
		
		if (lenght <= 0) {
			throw new IllegalArgumentException("lenght �� ������ ���� <= 0");
		}

		return new Student[lenght];
	}

	public boolean checkProgress(Student student) {

		if (student == null) {
			throw new IllegalArgumentException("student �� ������ ���� null");
		}
		
		int[] progress = student.getProgress();

		for (int i = 0; i < progress.length; i++) {

			if (progress[i] < 9) {
				return false;
			}

		}

		return true;
	}

}
