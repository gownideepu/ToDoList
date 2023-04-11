package com.bridgelabz.ToDoList.Controller;

import com.bridgelabz.ToDoList.Dto.MyDto;
import com.bridgelabz.ToDoList.Model.MyModel;
import com.bridgelabz.ToDoList.Repository.MyRepo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MyController {
    @Autowired
    private MyRepo myRepo;
    @PostMapping("/hello")
    public MyModel addEmployee(@RequestBody MyDto myDto){
        MyModel data= new MyModel(myDto);
        return myRepo.save(data);
    }
    @GetMapping("/greeting")
    public String greeting(){
        return "completed";
    }
    @PutMapping("/put{id}")
    public MyModel update(@RequestBody MyDto myDto,@PathVariable long id){
        Optional<MyModel>data=myRepo.findById(id);
        if (data.isPresent()){
            data.get().setName(myDto.name);
            data.get().setDescription(myDto.description);
        }
        return null;
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        Optional<MyModel> data=myRepo.findById(id);
        if (data.isPresent()){
            myRepo.deleteById(id);
            return "deleted";
        }
        return null;
    }

}
