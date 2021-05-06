package eu.kijora.schoolschedule.model.schedule;

import lombok.Builder;

import java.util.List;

@Builder
public class Week {
    List<Workday> workdayList;
}
