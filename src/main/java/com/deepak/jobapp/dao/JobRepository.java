package com.deepak.jobapp.dao;

import com.deepak.jobapp.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {
    List<Job> findByJobNameContainingOrJobDescContaining(String jobName, String jobDesc);
}
