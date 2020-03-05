package com.wissen.model;

import java.util.*;

public class Employee {
    private Integer Id;
    private String job;
    private Integer workHours;
    private Integer salary;

    public Employee() {
    }

    public Employee(Integer id, String job, Integer workHours, Integer salary) {
        Id = id;
        this.job = job;
        this.workHours = workHours;
        this.salary = salary;
    }
    public Integer calcSalary(Integer workhours){
        if(workhours>=1000 && workhours<10000)
        {
            this.salary=10000;
        }
        return this.salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }
}
