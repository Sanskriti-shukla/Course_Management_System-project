package com.Course.Course.Management.System.Controller;

import com.Course.Course.Management.System.Model.Course;
import com.Course.Course.Management.System.Service.CourseService;
import com.Course.Course.Management.System.Service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseServiceImpl courseServiceImpl;
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseServiceImpl.getCourses();
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable long id){
        return  courseServiceImpl.getCourse(id);
    }
    @PostMapping("/save-Course")
    public  Course saveCourse(@RequestBody Course course){
        return courseServiceImpl.saveCourse(course);
    }
    @PutMapping("/update-Course")
    public Course updateCourse(@RequestBody Course course){
        return courseServiceImpl.updateCourse(course);
    }




    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable long id){
          courseServiceImpl.deleteCourse(id);
          return "deleted ||";
    }

}
