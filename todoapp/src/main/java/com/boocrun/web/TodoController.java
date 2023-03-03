package com.boocrun.web;

import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080
@RestController
public class TodoController {
  
    
    //	HttpRequest ---> Controller ---> Service ---> Repository 
    //	front-end   <--- Controller <--- Service <---
    
    
    //fetch all todo items (from database)
    @GetMapping("/api/todoItems")
    public ResponseEntity<?> fetchAllTodoItems () {
    
  }

}
