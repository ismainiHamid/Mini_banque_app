package ma.banque.app.controller;

import lombok.AllArgsConstructor;
import ma.banque.app.entities.Operation;
import ma.banque.app.services.OperationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/banque/operations")
@AllArgsConstructor
public class OperationController {
    private OperationService operationService;

    @RequestMapping(path = {"/create", "/update"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Operation create(Operation object) {
        return operationService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(Operation object) {
        operationService.delete(object);
    }

    @GetMapping(value = "/")
    public List<Operation> findAll() {
        return operationService.findAll();
    }
}
