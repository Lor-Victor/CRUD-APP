package CRUD.app.task.manager.Goal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRepository extends JpaRepository<Goal,Integer> {
@Query(value = "select a goal", nativeQuery = true)
public List<Goal> getGoalTitle(String title);

}
