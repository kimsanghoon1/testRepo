package course.operation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseListRepository extends CrudRepository<CourseList, Long> {


}