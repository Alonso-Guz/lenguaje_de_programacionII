package net.javacrud.ems_banckend.Mapper;

import net.javacrud.ems_banckend.dto.EployeeDTO;
import net.javacrud.ems_banckend.entity.employee;

public class EmployeeMapper {
    public  static EployeeDTO mapToEmployeeDto (employee employee) {
        return new EployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static employee mapToemployee(EployeeDTO employeeDTO) {
        return new employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail()
        );
    }
}
