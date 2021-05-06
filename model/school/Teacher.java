package eu.kijora.schoolschedule.model.school;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Builder
@Entity
public class Teacher {

    @Id
    private Long id;

    String name;
    @ManyToMany(mappedBy = "teachers")
    List<Subject> subjects;
}
