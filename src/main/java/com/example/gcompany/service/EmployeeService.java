package com.example.gcompany.service;

import com.example.gcompany.domain.Employee;
import com.example.gcompany.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public void save(Employee emp) {
        repo.save(emp);
    }


    public Employee get(long id) {
    return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

    public List<Employee> listAll() {
        return  repo.findAll();
    }
}
