package com.Course.Course.Management.System.Service;

import com.Course.Course.Management.System.Model.Course;

import java.util.List;

public interface CourseService {
//   to save new course
   public Course saveCourse(Course course);
//   to update course
   public Course updateCourse(Course course);
//   to fetch all course
    public List<Course> getCourses();
//    fetch course by id
    public Course getCourse(long id);
//    to delete course
    public void deleteCourse(long id);



}
