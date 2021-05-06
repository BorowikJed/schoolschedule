package eu.kijora.schoolschedule.model.school;


import lombok.Builder;

import java.util.Map;

@Builder
public class ClassOfStudents {
    String name;
    Map<Subject, Integer> subjectPerWeek;
}
