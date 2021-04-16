package by.htp.exstudent.generator;

import java.util.ArrayList;
import java.util.Random;

import by.htp.exstudent.entity.Student;

public class StudentGenerator {
	
	public Student[] genStudent(int lenght) {

		if (lenght < 10) {
			lenght = 10;
		}

		Student[] students = new Student[lenght];

		for (int i = 0; i < students.length; i++) {
			students[i] = genNewStudent();
		}

		return students;
	}

	public void genStudent(ArrayList<Student> studens, int studensMax) {

		if (studensMax < 10) {
			studensMax = 10;
		}

		for (int i = 0; i < studensMax; i++) {
			studens.add(genNewStudent());
		}
		
		studens.trimToSize();

	}

	private Student genNewStudent() {

		return new Student(genString((int) (Math.random() * 10 + 1)) + " " + genString((int) (Math.random() * 10 + 1)),
				(int) (Math.random() * 10 + 1));

	}

	public int[] genScore(int lenght) {
		int[] progress = new int[lenght];

		if (((int) (Math.random() * 10 + 1)) % 2 == 0) {
			masGenExc(progress);
		} else {
			masGenOther(progress);
		}

		return progress;

	}

	private void masGenExc(int[] progress) {

		Random random = new Random();

		for (int i = 0; i < progress.length; i++) {
			progress[i] = 9 + random.nextInt(2);
		}

	}

	private void masGenOther(int[] progress) {

		for (int i = 0; i < progress.length; i++) {
			progress[i] = (int) (Math.random() * 10 + 1);
		}

	}

	private String genString(int stringLenght) {

		// final String AZNUMBER =
		// "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		final String AZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		Random random = new Random();

		StringBuilder sb = new StringBuilder(stringLenght);
		sb.append(AZ.charAt(random.nextInt(AZ.length())));
		for (int i = 0; i < stringLenght; i++) {
			sb.append(AZ.charAt(random.nextInt(AZ.length())));
		}
		String strnig = sb.toString().toLowerCase();
		return strnig.substring(0, 1).toUpperCase().concat(strnig.substring(1));

	}

}
