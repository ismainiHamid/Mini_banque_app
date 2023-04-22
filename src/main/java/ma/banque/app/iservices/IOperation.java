package ma.banque.app.iservices;

import ma.banque.app.entities.Operation;

import java.util.List;

public interface IOperation {
    Operation create(Operation operation);

    boolean delete(Operation operation);

    List<Operation> findAll();
}
