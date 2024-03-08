package org.example.demo22.controller;

import org.example.demo22.model.Computer;
import org.example.demo22.service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@org.springframework.stereotype.Controller
@RequestMapping("/Computers")
public class Controller {
    @Autowired
    IComputerService iStudentService;
    @GetMapping
    public ResponseEntity findAllStudent(){
        return new ResponseEntity<>(iStudentService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity create(@RequestBody Computer student){
        iStudentService.create(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity Update(@RequestBody Computer student,@PathVariable int id){
        student.setId(id);
        iStudentService.update(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity Delete(@PathVariable int id){
        iStudentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/findName")
    public ResponseEntity findStudent(@RequestParam String name){
        return new ResponseEntity<>(iStudentService.findByName(name), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable int id){
        return new ResponseEntity<>(iStudentService.findById(id).get(),HttpStatus.OK);
    }
}
