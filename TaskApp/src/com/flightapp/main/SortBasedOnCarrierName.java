package com.flightapp.main;


import java.util.Comparator;
import com.flightapp.entity.Flight;

public class SortBasedOnCarrierName implements Comparator<Flight> {

	@Override
	public int compare(Flight o1, Flight o2) {
		// TODO Auto-generated method stub
		return o1.getCarrierName().compareTo(o2.getCarrierName());
	}
	
	

}
