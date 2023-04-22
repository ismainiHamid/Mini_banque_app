package ma.banque.app.iservices;

import ma.banque.app.entities.Employee;

import java.util.List;

public interface IEmployee {
    Employee create(Employee employee);

    boolean delete(Employee employee);

    List<Employee> findAll();
}
