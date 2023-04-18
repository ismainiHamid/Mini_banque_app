package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Employee;
import ma.banque.app.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Employee")
@RestController
@RequestMapping(value = "/banque/employee")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @RequestMapping(path = {"/SaveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
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
