package com.dailycodebuffer.springboottutorials.repository;

import com.dailycodebuffer.springboottutorials.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {


}
