package ma.banque.app.imetier;

import java.util.List;

public interface IMetier<T> {
    T create(T object);

    T Update(T object);

    boolean delete(T object);

    List<T> findAll();
}
