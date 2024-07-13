package net.javacrud.ems_banckend.repository;

import net.javacrud.ems_banckend.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<employee, Long> {

}
