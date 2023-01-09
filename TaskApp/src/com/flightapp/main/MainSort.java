package com.flightapp.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.flightapp.entity.Flight;

public class MainSort {
	
	public static void main(String[] args) {
		
		       Set<Flight> allFlights=new HashSet<>();
		       
		       Flight f1= new Flight(101, "indigo","hyderbad","delhi", 1.00f, 3.00f,"12-1-2023",2000,2.00f);
		       Flight f2= new Flight(104, "air india","hyderbad","delhi", 3.00f, 4.00f,"12-1-2023",3000,1.00f);
		       Flight f3= new Flight(103, "vistara","goa","mubai", 1.00f, 2.00f,"11-1-2023",1200,2.00f);
		       Flight f4= new Flight(102, "indigo","hyderbad","delhi", 1.00f, 2.00f,"15-3-2023",3300,1.00f);
		       Flight f5= new Flight(105, "air asia","mumbai","delhi", 1.00f, 2.00f,"12-4-2023",1000,2.00f);
		       
		       
		       allFlights.add(f1);
		       allFlights.add(f2);
		       allFlights.add(f3);
		       allFlights.add(f4);
		       allFlights.add(f5);
		       
		       System.out.println("HashSet :- \n");
		       for (Flight flight : allFlights) {
		    	   System.out.println(flight);
				
			}
		       
		       Set<Flight> allSortedFlights=new TreeSet<>();
		       allSortedFlights.addAll(allFlights);
		       System.out.println("\nTreeSet:- \n");
		       for (Flight flight : allSortedFlights) {
				 System.out.println(flight);
			}
		       System.out.println("---------------------------------"); 
		       System.out.println("Sort based on carrier name");
		       List<Flight> tempList=new ArrayList<>(allSortedFlights);
		       
		       SortBasedOnCarrierName sortObj=new SortBasedOnCarrierName();
		       Collections.sort(tempList,sortObj);
		       
		       for (Flight flight : tempList) {
		    	   System.out.println(flight);
				
			}
		      System.out.println("---------------------------------"); 
		       System.out.println("Sort based on Price");
		       List<Flight> tempList2=new ArrayList<>(allSortedFlights);
		       
		       SortBasedOnCost sortObj2=new SortBasedOnCost();
		       Collections.sort(tempList2,sortObj2);
		       
		       for (Flight flight : tempList2) {
		    	   System.out.println(flight);
				
			}
		       System.out.println("---------------------------------"); 
		       System.out.println("Sort based on Duration");
		       List<Flight> tempList3=new ArrayList<>(allSortedFlights);
		       
		       SortBasedOnDuration sortObj3=new SortBasedOnDuration();
		       Collections.sort(tempList3,sortObj3);
		       
		       for (Flight flight : tempList3) {
		    	   System.out.println(flight);
				
			}
		
	}

}
