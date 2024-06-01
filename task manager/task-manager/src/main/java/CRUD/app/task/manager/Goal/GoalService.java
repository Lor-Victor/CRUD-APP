package CRUD.app.task.manager.Goal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalService {

    @Autowired
    GoalRepository goalRepository;

    public Object getAllGoals(){ return goalRepository.findAll();}
    public  Goal getGoalById(int goalId){return goalRepository.findById(goalId).orElse(null);}
    public void deleteGoalById(int goalId){goalRepository.deleteById(goalId);}
    public void addNewGoal(Goal goal){goalRepository.save(goal);}

}
