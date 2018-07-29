import dao.UserDAO;
import dao.impl.UserDAOImpl;
import entity.User;

import java.util.List;

/**
 * Created by sukenda on 29/07/18.
 * Project Belajar
 */
public class MainCRUD {

    private static UserDAO dao = new UserDAOImpl();

    public static void main(String[] args) {
        /*List<User> users = dao.findAll();
        for (User data : users){
            System.out.println(data.toString());
        }*/

        System.out.println(dao.findById(1).toString());

        System.out.println(String.valueOf(dao.delete(new User(1))));

        dao.update(new User(1,"Admin update again", "Password update again"));
    }
}
