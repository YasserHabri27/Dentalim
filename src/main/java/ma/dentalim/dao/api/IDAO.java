package ma.dentalim.dao.api;

import java.util.List;

public interface IDAO<T, ID> {
    T save(T entity);
    T findById(ID id);
    List<T> findAll();
    void deleteById(ID id);
}

