package com.abhishek.Sample;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity(name="t_tasks")
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_created;
    private String description;
    private boolean finished;
    private String name;

    public Task()
    {

    }

    public Task(Date date_created, String description, boolean finished, String name) {
        this.date_created = date_created;
        this.description = description;
        this.finished = finished;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", date_created=" + date_created +
                ", description='" + description + '\'' +
                ", finished=" + finished +
                ", name='" + name + '\'' +
                '}';
    }


}
