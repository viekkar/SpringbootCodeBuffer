package com.dailycodebuffer.springboottutorials.service;

import com.dailycodebuffer.springboottutorials.entity.Department;
import com.dailycodebuffer.springboottutorials.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public String deletDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
        return "Department deleted successfully!!";
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
       Department depDB=departmentRepository.findById(departmentId).get();

       if(Objects.nonNull(department.getDepartmentName()) &&! "".equalsIgnoreCase(department.getDepartmentName())){
            depDB.setDepartmentName(department.getDepartmentName());
       }
       if(Objects.nonNull(department.getDepartmentCode()) &&! "".equalsIgnoreCase(department.getDepartmentCode())){
            depDB.setDepartmentCode(department.getDepartmentCode());
       }
       if(Objects.nonNull(department.getDepartmentAddress()) &&! "".equalsIgnoreCase(department.getDepartmentAddress())){
            depDB.setDepartmentAddress(department.getDepartmentAddress());
       }


        return departmentRepository.save(depDB);
    }
}
