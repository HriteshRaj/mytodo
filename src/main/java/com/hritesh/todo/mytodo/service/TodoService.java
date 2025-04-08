package com.hritesh.todo.mytodo.service;


import com.hritesh.todo.mytodo.model.Todo;
import com.hritesh.todo.mytodo.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;
    public TodoService(TodoRepository todoRepository){
        this.todoRepository=todoRepository;
    }

    public void createTodo(Todo todo){
        todoRepository.create(todo);

    }

    public List<Todo> getAllTodo(){
        return todoRepository.getAllTodo();
    }

    public void updateTodo(Long id,Todo newTodo){
        Optional<Todo> oldTodo = todoRepository.findTodoById(id);

        if(oldTodo.isPresent()){
            Todo old = oldTodo.get();
            old.setTitle(newTodo.getTitle());
            old.setCompletitionStatus(newTodo.isCompletitionStatus());
            todoRepository.updateTodo(old);

        }


    }










}
