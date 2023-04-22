package ma.banque.app.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.banque.app.iservice.IOperation;
import ma.banque.app.entity.Operation;
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
