package service;

import entity.Profile;
import entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sukenda on 28/07/18.
 * Project Belajar
 */

public class BasicCRUD {

    private List<User> datas = new ArrayList<>();
    private List<Profile> dataList = new ArrayList<>();
    private Map<String, User> dataMaps = new HashMap<>();

    public void initData() {
        datas.add(new User("admin", "admin"));
        datas.add(new User("admin1", "admin1"));
        datas.add(new User("admin2", "admin2"));

        dataMaps.put("1", new User("admin", "admin"));
        dataMaps.put("2", new User("admin 2", "admin 2"));
        dataMaps.put("3", new User("admin 3", "admin 3"));
    }

    public List<User> save(User data) {
        datas.add(data);
        return datas;
    }

    public Map<String, User> saveUsingKey(String key, User data) {
        dataMaps.put(key, data);
        return dataMaps;
    }

    public List<User> getAll(){
        return datas;
    }

    public User getDataByIndex(int index) {
        return datas.get(index);
    }

    public User getDataByKey(String index) {
        return dataMaps.get(index);
    }

    public List<User> deleteByIndex(int index) {
        datas.remove(index);
        return datas;
    }

    public Map<String, User> deleteByKey(String index) {
        dataMaps.remove(index);
        return dataMaps;
    }
}
