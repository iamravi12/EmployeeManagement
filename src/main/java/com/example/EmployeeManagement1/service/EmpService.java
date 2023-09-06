package com.example.EmployeeManagement1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.EmployeeManagement1.entity.Employee;
import com.example.EmployeeManagement1.repository.EmpRepo;
import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

	
	@Autowired
	private EmpRepo repo;
	
	public void addEmp(Employee e)
	{
		repo.save(e);	
	}

	public List<Employee> getAllEmp() {
		return repo.findAll();
	}
	
	public Employee getEMpById(int id) {
		Optional<Employee> e = repo.findById(id);
		if (e.isPresent()) {
			return e.get();
		}
		return null;
	}
	
	public void deleteEMp(int id) {
		repo.deleteById(id);
	}
     
	

}
