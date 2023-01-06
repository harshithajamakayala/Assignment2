package com.flightapp.main;
import java.util.Comparator;
import com.flightapp.entity.Flight;

public class SortBasedOnCost implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {
		// TODO Auto-generated method stub
		return o1.getCost()-o2.getCost();
	}
	

}
