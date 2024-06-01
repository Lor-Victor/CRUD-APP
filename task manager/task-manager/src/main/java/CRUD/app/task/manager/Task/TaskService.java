package CRUD.app.task.manager.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;

    public Task getTaskById(int taskId){return taskRepository.findById(taskId).orElse(null);}
    public void addNewTask(Task task){taskRepository.save(task);}
    public void deleteTaskById(int taskId){taskRepository.deleteById(taskId);}

}
