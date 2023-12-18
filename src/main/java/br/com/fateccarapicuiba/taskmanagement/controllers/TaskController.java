package br.com.fateccarapicuiba.taskmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.com.fateccarapicuiba.taskmanagement.irepository.TaskRepository;
import br.com.fateccarapicuiba.taskmanagement.models.PriorityTaskEnum;
import br.com.fateccarapicuiba.taskmanagement.models.StatusTaskEnum;
import br.com.fateccarapicuiba.taskmanagement.models.TaskModel;

@RestController
public class TaskController {

    @Autowired  
    TaskRepository taskRepository;

    @GetMapping("/tasks")
    public ModelAndView listarTasks() {
        ModelAndView modelAndView = new ModelAndView("tasks.html");
        List<TaskModel> tasks = taskRepository.findAll();
        modelAndView.addObject("tasks", tasks);
        modelAndView.addObject("task", new TaskModel());
        return modelAndView;

    }

    @PostMapping("/tasks")
    public RedirectView salvarTask(TaskModel taskModel) {

        StatusTaskEnum[] statusValues = StatusTaskEnum.values();
        PriorityTaskEnum[] priorityValues = PriorityTaskEnum.values();

        int statusValue = taskModel.getStatus().getValue();
        int priorityValue = taskModel.getPriority().getValue();

        // Validar os valores antes de acessar o array
        if (statusValue >= 0 && statusValue < statusValues.length) {
            taskModel.setStatus(statusValues[statusValue]);
        } else {
            // Tratar valor inválido, lançar exceção ou definir um valor padrão
        }

        if (priorityValue >= 0 && priorityValue < priorityValues.length) {
            taskModel.setPriority(priorityValues[priorityValue]);
        } else {
            // Tratar valor inválido, lançar exceção ou definir um valor padrão
        }

        taskRepository.save(taskModel);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/tasks");
        return redirectView;

    }
}
