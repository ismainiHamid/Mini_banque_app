package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ma.banque.app.entity.Employee;
import ma.banque.app.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Employees")
@RestController
@RequestMapping(value = "/banque/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping(value = "/create")
    public Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @PutMapping(value = "/update")
    public Employee Update(@RequestBody Employee employee) {
        return employeeService.Update(employee);
    }

    @DeleteMapping(value = "/delete")
    public boolean delete(@RequestBody Employee employee) {
        return employeeService.delete(employee);
    }

    @GetMapping(value = "/read")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
