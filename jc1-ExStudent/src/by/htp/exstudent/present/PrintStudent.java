package by.htp.exstudent.present;

import java.util.ArrayList;

import by.htp.exstudent.entity.Student;
import by.htp.exstudent.logic.StudentLogic;

public class PrintStudent {

	//public void print(Student student) {
	//printStudent(student);
	//}
		public void print(Student... students) {
			for (Student student : students) {
				print(student);
			}
		}

		public void print(ArrayList<Student> students) {
			for (Student student : students) {
				print(student);
			}
		}

		public void printProgress(Student... students) {
			for (Student student : students) {
				print(student);
				int[] progress = student.getProgress();
				for (int i = 0; i < progress.length; i++) {
					System.out.printf("[%2d]", progress[i]);
				}
				System.out.println();
			}
		}

		public void printProgress(Student student, StudentLogic logic) {
			if (logic.checkProgress(student)) {
				print(student);
			}
		}

		private void print(Student student) {
			System.out.println("FIO:" + student.getFio() + ", Group:" + student.getGroupNumber());
		}

	}
