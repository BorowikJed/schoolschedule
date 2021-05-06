package eu.kijora.schoolschedule.model.school;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@SuperBuilder
public class Room {
    String name;
    Boolean taken;

//    public Room(String name, Boolean taken) {
//        this.name = name;
//        this.taken = taken;
//    }
}



//    LocalDateTime time;
//    Teacher teacher;
//    ClassOfStudents klass;
//}
