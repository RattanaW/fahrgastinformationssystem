package fis.telegrams;

import fis.data.TrainRoute;

/**
 * Eine Klasse für Zuglauftelegramme. 
 * @author spiollinux, kloppstock
 */
public class TrainRouteTelegram extends Telegram {
	private TrainRoute route;
	
	/**
	 * Konstruktor für Zuglauftelegramme.
	 * @param route
	 * @throws NullPointerException
	 */
	public TrainRouteTelegram(TrainRoute route) throws NullPointerException {
		if(route == null)
			throw new NullPointerException();
		this.route = route;
	}
	
	/**
	 * Funktion zum Anhängen eines Zuglaufes an den in der Klasse vorhandenen. 
	 * @param route
	 * @throws NullPointerException
	 */
	public void appendRoute(TrainRoute route) throws NullPointerException {
		if(route == null)
			throw new NullPointerException();
		
		//Aufpassen wegen der Datenkonsistenz -> TrainRoute.addStops benutzen!
		this.route.addStops(route.getStops());
	}
	
	/**
	 * Getter für route. 
	 * @return route
	 */
	public TrainRoute getTrainRoute(){
		return this.route;
	}

	@Override
	public String toString() {
		return String.format("TrainRouteTelegram: %s", this.route);
	}
	
	
}
