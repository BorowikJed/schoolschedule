package eu.kijora.schoolschedule.model.schedule;

import eu.kijora.schoolschedule.model.school.Room;
import eu.kijora.schoolschedule.model.school.Subject;
import eu.kijora.schoolschedule.model.school.Teacher;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Lesson {
    Subject subject;
    Room room;
    Teacher teacher;
    LocalDateTime time;
}
