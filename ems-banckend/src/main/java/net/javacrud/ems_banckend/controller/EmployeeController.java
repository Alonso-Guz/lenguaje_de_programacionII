package net.javacrud.ems_banckend.controller;

import lombok.AllArgsConstructor;
import net.javacrud.ems_banckend.dto.EployeeDTO;
import net.javacrud.ems_banckend.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    //Build Add Employee REST API
    @PostMapping
    public ResponseEntity<EployeeDTO> createEmployee(@RequestBody EployeeDTO employeeDTO) {
        EployeeDTO saveEmployee = employeeService.createEmployee(employeeDTO);
        return  new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }
}
