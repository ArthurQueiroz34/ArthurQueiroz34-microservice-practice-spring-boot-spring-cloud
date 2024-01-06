package com.excalibur.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excalibur.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}