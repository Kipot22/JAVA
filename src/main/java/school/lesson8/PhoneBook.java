package school.lesson8;

import java.util.HashMap;

public class PhoneBook {
    public static HashMap<String, String> pb = new HashMap<String, String>();

    public static void addPB(String name, String phone) {
        pb.put(name, phone);
    }

    public static String findPhone (String name) {
        String result = pb.get(name);
        return result;
    }

    public static void main(String[] args) {
        addPB("Ivanov", "741-258-639");
        addPB("Petrov", "741-258-640");
        addPB("Sidorov", "741-258-641");
        addPB("Ivanov", "741-258-642");
        System.out.println(pb);
        findPhone("Ivanov");
        System.out.println(findPhone("Ivanov"));

    }
}
