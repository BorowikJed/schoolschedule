package eu.kijora.schoolschedule.model.school;

import lombok.Builder;

import java.util.List;

@Builder
public class Teacher {
    String name;
    List<Subject> subjects;
}
