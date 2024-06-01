package CRUD.app.task.manager.Task;

import CRUD.app.task.manager.Goal.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Integer> {
    @Query(value = "select a task", nativeQuery = true)
    public List<Task> getTaskTitle(String title);
//    @Query(value = "select t from Task t where t.title = :title", nativeQuery = true)
//    List<Task> getTaskByTitle(@Param("title") String title);
}
