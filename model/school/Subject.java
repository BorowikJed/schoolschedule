package eu.kijora.schoolschedule.model.school;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@SuperBuilder
@Getter
public class Subject {
    String name;
}
