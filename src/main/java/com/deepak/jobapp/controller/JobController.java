package com.deepak.jobapp.controller;

import com.deepak.jobapp.models.Job;
import com.deepak.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class JobController {

    @Autowired
    private JobService service;
    @GetMapping("jobs")
    public List<Job> getAllJobs() {
        return service.getAllJobs();
    }
    @PostMapping("job")
    public Job addJob(@RequestBody Job job) {
        return service.addJob(job);
    }

    @PutMapping("job")
    public Job updateJob(@RequestBody Job job) {
        return service.updateJob(job);
    }

    @DeleteMapping("job/{id}")
    public Job deleteJob(@PathVariable int id) {
        return service.deleteJob(id);
    }

    @GetMapping("keyword/{keyword}")
    public List<Job> searchByKeyword(@PathVariable String keyword) {
        return service.searchJobsByKeyword(keyword);
    }

}
