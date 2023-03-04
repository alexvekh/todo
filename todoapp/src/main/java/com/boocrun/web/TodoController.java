package com.boocrun.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boocrun.domain.TodoItem;
import com.boocrun.service.TodoService;

//http://localhost:8080
@RestController
public class TodoController {
  
    
    //	HttpRequest ---> Controller ---> Service ---> Repository 
    //	front-end   <--- Controller <--- Service <---
    
    @Autowired
    private TodoService todoService;
    
    //fetch all todo items (from database)
    @GetMapping("/api/todoItems")
    public ResponseEntity<?> fetchAllTodoItems () {
	List<TodoItem> todoItems = todoService.fetchAllTodoItems();
	
	return ResponseEntity.ok(todoItems);
	//return ResponseEntity.status(HttpStatus.OK).body(todoItems);
    
  }

}
