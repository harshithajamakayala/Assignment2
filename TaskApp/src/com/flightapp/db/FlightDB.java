package com.flightapp.db;
import java.util.ArrayList;
import java.util.List;

import com.flightapp.entity.Flight;
import com.flightapp.util.FlightUtil;

public class FlightDB {

	List<Flight> allFlights=new ArrayList<>();
	public List<Flight> getAllFlights()
	{
		return allFlights;
	}
	public Flight saveFlightInDB(Flight flight)
	{
		if(flight != null)
		{
			flight.setFlightId(FlightUtil.getRandomID());
			boolean status =  allFlights.add(flight);
			if(status) return flight;
			else return null;
			
		}
		else
		{
			return null;
		}
		
	}
	public List<Flight> getFlightsByCarrier(String searchCarrier){
		  
List<Flight> outputFlights = new ArrayList<>();
		
		for (Flight flight : allFlights) {
			if(flight.getCarrierName().equalsIgnoreCase(searchCarrier))
			{
				outputFlights.add(flight);
			}
		}
		
		return outputFlights;
	}
	public List<Flight> getFlightBtwSourceAndDestination(String source,String destination){
		
		List<Flight> outputFlights=new ArrayList<>();
		for (Flight flight : allFlights) {
			if(flight.getSourceAirport().equalsIgnoreCase(source) && flight.getDestinationAirport().equalsIgnoreCase(destination)) {
				outputFlights.add(flight);
			}
			
		}
		return outputFlights;
		
	}
	
	public List<Flight> getFlightByPriceRange(String source,String destination,int range1,int range2){
		List<Flight> outputFlights=new ArrayList<>();
		for (Flight flight : allFlights) {
			if(flight.getSourceAirport().equalsIgnoreCase(source) && flight.getDestinationAirport().equalsIgnoreCase(destination) && flight.getCost()>= range1 && flight.getCost()<= range2)
			{
				outputFlights.add(flight);
			}
		}
		return outputFlights;
	}
public List<Flight> getFlightByDate(String source,String destination,String date){
		
		List<Flight> outputFlights=new ArrayList<>();
		for (Flight flight : allFlights) {
			if(flight.getSourceAirport().equalsIgnoreCase(source) && flight.getDestinationAirport().equalsIgnoreCase(destination)&& flight.getDate().equalsIgnoreCase(date)) {
				outputFlights.add(flight);
			}
			
		}
		return outputFlights;
}
}
          