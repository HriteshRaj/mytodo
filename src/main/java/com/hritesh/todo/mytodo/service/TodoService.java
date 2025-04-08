package com.hritesh.todo.mytodo.service;


import com.hritesh.todo.mytodo.model.Todo;
import com.hritesh.todo.mytodo.repository.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository todoRepository;
    public TodoService(TodoRepository todoRepository){
        this.todoRepository=todoRepository;
    }

    public void createTodo(Todo todo){
        todoRepository.create(todo);

    }








}
