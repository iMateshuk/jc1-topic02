package by.htp.extrain.start;

import java.util.Date;

import by.htp.extrain.entity.Depo;
import by.htp.extrain.generator.TrainGenerator;
import by.htp.extrain.logic.TrainLogic;
import by.htp.extrain.present.TrainPresent;

public class Main {

	public static void main(String[] args) {

		int arraySize = 15;

		TrainLogic logic = new TrainLogic();
		TrainPresent view = new TrainPresent();
		
		TrainGenerator trGen = new TrainGenerator();

		Depo depo = new Depo(trGen.genTrain(arraySize));

		depo.getTrains().add(logic.createTrain("Moskow", 123, new Date()));
		depo.getTrains().add(logic.createTrain("Moskow", 125, new Date()));

		// depo.getTrains().add(logic.createTrain(null, 125, new Date()));

		System.out.println("///////////showTrains//////////");
		view.trainPrint(depo.getTrains());

		System.out.println();
		System.out.println("///////////sortTrainByNumber//////////");
		logic.sortTrainByNumber(depo.getTrains());
		view.trainPrint(depo.getTrains());

		System.out.println();
		System.out.println("///////////sortTrainByNumberRev//////////");
		logic.sortTrainByNumberReverse(depo.getTrains());
		view.trainPrint(depo.getTrains());

		/*
		 * System.out.println("///////////sortTrainByDestAndDepartTime//////////");
		 * logic.sortDestCompare(depo.getTrains()); view.trainPrint(depo.getTrains());
		 */

		System.out.println();
		System.out.println("///////////sortDestAndDepartTime//////////");
		logic.sortDest(depo.getTrains());
		view.trainPrint(depo.getTrains());

		System.out.println();
		System.out.println("///////////sortDestReverseAndDepartTime//////////");
		logic.sortDestReverse(depo.getTrains());
		view.trainPrint(depo.getTrains());

		System.out.println();
		System.out.println("///////////showTrainByNumber//////////");
		view.trainPrint(depo.getTrains(), logic.chooseTrain());

	}

}
