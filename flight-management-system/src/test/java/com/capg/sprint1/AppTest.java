package com.capg.sprint1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.capg.sprint1.dao.ScheduledFlightDao;
import com.capg.sprint1.dao.ScheduledFlightDaoImpl;
import com.capg.sprint1.dto.AddScheduledFlightDto;
import com.capg.sprint1.service.ScheduledFlightServiceImpl;
import com.capg.sprint1.utils.InvalidDateException;


public class AppTest 
{
	static ScheduledFlightDaoImpl scheduleDao=new ScheduledFlightDaoImpl();
   static ScheduledFlightServiceImpl sfservice=new ScheduledFlightServiceImpl();
	
	static  Map<Integer,AddScheduledFlightDto> map=ScheduledFlightDaoImpl.map;
	@BeforeAll
	public static void  ScheduledFlightDaoImpl() throws ParseException{
				
	}
	@Test
	public void scheduleFlight() throws ParseException {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm");
		Date da=sdf.parse("01-07-2020 08:30");
		Date dd=sdf.parse("01-07-2020 08:30");
	AddScheduledFlightDto flight = new AddScheduledFlightDto(123l , "luxary", "indigo", 56,
"rajivgandi", "54l2", "shamshabad","hyd",
		"delhi", da, dd);

		map.put((int) flight.getFlightno(),flight);
		//System.out.println(map.get((int)flight.getFlightno()));
		
		System.out.println(flight);
		assertEquals(map.get((int)flight.getFlightno()), flight);

	}
		
}
//public void testFlightSchedule() {
//	
//
//
////		AddScheduledFlightDto flight = new AddScheduledFlightDto(123l , "luxary", "indigo", 56,
////	"rajivgandi", "54l2", "shamshabad","hyd",
////			"delhi", "01-07-2020 08:30", "01-07-2020 08:30");
////	//AddScheduledFlightDto update
////	int flightAdding=sfservice.scheduledFlight(flight);
////	
//	
//		//	} 
//	
//		
//}
