package designpatterns.prototype;

import java.util.HashMap;

public class StudentRegistry {

    private HashMap<String, Student> map;

    // TODO make this a singleton
    public StudentRegistry(){
        map = new HashMap<>();
    }

    public void register(String key, Student s){
        map.put(key, s);
    }

    public Student get(String key){
        return map.get(key);
    }
}
