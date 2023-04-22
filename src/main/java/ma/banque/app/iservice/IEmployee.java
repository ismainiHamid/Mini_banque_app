package ma.banque.app.iservice;

import ma.banque.app.entity.Employee;

import java.util.List;

public interface IEmployee {
    Employee create(Employee employee);

    boolean delete(Employee employee);

    List<Employee> findAll();
}
