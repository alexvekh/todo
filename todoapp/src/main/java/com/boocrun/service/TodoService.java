package com.boocrun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boocrun.domain.TodoItem;
import com.boocrun.repository.TodoRepository;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepo;
    
    public List<TodoItem> fetchAllTodoItems(){
	return todoRepo.fetchAllTodoItems();
    }
}
