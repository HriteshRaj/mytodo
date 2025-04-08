package com.hritesh.todo.mytodo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {


    //fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    boolean completitionStatus;

    //adding getter setters
    public boolean isCompletitionStatus() {
        return completitionStatus;
    }

    public void setCompletitionStatus(boolean completitionStatus) {
        this.completitionStatus = completitionStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
