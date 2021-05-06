package eu.kijora.schoolschedule.repository;

import eu.kijora.schoolschedule.model.school.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
