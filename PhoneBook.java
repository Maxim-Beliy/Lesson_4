import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> phoneBook;


    public PhoneBook() {
        phoneBook = new HashMap<>();
    }


    public void add(String lastName, String phoneNumber) {

        if (!phoneBook.containsKey(lastName)) {
            phoneBook.put(lastName, new ArrayList<>());
        }
        phoneBook.get(lastName).add(phoneNumber);
    }


    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add("Иванов", "89105553535");
        phoneBook.add("Иванов", "89082223700");
        phoneBook.add("Петров", "89204443434");
        phoneBook.add("Сидоров", "89157778888");


        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны Смирнова: " + phoneBook.get("Смирнов"));
    }
}
