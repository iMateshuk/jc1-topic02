package by.htp.extrain.entity;

import java.util.Date;

public class Train {

	private String detinationPoint;
	private int trainNumber;
	private Date departureTime;

	public Train(String detinationPoint, int trainNumber, Date departureTime) {
		this.detinationPoint = detinationPoint;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDetinationPoint() {
		return detinationPoint;
	}

	public void setDetinationPoint(String detinationPoint) {
		this.detinationPoint = detinationPoint;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((detinationPoint == null) ? 0 : detinationPoint.hashCode());
		result = prime * result + trainNumber;
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
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (detinationPoint == null) {
			if (other.detinationPoint != null)
				return false;
		} else if (!detinationPoint.equals(other.detinationPoint))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [detinationPoint=" + detinationPoint + ", trainNumber=" + trainNumber + ", departureTime="
				+ departureTime + "]";
	}

}
