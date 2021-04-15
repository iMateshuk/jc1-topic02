package by.htp.exstudent.entity;

public class Student {

	private String fio;
	private int groupNumber;
	private int[] progress;

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

}
