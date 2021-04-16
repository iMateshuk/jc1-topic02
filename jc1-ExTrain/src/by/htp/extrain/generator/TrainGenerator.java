package by.htp.extrain.generator;

import java.util.ArrayList;
import java.util.Calendar;

import by.htp.extrain.entity.Train;

public class TrainGenerator {

	public ArrayList<Train> genTrain(int arraySize) {

		if (arraySize <= 1) {
			arraySize = 10;
		}

		String[] destinations = new String[] { "Minsk", "Berlin", "Praga", "Kiev", "Paris" };

		ArrayList<Train> trains = new ArrayList<>(arraySize);

		int count = 0;
		Calendar calendar = Calendar.getInstance();

		for (int i = 0; i < arraySize; i++) {

			if (count == destinations.length) {
				count = 0;
			}

			calendar.set(Calendar.HOUR_OF_DAY, (int) (Math.random() * 23 + 1));
			int tempDate = calendar.get(Calendar.DATE);
			calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DATE) + (int) (Math.random() * 3 + 1));

			trains.add(i, new Train(destinations[count], (int) (Math.random() * 100 + 1), calendar.getTime()));
			calendar.set(Calendar.DAY_OF_MONTH, tempDate);
			count++;
		}

		return trains;
	}
	
}
