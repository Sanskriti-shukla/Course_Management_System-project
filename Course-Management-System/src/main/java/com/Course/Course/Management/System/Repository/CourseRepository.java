package com.Course.Course.Management.System.Repository;

import com.Course.Course.Management.System.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
