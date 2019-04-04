package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	public List<Department> findAll(){
		List<Department> objListaDep = new ArrayList<>();
		objListaDep.add(new Department(1, "Books"));
		objListaDep.add(new Department(2, "Electronics"));
		objListaDep.add(new Department(3, "Computers"));
		return objListaDep;
	}

}
