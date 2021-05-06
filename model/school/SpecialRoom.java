package eu.kijora.schoolschedule.model.school;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Set;


@SuperBuilder
public class SpecialRoom extends Room{
    Set<SpecialSubject> specialSubjects;

//    @Builder(builderMethodName = "specialRoomBuilder")
//    public SpecialRoom(String name, Boolean taken, Set<SpecialSubject> specialSubjects) {
//        super(name, taken);
//        this.specialSubjects = specialSubjects;
//    }
}
