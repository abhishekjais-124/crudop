package com.crudop.crudop.controller;
import com.crudop.crudop.entity.Course;
import com.crudop.crudop.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){

        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId){
        return courseService.getCourseById(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourses(@RequestBody Course course){

        return courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<Object> deleteMapping(@PathVariable String courseId){
        try {
            courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
