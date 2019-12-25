package com.abhishek.Sample;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

//import bootsample.dao.TaskRepository;
//import bootsample.model.Task;

@Service
@Transactional
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll(){
        List<Task> tasks = new ArrayList<>();
        for(Task task : taskRepository.findAll()){
            tasks.add(task);
        }
        return tasks;
    }

    //Optional<Task> findByid(int id)
    //
      //  return taskRepository.findById(id);
    //}

    //public Task findTask(int id){
      //  return taskRepository.find(id);
    //}

    public void save(Task task){
        taskRepository.save(task);
    }

    public void delete(int id){
        taskRepository.deleteById(id);
    }

    public Object findByid(int id) {
        return taskRepository.findById(id);
    }
}
