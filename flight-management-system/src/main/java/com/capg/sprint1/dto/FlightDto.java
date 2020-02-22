package com.capg.sprint1.dto;

public class FlightDto {
	
		int flightId;
		long flightNumber;
		String flightModel;
		String carrierName;
		int seatCapacity;
		
		public int getFlightId() {
			return flightId;
		}
		public void setFlightId(int flightid) {
			this.flightId = flightid;
		}
		public long getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(long flightno) {
			this.flightNumber = flightno;
		}
		public String getFlightModel() {
			return flightModel;
		}
		public void setFlightModel(String flightModel) {
			this.flightModel = flightModel;
		}
		public String getCarrierName() {
			return carrierName;
		}
		public void setCarrierName(String carrierName) {
			this.carrierName = carrierName;
		}
		public int getSeatCapacity() {
			return seatCapacity;
		}
		public void setSeatCapacity(int seatCapacity) {
			this.seatCapacity = seatCapacity;
		}

	}




