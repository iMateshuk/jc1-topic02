package by.htp.exstudent.entity;

import java.util.Random;

public class Student {

	private String fio;
	private int groupNumber;
	private int[] progress;

	{
		progress = new int[5];

		if (((int) (Math.random() * 10 + 1)) % 2 == 0) {
			masGenExc();
		} else {
			masGenOther();
		}

	}

	public Student(String fio) {
		this.fio = fio;
	}

	public Student(String fio, int groupNumber) {
		this.fio = fio;
		this.groupNumber = groupNumber;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getFio() {
		return fio;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setProgress(int[] progress) {
		this.progress = progress;
	}

	public int[] getProgress() {
		return progress;
	}

	private void masGenExc() {

		Random random = new Random();

		for (int i = 0; i < progress.length; i++) {
			progress[i] = 9 + random.nextInt(2);
		}

	}

	private void masGenOther() {

		for (int i = 0; i < progress.length; i++) {
			progress[i] = (int) (Math.random() * 10 + 1);
		}

	}

}
