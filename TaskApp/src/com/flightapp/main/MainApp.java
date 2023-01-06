package com.flightapp.main;
import java.util.List;
import java.util.Scanner;
import com.flightapp.controller.FlightController;
import com.flightapp.entity.Flight;


public class MainApp {
	Scanner sc = new Scanner(System.in);
	FlightController server = new FlightController();
	public static void main(String[] args) {
		MainApp app=new MainApp();
		
		while(true)
		{
			System.out.println("\n\n-------- App MENU ---------");
			System.out.println("1.Insert Flights In Database.");
			System.out.println("2.Display All Flights.");
			System.out.println("3.Search Flights by carrier name.");
			System.out.println("4.Search all flights from source & destination Airport");
			System.out.println("5.Search all flights from source & destination Airport with price filter");
			System.out.println("6.Search all flights from source & destination Airport with Date");
			System.out.println("0. EXIT ");
			
			System.out.println(" --- Enter Choice :- ");
			int choice = Integer.parseInt(app.sc.nextLine());
			
			switch (choice) {
				case 1:
					app.takeUsetInputFlight();
					break;
				
				case 2:
					app.displayAllFlights();
					break;
					
					
				case 3:
					app.getFlightByCarrier();
					break;
				
				case 4:
					app.getFlightBtwSourceAndDestination();
					break;
					
				case 5:
					app.getFlightByPriceRange();
				    break;
				case 6:
					app.getFlightByDate();
					break;
				
				case 0:
					System.exit(0);
					break;
				

	
				default:
					break;
			}
			
		}
	}

	public void displayAllFlights() {
		List<Flight> allflights= server.getAllFlights();
System.out.println("\n\n ----All Saved Flights---");
       for(Flight flight: allflights) {
    	   displayFlights(flight,"");
    	  
       }
		
		
	}
	public void takeUsetInputFlight() {
		try {
			System.out.println("\n\t Enter Product Details \n");
			System.out.println("\n Enter Flight carrier name");
			String carrierName = sc.nextLine();
			
			System.out.println("\n Enter source airport");
			String airportName = sc.nextLine();
			
			System.out.println("\n Enter destination airport");
			String destination=sc.nextLine();
			
			System.out.println("\n Enter takeoff time ");
			float takeoff = Float.parseFloat(sc.nextLine());
			
			System.out.println("\n Enter landing time");
			float landoff=Float.parseFloat(sc.nextLine());
			
			System.out.println("\n Enter date");
			String date=sc.nextLine();
			
			System.out.println("\n Enter cost");
			int cost=Integer.parseInt(sc.nextLine());
			
			System.out.println("\n Enter flight duration");
			float flightduration=Float.parseFloat(sc.nextLine());
			
			
			
			
			Flight userInputFlight = new Flight(0, carrierName, airportName, destination, takeoff, landoff, date, cost, flightduration);
		
			Flight serverSavedFlight = server.insertFlight(userInputFlight);
			
			if(serverSavedFlight != null)
				displayFlights(serverSavedFlight,"Flight Inserted !!!");
			else
				displayErrors("Flightt Not Saved , Try again or check Authority ");
	}
		catch (Exception e) {
			displayErrors(" Wrong Input , Enter Again");
			takeUsetInputFlight();
			
		}
	}
	
	public void getFlightByCarrier() {
		System.out.println("\n Enter Search Flight carrier name");
		String carrier = sc.nextLine();
		
		List<Flight> outputFlight=server.getFlightsByCarrier(carrier);
		System.out.println("------All"+carrier+"--------");
		for (Flight flight : outputFlight) {
			displayFlights(flight,"");
		}
		
	}
	public void getFlightBtwSourceAndDestination() {
		System.out.println("\n Enter source of Flight");
		String source=sc.nextLine();
		
		System.out.println("\n Enter Destinatio of Flight");
		String destination=sc.nextLine();
		
		List<Flight> outputFlight=server.getFlightBtwSourceAndDestination(source, destination);
		System.out.println("-------All flights Btw source and destination---");
		for (Flight flight : outputFlight) {
			displayFlights(flight,"");
			
		}
	
	}
	
	public void getFlightByPriceRange() {
		
		System.out.println("\n Enter source of Flight");
		String source=sc.nextLine();
		
		System.out.println("\n Enter Destinatio of Flight");
		String destination=sc.nextLine();
		
		System.out.println("\n Enter Search Price Range 1 ");
		int priceRange1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("\n Enter Search Price Range 2 ");
		int priceRange2 = Integer.parseInt(sc.nextLine());
	 
	    List<Flight> outputFlight=server.getFlightByPriceRange(source, destination, priceRange1, priceRange2);
	    System.out.println("----All flights btw"+source+"and"+destination+"--------");
	    for (Flight flight : outputFlight) {
			displayFlights(flight,"");
		}
		
	}
	public void getFlightByDate() {
		System.out.println("\n Enter source of Flight");
		String source=sc.nextLine();
		
		System.out.println("\n Enter Destinatio of Flight");
		String destination=sc.nextLine();
		
		System.out.println("\n Enter the Date");
		String date=sc.nextLine();
		
		List<Flight> outputFlight=server.getFlightByDate(source, destination, date);
		System.out.println("---All flights btw"+source+"and"+destination+"-----");
		for (Flight flight : outputFlight) {
			displayFlights(flight,"");
			
		}
		
		
	}
	public void displayErrors(String errorMsg)
	{
		System.out.println("_______ !!! Error !!! _________________________");
		System.out.println(errorMsg);
	}
	public void displayFlights(Flight f,String tagline)
	{
		System.out.println(tagline);
		System.out.println(f.getFlightId()+" - "+f.getCarrierName()+" - "+f.getSourceAirport()+" - "+f.getDestinationAirport()+" - "+f.getTakeoofTime()+" - "+f.getLandingTime()+" - "+f.getDate()+" - "+f.getCost()+" - "+f.getFlightDuration());
	}
}
