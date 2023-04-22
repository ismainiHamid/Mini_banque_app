package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.IServices.IEmployee;
import ma.banque.app.entities.Employee;
import ma.banque.app.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class EmployeeService implements IEmployee {
    private EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) {
        if (Objects.isNull(employee)) return null;
        return this.employeeRepository.save(employee);
    }

    @Override
    public boolean delete(Employee employee) {
        if (Objects.isNull(employee)) return false;
        this.employeeRepository.delete(employee);
        return true;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }
}
