package com.ef.WebAppAzure4ServiceNowFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ef.WebAppAzure4ServiceNowFinal.object.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
