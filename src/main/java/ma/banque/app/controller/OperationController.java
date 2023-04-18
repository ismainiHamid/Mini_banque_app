package ma.banque.app.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import ma.banque.app.entities.Operation;
import ma.banque.app.services.OperationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Operation")
@RestController
@RequestMapping(value = "/banque/operation")
@AllArgsConstructor
public class OperationController {
    private OperationService operationService;

    @RequestMapping(path = {"/SaveRecord"}, method = {RequestMethod.POST, RequestMethod.PUT})
    public Operation create(@RequestBody Operation object) {
        return operationService.create(object);
    }

    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody Operation object) {
        operationService.delete(object);
    }

    @GetMapping(value = "/")
    public List<Operation> findAll() {
        return operationService.findAll();
    }
}
