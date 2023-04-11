package com.bridgelabz.ToDoList.Repository;

import com.bridgelabz.ToDoList.Model.MyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepo extends JpaRepository<MyModel,Long> {

}
