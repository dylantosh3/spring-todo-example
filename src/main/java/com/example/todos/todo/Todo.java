package com.example.todos.todo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String title;
    private boolean complete;

    public Todo(String description, String title, boolean complete){
        this.description = description;
        this.title = title;
        this.complete = complete;
    }
}
