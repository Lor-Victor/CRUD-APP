package CRUD.app.task.manager.Goal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/goals")
public class GoalController {

    @Autowired
    GoalService goalService;

    @GetMapping("/all")
    public String getAllGoals(Model model){
        model.addAttribute("goalList", goalService.getAllGoals());
        return "goal-list";
    }

    @GetMapping("/{goalId}")
    public String getGoalById(@PathVariable int goalId, Model model){
        model.addAttribute("student", goalService.getGoalById(goalId));
        return "goal-detail";
    }

    @PostMapping("/create")
    public String createNewGoal(Goal goal){
        goalService.addNewGoal(goal);
        return "redirect:/goals/all";
    }

    @PostMapping("/update/{goalId}")
    public String updateGoal(Goal goal){
        goalService.addNewGoal(goal);
        return "redirect:/goals/" + goal.getGoalId();
    }

    @GetMapping("delete/{goalId}")
    public String deleteGoalById(@PathVariable int goalId){
        goalService.deleteGoalById(goalId);
        return "redirect:'goals/all";
    }

}
