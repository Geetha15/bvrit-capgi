package com.capg.sprint1.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.capg.sprint1.dao.*;
import com.capg.sprint1.dto.*;
import com.capg.sprint1.utils.*;
public class ScheduledFlightServiceImpl implements ScheduledFlightService {
         
	ScheduledFlightDaoImpl scheduleDao=new ScheduledFlightDaoImpl();
	@Override
	public int scheduledFlight(AddScheduledFlightDto schedules) throws Exception {
		if(schedules.getArrivalTime().before(new Date())) {
		throw new Exception("please enter valid Arrival Date/Time");
			//throw new InvalidException("please enter valid DepartureTime Date\Time");
		}
	    if(schedules.getDepartureTime().before(new Date())) {
			throw new InvalidDateException("please enter valid DepartureTime Date/Time");
			}
		
	    //public int scheduledFlight(AddScheduledFlightDto schedules) throws Exception {
	    int updatecount=scheduleDao.scheduleFlight(schedules);
	    return updatecount;
	}
	


}
