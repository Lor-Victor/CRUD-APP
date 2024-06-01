package CRUD.app.task.manager.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/{taskId}")
    public String getTaskById(int taskId, Model model){
        model.addAttribute("task", taskService);
        return "task-detail";
    }

    @PostMapping("/create")
    public String createNewTask(Task task){
        taskService.addNewTask(task);
        return "redirect:/tasks/all";
    }

    @PostMapping("/update")
    public String updateTasks(Task task){
        taskService.addNewTask(task);
        return "redirect:/tasks/" + task.getTaskId();
    }

    @GetMapping("/delete/{taskId}")
    public String deleteTasks(int taskId) {
        taskService.deleteTaskById(taskId);
        return "redirect:/tasks/all";
    }

}
