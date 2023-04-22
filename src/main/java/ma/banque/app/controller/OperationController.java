package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Operation;
import ma.banque.app.services.OperationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Operations")
@RestController
@RequestMapping(value = "/banque/operations")
@AllArgsConstructor
public class OperationController {
    private OperationService operationService;

    @RequestMapping(path = {"/saveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Operation create(@RequestBody Operation operation) {
        return operationService.create(operation);
    }

    @DeleteMapping(value = "/delete")
    public boolean delete(@RequestBody Operation operation) {
        return operationService.delete(operation);
    }

    @GetMapping(value = "/read")
    public List<Operation> findAll() {
        return operationService.findAll();
    }
}
