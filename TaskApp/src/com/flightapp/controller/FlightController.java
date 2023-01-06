package com.flightapp.controller;
import java.util.List;
import com.flightapp.db.FlightDB;
import com.flightapp.entity.Flight;

public class FlightController {
	FlightDB db;
	
	public FlightController() {
		db= new FlightDB();
	}
	public List<Flight> getAllFlights(){
		return db.getAllFlights();
	}
	public Flight insertFlight(Flight userInputFlight)
	{
		
		Flight savedFlight = db.saveFlightInDB(userInputFlight);
		return savedFlight;
		
	}
	public List<Flight> getFlightsByCarrier(String userInputCarrier){
		return db.getFlightsByCarrier(userInputCarrier);
	}
	public List<Flight> getFlightBtwSourceAndDestination(String source,String destination){
		
		return db.getFlightBtwSourceAndDestination(source, destination);
	}
	public List<Flight> getFlightByPriceRange(String source,String destination,int range1,int range2){
		return db.getFlightByPriceRange(source,destination,range1,range2);
	}
	public List<Flight> getFlightByDate(String source,String destinatio,String date){
		return db.getFlightByDate(source, destinatio, date);
	}
}
