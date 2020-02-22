package com.capg.sprint1.dto;
import java.util.Date;
import java.util.Random;

public class AddScheduledFlightDto {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airportCode == null) ? 0 : airportCode.hashCode());
		result = prime * result + ((airportLocation == null) ? 0 : airportLocation.hashCode());
		result = prime * result + ((airportName == null) ? 0 : airportName.hashCode());
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + ((carriername == null) ? 0 : carriername.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationAirport == null) ? 0 : destinationAirport.hashCode());
		result = prime * result + ((flightmodel == null) ? 0 : flightmodel.hashCode());
		result = prime * result + (int) (flightno ^ (flightno >>> 32));
		result = prime * result + seatcapacity;
		result = prime * result + ((sourceAirport == null) ? 0 : sourceAirport.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddScheduledFlightDto other = (AddScheduledFlightDto) obj;
		if (airportCode == null) {
			if (other.airportCode != null)
				return false;
		} else if (!airportCode.equals(other.airportCode))
			return false;
		if (airportLocation == null) {
			if (other.airportLocation != null)
				return false;
		} else if (!airportLocation.equals(other.airportLocation))
			return false;
		if (airportName == null) {
			if (other.airportName != null)
				return false;
		} else if (!airportName.equals(other.airportName))
			return false;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (carriername == null) {
			if (other.carriername != null)
				return false;
		} else if (!carriername.equals(other.carriername))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationAirport == null) {
			if (other.destinationAirport != null)
				return false;
		} else if (!destinationAirport.equals(other.destinationAirport))
			return false;
		if (flightmodel == null) {
			if (other.flightmodel != null)
				return false;
		} else if (!flightmodel.equals(other.flightmodel))
			return false;
		if (flightno != other.flightno)
			return false;
		if (seatcapacity != other.seatcapacity)
			return false;
		if (sourceAirport == null) {
			if (other.sourceAirport != null)
				return false;
		} else if (!sourceAirport.equals(other.sourceAirport))
			return false;
		return true;
	}



	private long flightno;
	private String flightmodel;
	private String carriername;
	private int seatcapacity;
	private String airportName;
	private String airportCode;
	private String airportLocation;
	private String sourceAirport;
	private String destinationAirport;
	private Date arrivalTime;
	private Date departureTime;
	
	
	
	public AddScheduledFlightDto() {
		super();
		
	}



	public AddScheduledFlightDto(long flightno, String flightmodel, String carriername, int seatcapacity,
			String airportName, String airportCode, String airportLocation, String sourceAirport,
			String destinationAirport, Date arrivalTime, Date departureTime) {
		super();
		Random r=new Random();
		this.flightno = r.nextInt();
		this.flightmodel = flightmodel;
		this.carriername = carriername;
		this.seatcapacity = seatcapacity;
		this.airportName = airportName;
		this.airportCode = airportCode;
		this.airportLocation = airportLocation;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	public long getFlightno() {
		return flightno;
	}

	public void setFlightno(long flightno) {
		this.flightno = flightno;
	}

	public String getFlightmodel() {
		return flightmodel;
	}

	public void setFlightmodel(String flightmodel) {
		this.flightmodel = flightmodel;
	}

	public String getCarriername() {
		return carriername;
	}

	public void setCarriername(String carriername) {
		this.carriername = carriername;
	}

	public int getSeatcapacity() {
		return seatcapacity;
	}

	public void setSeatcapacity(int seatcapacity) {
		this.seatcapacity = seatcapacity;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportLocation() {
		return airportLocation;
	}

	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
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

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}



	@Override
	public String toString() {
		return "AddScheduledFlight [flightno=" + flightno + ", flightmodel=" + flightmodel + ", carriername="
				+ carriername + ", seatcapacity=" + seatcapacity + ", airportName=" + airportName + ", airportCode="
				+ airportCode + ", airportLocation=" + airportLocation + ", sourceAirport=" + sourceAirport
				+ ", destinationAirport=" + destinationAirport + ", arrivalTime=" + arrivalTime + ", departureTime="
				+ departureTime + "]";
	}
	
	

}