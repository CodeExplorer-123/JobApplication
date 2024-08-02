package com.embarkx.firstjobapp.company;

import com.embarkx.firstjobapp.job.Job;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Company {
    private Long id;
    private String name;
    private String description;

    @OneToMany
    private List<Job> jobs;

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
