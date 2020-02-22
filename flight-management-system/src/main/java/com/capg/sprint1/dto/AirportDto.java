package com.capg.sprint1.dto;

public class AirportDto {
	
		static String airportName;
		static String airportCode;
		static String airportLocation;
		public static String getAirportName() 
		{
			return airportName;
		}
		public static void setAirportName(String airportName)
		{
			AirportDto.airportName = airportName;
		}
		public static String getAirportCode()
		{
			return airportCode;
		}
		public static void setAirportCode(String airportCode) 
		{
			AirportDto.airportCode = airportCode;
		}
		public static String getAirportLocation() 
		{
			return airportLocation;
		}
		public static void setAirportLocation(String airportLocation)
		{
			AirportDto.airportLocation = airportLocation;
		}

	}




