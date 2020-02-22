package com.capg.sprint1.dao;

import com.capg.sprint1.dto.AddScheduledFlightDto;

public interface ScheduledFlightDao {
      int scheduleFlight(AddScheduledFlightDto flight);
}
