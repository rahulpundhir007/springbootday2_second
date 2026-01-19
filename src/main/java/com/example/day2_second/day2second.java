package com.example.day2_second;

import com.example.day2_second.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class day2second {
    @GetMapping("/")
    public ArrayList<StudentModel> getStudent(){
        ArrayList<StudentModel> arr = new ArrayList<>();
        StudentModel student1=new StudentModel(1,"Rahul","rahul@gmail","58585858");
        arr.add(student1);
        StudentModel student2=new StudentModel(12,"Sixer","rahul@gmail","58585858");
        arr.add(student2);
        return arr;
    }

}
