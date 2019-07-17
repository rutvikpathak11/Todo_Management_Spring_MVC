package com.app.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.todo.Todo;
import com.app.todo.TodoService;

@RestController
public class TodoRestController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value = "/todos/", method = RequestMethod.GET)
	public List<Todo> retrieveAllTodos(){
		
		return service.retrieveTodos("rutvik");
	}
	
	@RequestMapping(value = "/todos/{id}", method = RequestMethod.GET)
	public Todo retrieveTodo(@PathVariable int id){
		
		return service.retrieveTodo(id);
	}
}
