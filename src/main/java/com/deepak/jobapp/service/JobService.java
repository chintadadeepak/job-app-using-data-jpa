package com.deepak.jobapp.service;

import com.deepak.jobapp.dao.JobRepository;
import com.deepak.jobapp.models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository repository;
    public List<Job> getAllJobs() {
        return repository.findAll();
    }
    public Job addJob(Job job) {
        return repository.save(job);
    }

    public Job updateJob(Job job) {
        return repository.save(job);
    }

    public Job deleteJob(int id) {
        Optional<Job> job = repository.findById(id);
        repository.deleteById(id);
        return job.orElse(new Job());
    }

    public List<Job> searchJobsByKeyword(String keyword) {
        return repository.findByJobNameContainingOrJobDescContaining(keyword, keyword);
    }
}
