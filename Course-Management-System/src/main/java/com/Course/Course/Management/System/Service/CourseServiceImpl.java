package com.Course.Course.Management.System.Service;

import com.Course.Course.Management.System.Model.Course;
import com.Course.Course.Management.System.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
   private CourseRepository courseRepository;
    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(long id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public void deleteCourse(long id) {
        courseRepository.deleteById(id);

    }
}
