package com.wissen.model;

public class NewEmployee extends Employee implements Register  {
    public NewEmployee(Integer id, String job, Integer workHours, Integer salary) {
        super(id, job, workHours, salary);
    }

    public NewEmployee() {
        super();
    }

    @Override
    public Integer calcSalary(Integer workhours) {
        return super.calcSalary(workhours);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public Integer getSalary() {
        return super.getSalary();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public String getJob() {
        return super.getJob();
    }

    @Override
    public void setJob(String job) {
        super.setJob(job);
    }

    @Override
    public void setWorkHours(Integer workHours) {
        super.setWorkHours(workHours);
    }

    @Override
    public Integer getWorkHours() {
        return super.getWorkHours();
    }

    @Override
    public Integer saveId() {
        int id1=(int) Math.random();
        this.setId(id1);
        return this.getId();
    }
}
