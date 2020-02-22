package com.capg.sprint1.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.sprint1.dao.ScheduledFlightDao;
import com.capg.sprint1.dto.AddScheduledFlightDto;

public class ScheduledFlightDaoImpl implements ScheduledFlightDao {
     public static Map<Integer,AddScheduledFlightDto> map=new HashMap<>();
	@Override
	public int scheduleFlight(AddScheduledFlightDto flight) {
		map.put((int) flight.getFlightno(),flight);
		int updatecount=(int) flight.getFlightno();
		return updatecount;
	}

}
