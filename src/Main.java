import entity.User;
import service.BasicCRUD;

import java.util.Map;

/**
 * Created by sukenda on 28/07/18.
 * Project Belajar
 */
public class Main {

    public static void main(String[] args) {
        BasicCRUD crud = new BasicCRUD();
        crud.initData();

        Map<String, User> datas = crud.saveUsingKey("4", new User("User baru", "Password Baru") );
        for (Map.Entry<String, User> map : datas.entrySet()){
            System.out.println("KEY : "+map.getKey() +" VALUE : "+map.getValue());
        }

        System.out.println("DATA USER : "+crud.getDataByIndex(0));
    }

}
