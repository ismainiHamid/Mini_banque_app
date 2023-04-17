package ma.banque.app.services;

import lombok.AllArgsConstructor;
import ma.banque.app.IMetier.IMetier;
import ma.banque.app.entities.Operation;
import ma.banque.app.repository.OperationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class OperationService implements IMetier<Operation> {
    private OperationRepository operationRepository;

    @Override
    public Operation create(Operation object) {
        if (Objects.isNull(object)) return null;
        return this.operationRepository.save(object);
    }

    @Override
    public void delete(Operation object) {
        this.operationRepository.delete(object);
    }

    @Override
    public List<Operation> findAll() {
        return this.operationRepository.findAll();
    }
}
