package ma.banque.app.iservice;

import ma.banque.app.entity.Agence;
import ma.banque.app.entity.Operation;

import java.util.List;

public interface IOperation {
    Operation create(Operation operation);

    Operation Update(Operation operation);

    boolean delete(Operation operation);

    List<Operation> findAll();
}
