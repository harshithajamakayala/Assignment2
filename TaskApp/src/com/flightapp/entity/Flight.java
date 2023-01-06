package com.flightapp.entity;

import java.util.Objects;

public class Flight implements Comparable<Flight> {
	private int flightId;
	private String carrierName;
	private String sourceAirport;
	@Override
	public int compareTo(Flight obj) {
		// TODO Auto-generated method stub
		return this.getFlightId()-obj.getFlightId();
	}


	private String destinationAirport;
	private float takeoofTime;
	private float landingTime;
	private String date;
	private int cost;
	private float flightDuration;

	public Flight() {
		super();
	}
	
	
	public Flight(int flightId, String carrierName, String sourceAirport, String destinationAirport,float takeoofTime, float landingTime, String date, int cost, float flightDuration) {
		super();
		this.flightId = flightId;
		this.carrierName = carrierName;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.takeoofTime = takeoofTime;
		this.landingTime = landingTime;
		this.date = date;
		this.cost = cost;
		this.flightDuration = flightDuration;
	}


	public int getFlightId() {
		return flightId;
	}


	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}


	public String getCarrierName() {
		return carrierName;
	}


	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}


	public String getSourceAirport() {
		return sourceAirport;
	}


	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}


	public String getDestinationAirport() {
		return destinationAirport;
	}


	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}


	public float getTakeoofTime() {
		return takeoofTime;
	}


	public void setTakeoofTime(float takeoofTime) {
		this.takeoofTime = takeoofTime;
	}


	public float getLandingTime() {
		return landingTime;
	}


	public void setLandingTime(float landingTime) {
		this.landingTime = landingTime;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public float getFlightDuration() {
		return flightDuration;
	}


	public void setFlightDuration(float flightDuration) {
		this.flightDuration = flightDuration;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carrierName == null) ? 0 : carrierName.hashCode());
		result = prime * result + cost;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((destinationAirport == null) ? 0 : destinationAirport.hashCode());
		result = prime * result + Float.floatToIntBits(flightDuration);
		result = prime * result + flightId;
		result = prime * result + Float.floatToIntBits(landingTime);
		result = prime * result + ((sourceAirport == null) ? 0 : sourceAirport.hashCode());
		result = prime * result + Float.floatToIntBits(takeoofTime);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Flight other = (Flight) obj;
		if (carrierName == null) {
			if (other.carrierName != null) {
				return false;
			}
		} else if (!carrierName.equals(other.carrierName)) {
			return false;
		}
		if (cost != other.cost) {
			return false;
		}
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		if (destinationAirport == null) {
			if (other.destinationAirport != null) {
				return false;
			}
		} else if (!destinationAirport.equals(other.destinationAirport)) {
			return false;
		}
		if (Float.floatToIntBits(flightDuration) != Float.floatToIntBits(other.flightDuration)) {
			return false;
		}
		if (flightId != other.flightId) {
			return false;
		}
		if (Float.floatToIntBits(landingTime) != Float.floatToIntBits(other.landingTime)) {
			return false;
		}
		if (sourceAirport == null) {
			if (other.sourceAirport != null) {
				return false;
			}
		} else if (!sourceAirport.equals(other.sourceAirport)) {
			return false;
		}
		if (Float.floatToIntBits(takeoofTime) != Float.floatToIntBits(other.takeoofTime)) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", carrierName=" + carrierName + ", sourceAirport=" + sourceAirport
				+ ", destinationAirport=" + destinationAirport + ", takeoofTime=" + takeoofTime + ", landingTime="
				+ landingTime + ", date=" + date + ", cost=" + cost + ", flightDuration=" + flightDuration + "]";
	}


	

	
}
