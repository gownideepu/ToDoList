package com.bridgelabz.ToDoList.Model;

import com.bridgelabz.ToDoList.Dto.MyDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MyModel {
    public MyModel() {
    }

    public MyModel(MyDto myDto){
        this.name=myDto.name;
        this.description= myDto.description;
    }
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
