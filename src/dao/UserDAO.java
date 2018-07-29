package dao;

import entity.User;

/**
 * Created by sukenda on 29/07/18.
 * Project Belajar
 */
public interface UserDAO extends BaseDAO<User> {

    User getUserByUsername();

}
