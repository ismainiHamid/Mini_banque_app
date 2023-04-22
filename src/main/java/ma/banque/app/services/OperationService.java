package ma.banque.app.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.IServices.IOperation;
import ma.banque.app.entities.Operation;
import ma.banque.app.repository.OperationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
@AllArgsConstructor
public class OperationService implements IOperation {
    private OperationRepository operationRepository;

    @Override
    public Operation create(Operation operation) {
        if (Objects.isNull(operation)) return null;
        return this.operationRepository.save(operation);
    }

    @Override
    public boolean delete(Operation operation) {
        if (Objects.isNull(operation)) return false;
        this.operationRepository.delete(operation);
        return true;
    }

    @Override
    public List<Operation> findAll() {
        return this.operationRepository.findAll();
    }
}
