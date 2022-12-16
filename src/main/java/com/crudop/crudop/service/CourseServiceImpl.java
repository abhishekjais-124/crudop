package com.crudop.crudop.service;

import com.crudop.crudop.dao.CourseDao;
import com.crudop.crudop.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl(){

    }

    @Override
    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourseById(Long courseId) {
        return courseDao.findById(courseId).get();
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseDao.deleteById(courseId);
    }
}
