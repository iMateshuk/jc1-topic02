package by.htp.extrain.present;

import java.util.ArrayList;

import by.htp.extrain.entity.Train;

public class TrainPresent {

	public void trainPrint(ArrayList<Train> trains) {
		for (Train train : trains) {
			trainPrint(train);
		}

	}

	public void trainPrint(ArrayList<Train> trains, int userChoise) {
		
		for (Train train : trains) {
			if (train.getTrainNumber() == userChoise) {
				trainPrint(train);
				return;
			}

		}

		System.out.printf("Нет поезда c номером %1$d.\n", userChoise);

	}

	private void trainPrint(Train train) {
		System.out.printf("Поезд %2$d :: %1s, отправляется %3$s.\n", train.getDetinationPoint(), train.getTrainNumber(),
				train.getDepartureTime());
	}
}
