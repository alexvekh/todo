package com.boocrun.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boocrun.domain.TodoItem;
import com.boocrun.service.TodoService;

//http://localhost:8080
@RestController
@CrossOrigin(origins = "http://localhost:3000")
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
    
    @PutMapping("/api/todoItems/{id}")
    public ResponseEntity<?> updateTodoItem(@PathVariable Integer id, @RequestBody TodoItem todoItem) {
	// call the service
	TodoItem updateTodoItem = todoService.updateTodoItem(id, todoItem);
	// get the data back from server
	
	// send it! (back to front-end)
	return ResponseEntity.ok(updateTodoItem);
  }

}
