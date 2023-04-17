package ma.banque.app.controller;

import lombok.AllArgsConstructor;
import ma.banque.app.entities.Employee;
import ma.banque.app.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/banque/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @RequestMapping(path = {"/create", "/update"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Employee create(Employee object) {
        return employeeService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(Employee object) {
        employeeService.delete(object);
    }

    @GetMapping(value = "/")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
