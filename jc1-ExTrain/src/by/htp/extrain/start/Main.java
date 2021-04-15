package by.htp.extrain.start;

import java.util.Date;

import by.htp.extrain.entity.Depo;
import by.htp.extrain.entity.Train;
import by.htp.extrain.logic.TrainLogic;
import by.htp.extrain.present.TrainPresent;

public class Main {

	public static void main(String[] args) {

		int arraySize = 15;

		TrainLogic logic = new TrainLogic();
		TrainPresent view = new TrainPresent();

		Depo depo = new Depo(logic.genTrain(arraySize));

		depo.getTrains().add(new Train("Moskow", 123, new Date()));
		depo.getTrains().add(new Train("Moskow", 125, new Date()));

		// depo.getTrains().add(new Train(null, 125, new Date()));

		System.out.println("///////////showTrains//////////");
		view.trainPrint(depo.getTrains());

		System.out.println("///////////sortTrainByNumber//////////");
		logic.sortTrainByNumber(depo.getTrains());
		view.trainPrint(depo.getTrains());

		System.out.println("///////////sortTrainByNumberRev//////////");
		logic.sortTrainByNumberReverse(depo.getTrains());
		view.trainPrint(depo.getTrains());

		/*
		 * System.out.println("///////////sortTrainByDestAndDepartTime//////////");
		 * logic.sortDestCompare(depo.getTrains()); view.trainPrint(depo.getTrains());
		 */

		System.out.println("///////////sortDestAndDepartTime//////////");
		logic.sortDest(depo.getTrains());
		view.trainPrint(depo.getTrains());

		System.out.println("///////////sortDestReverseAndDepartTime//////////");
		logic.sortDestReverse(depo.getTrains());
		view.trainPrint(depo.getTrains());

		System.out.println("///////////showTrainByNumber//////////");
		view.trainPrint(depo.getTrains(), logic.chooseTrain());

	}

}
