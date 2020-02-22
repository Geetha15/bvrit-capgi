package com.capg.sprint1.ui;
//import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
//import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

import com.capg.sprint1.dto.AddScheduledFlightDto;
import com.capg.sprint1.dto.AirportDto;
import com.capg.sprint1.dto.FlightDto;
import com.capg.sprint1.dto.ScheduleDto;
import com.capg.sprint1.service.ScheduledFlightServiceImpl;

public class ScheduledFlightUi {
	static FlightDto flight;
	static int availableSeats;
    static long flightno;
	ScheduleDto schedule;
	String airportLocation,airportName,airportCode,carriername, flightmodel,arrTime,depTime,sourceAirport,destinationAirport;
	int seatcapacity;
	public static void main(String[] args)throws Exception {
		
		Scanner s=new Scanner(System.in);
		
		FlightDto f=new FlightDto();
		ScheduleDto sd=new ScheduleDto();
		AirportDto a=new AirportDto();
		
		int ch,ch1=1;
		
		while(ch1!=0)
		{
			
			System.out.println("1.Add Schedule Flight");
			
			System.out.println("Enter your choice");
			ch=s.nextInt();
			switch(ch)
			{		
			case 1:
				
				AddScheduledFlightDto sf=new AddScheduledFlightDto();//Bean
				
				System.out.println("Enter carrier name");
				String carriername=s.next()+s.nextLine();
				//f.setCarrierName(carriername);
				sf.setCarriername(carriername);
				
				System.out.println("Enter flight no");
				flightno=s.nextLong();
				//f.setFlightNumber(flightno);
				sf.setFlightno(flightno);
			
				System.out.println("Enter flight model");
				String flightmodel=s.next()+s.nextLine();
				//f.setFlightModel(flightmodel);
				sf.setFlightmodel(flightmodel);
				
				System.out.println("Enter seat capacity");
				int seatcapacity=s.nextInt();
				//f.setSeatCapacity(seatcapacity);
				sf.setSeatcapacity(seatcapacity);
				
				System.out.println("Enter arrival time");
				String arrTime=s.next()+s.nextLine();
				Date arrivalTime=new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(arrTime);
				//sd.setArrivalTime(arrivalTime);
				sf.setArrivalTime(arrivalTime);
			
				System.out.println("Enter departure time");
				String depTime=s.next()+s.nextLine();
				Date departureTime=new SimpleDateFormat("dd-MM-yyyy hh:mm").parse(depTime);
				//LocalTime departureTime=LocalTime.parse(depTime);
				//sd.setDepartureTime(departureTime);
				sf.setDepartureTime(departureTime);
				
				System.out.println("Enter the source airport");
				String sourceAirport=s.next()+s.nextLine();
				//sd.setSourceAirport(sourceAirport);
				sf.setSourceAirport(sourceAirport);
				
				System.out.println("Enter the destination airport");
				String destinationAirport=s.next()+s.nextLine();
				//sd.setDestinationAirport(destinationAirport);
				sf.setDestinationAirport(destinationAirport);
				
				System.out.println("Enter the airport name ");
				String airportName = s.next()+s.nextLine();
				//a.setAirportName(airportName);
				sf.setAirportName(airportName);
				
				System.out.println("Enter the airport code ");
				String airportCode = s.next()+s.nextLine();
				//a.setAirportCode(airportCode);
				sf.setAirportCode(airportCode);
				
				System.out.println("Enter the airport location ");
				String airportLocation = s.next()+s.nextLine();
				//a.setAirportLocation(airportLocation);
				sf.setAirportLocation(airportLocation);
				
				System.out.println("Enter available seats");
				availableSeats=s.nextInt();
				

				 AddScheduledFlightDto ad=new AddScheduledFlightDto( flightno,  flightmodel,  carriername, seatcapacity,
						airportName, airportCode,  airportLocation,  sourceAirport,
					 destinationAirport,  arrivalTime, departureTime);
				
				 ScheduledFlightServiceImpl sfservice=new ScheduledFlightServiceImpl();
				
				int updatecount=sfservice.scheduledFlight(ad);
				System.out.println("Flight no "+updatecount+" is added");
				
				
			break;
			
			
			
			default:
				
				
					 
			}	
			
		}			
		
	}
	


}	