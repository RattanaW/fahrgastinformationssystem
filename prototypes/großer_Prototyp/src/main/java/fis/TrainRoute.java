package fis;

import java.util.ArrayList;
import java.util.List;

public class TrainRoute {
	private String id;
	private int trainNumber;
	private TrainCategory trainCategory;
	private List<Stop> stops=new ArrayList<Stop>();
	
	public TrainRoute(String id,int trainNumber, TrainCategory trainCategory, List<Stop> stops){
		this.id=id;
		this.trainNumber=trainNumber;
		this.trainCategory=trainCategory;
		this.stops=stops;
	}
	
	public String getId(){
		return id;
	}
	public int getTrainNumber(){
		return trainNumber;
	}
	
	public TrainCategory getTrainCategory(){
		return trainCategory;
	}
	public List<Stop> getStops(){
		return stops;
	}
	
	public boolean containsStation(Station station){
		boolean isNull=false;
		
		for (Stop s : this.stops){
			if(s.getStation()==null){
				System.out.println("Stop-Bahnhof ist NULL!");
				s.printDebugInformation();
				isNull=true;
			}
			if(isNull){ debugPrint(); return false;}
			if (s.getStation().equals(station)) return true;
		}
		return false;
	}
	
	public void debugPrint(){
		System.out.println("DEBUG PRINT FOR TRAINROUTE WITH ID #"+id);
		for(Stop s:this.stops){
			s.printDebugInformation();
		}
	}
	
	
}
