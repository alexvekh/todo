package com.boocrun.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.boocrun.domain.TodoItem;

@Repository
public class TodoRepository {
    
    private List<TodoItem> todoItems = new ArrayList<>();
    
    public List<TodoItem> fetchAllTodoItems (){
	return todoItems;	
    }

}
