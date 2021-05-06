package eu.kijora.schoolschedule.model.school;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

@SuperBuilder
@Getter
@Entity
public class Subject {

    @Id
    private Long id;

    String name;

    @ManyToMany
    @JoinTable(name = "subject_teacher")
    Set<Teacher> teachers;
}
