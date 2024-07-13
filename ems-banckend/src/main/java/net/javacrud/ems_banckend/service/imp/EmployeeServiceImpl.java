package net.javacrud.ems_banckend.service.imp;

import lombok.AllArgsConstructor;
import net.javacrud.ems_banckend.Mapper.EmployeeMapper;
import net.javacrud.ems_banckend.dto.EployeeDTO;
import net.javacrud.ems_banckend.entity.employee;
import net.javacrud.ems_banckend.repository.EmployeeRepository;
import net.javacrud.ems_banckend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EployeeDTO createEmployee(EployeeDTO employeeDTO) {

        employee employee = EmployeeMapper.mapToemployee(employeeDTO);
        employee saveEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(saveEmployee);
    }
}
