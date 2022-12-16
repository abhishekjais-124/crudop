package com.crudop.crudop.dao;

import com.crudop.crudop.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {


}
