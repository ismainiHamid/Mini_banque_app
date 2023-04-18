package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.IMetier.IMetier;
import ma.banque.app.entities.Employee;
import ma.banque.app.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class EmployeeService implements IMetier<Employee> {
    private EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee object) {
        if (Objects.isNull(object)) return null;
        return this.employeeRepository.save(object);
    }

    @Override
    public void delete(Employee object) {
        this.employeeRepository.delete(object);
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }
}
