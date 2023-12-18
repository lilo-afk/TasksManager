package br.com.fateccarapicuiba.taskmanagement.irepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fateccarapicuiba.taskmanagement.models.TaskModel;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Integer> {

}
