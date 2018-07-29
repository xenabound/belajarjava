package dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by sukenda on 29/07/18.
 * Project Belajar
 */

public interface BaseDAO<T> {

    T save(T param);

    T update(T param);

    int delete(T param);

    T findById(int id);

    List<T> findAll();
}
