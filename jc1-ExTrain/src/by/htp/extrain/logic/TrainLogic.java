package by.htp.extrain.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import by.htp.extrain.entity.Train;

public class TrainLogic {

	public Train createTrain(String detinationPoint, int trainNumber, Date departureTime)
			throws IllegalArgumentException {

		if (detinationPoint == null) {
			throw new IllegalArgumentException("detinationPoint не должно быть == null");
		}

		if (trainNumber <= 0) {
			throw new IllegalArgumentException("trainNumber не должно быть <= 0");
		}

		if (departureTime == null) {
			throw new IllegalArgumentException("departureTime не должно быть == null");
		}

		return new Train(detinationPoint, trainNumber, departureTime);
	}

	/*
	 * public void sortDestCompare(ArrayList<Train> trains) { trains.sort(new
	 * Comparator<Train>() {
	 * 
	 * @Override public int compare(Train tr1, Train tr2) { // TODO Auto-generated
	 * method stub int compare =
	 * tr1.getDetinationPoint().compareTo(tr2.getDetinationPoint()); if (compare ==
	 * 0) { SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss"); //
	 * System.out.println(sdf.format(tr1.getDepartureTime()) + " : " + //
	 * sdf.format(tr2.getDepartureTime())); compare =
	 * (sdf.format(tr1.getDepartureTime())).compareTo(sdf.format(tr2.
	 * getDepartureTime())); } return compare; }
	 * 
	 * }); }
	 */

	public void sortDest(ArrayList<Train> trains) {

		sortDest(trains, true);
		sortData(trains, true);
	}

	public void sortDestReverse(ArrayList<Train> trains) {

		sortDest(trains, false);
		sortData(trains, true);
	}

	private void sortDest(ArrayList<Train> trains, boolean order) {

		for (int i = 0; i < trains.size(); i++) {
			Train tempTrain = trains.get(i);
			int tempIndex = i;

			for (int j = i; j < trains.size(); j++) {
				int compare = tempTrain.getDetinationPoint().compareTo(trains.get(j).getDetinationPoint());

				/*
				 * if (compare == 0) { compare =
				 * tempTrain.getDepartureTime().compareTo(trains.get(j).getDepartureTime()); }
				 */

				if ((order && compare > 0) || (!order && compare < 0)) {
					tempTrain = trains.get(j);
					tempIndex = j;
				}

			}

			swapTrain(trains, tempTrain, i, tempIndex);

		}
	}

	private void sortData(ArrayList<Train> trains, boolean order) {

		String tempDestination = trains.get(0).getDetinationPoint();
		int tempIndex = 0;

		for (int i = 0; i < trains.size(); i++) {

			Train tempTrain = trains.get(i);

			if (tempDestination != tempTrain.getDetinationPoint()) {
				sortDataSecond(trains, order, tempIndex, i);
				tempDestination = tempTrain.getDetinationPoint();
				tempIndex = i;
			}

		}
	}

	private void sortDataSecond(ArrayList<Train> trains, boolean order, int start, int finish) {

		for (int i = start; i < finish; i++) {
			Train tempTrain = trains.get(i);
			int tempIndex = i;

			for (int j = i; j < finish; j++) {
				int compare = tempTrain.getDepartureTime().compareTo(trains.get(j).getDepartureTime());

				if ((order && compare > 0) || (!order && compare < 0)) {
					tempTrain = trains.get(j);
					tempIndex = j;
				}

			}

			swapTrain(trains, tempTrain, i, tempIndex);

		}
	}

	public void sortTrainByNumber(ArrayList<Train> trains) {

		sortTrainByNumber(trains, true);

	}

	public void sortTrainByNumberReverse(ArrayList<Train> trains) {

		sortTrainByNumber(trains, false);

	}

	private void sortTrainByNumber(ArrayList<Train> trains, boolean order) {

		for (int i = 0; i < trains.size(); i++) {
			Train tempTrain = trains.get(i);
			int tempIndex = i;

			for (int j = i; j < trains.size(); j++) {
				if ((order && tempTrain.getTrainNumber() > trains.get(j).getTrainNumber())
						|| (!order && tempTrain.getTrainNumber() < trains.get(j).getTrainNumber())) {
					tempTrain = trains.get(j);
					tempIndex = j;
				}
			}

			swapTrain(trains, tempTrain, i, tempIndex);

		}

	}

	private void swapTrain(ArrayList<Train> trains, Train tempTrain, int i, int tempIndex) {
		trains.set(tempIndex, trains.get(i));
		trains.set(i, tempTrain);
	}

	public int chooseTrain() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите номер поезда:");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Нет. Введите номер поезда:");
		}

		return sc.nextInt();

	}

}
