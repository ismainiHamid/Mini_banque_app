package ma.banque.app.IMetier;

import java.util.List;

public interface IMetier<T> {
    T create(T object);

    void delete(T object);

    List<T> findAll();
}
