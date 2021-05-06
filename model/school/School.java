package eu.kijora.schoolschedule.model.school;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Builder
public class School {
    Set<ClassOfStudents> classes;
    Set<Teacher> teachers;
    Set<Room> rooms;

}
