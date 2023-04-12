package ma.banque.app.IMetier;

import java.util.List;

public interface IMetier<T> {
    public T create(T object);
    public void delete(T object);
    public T findById(int id);
    public List<T> findAll();
}
