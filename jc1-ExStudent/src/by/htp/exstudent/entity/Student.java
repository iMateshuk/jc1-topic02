package by.htp.exstudent.entity;

import java.util.Arrays;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fio == null) ? 0 : fio.hashCode());
		result = prime * result + groupNumber;
		result = prime * result + Arrays.hashCode(progress);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (fio == null) {
			if (other.fio != null)
				return false;
		} else if (!fio.equals(other.fio))
			return false;
		if (groupNumber != other.groupNumber)
			return false;
		if (!Arrays.equals(progress, other.progress))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [fio=" + fio + ", groupNumber=" + groupNumber + ", progress=" + Arrays.toString(progress) + "]";
	}
	
	

}
