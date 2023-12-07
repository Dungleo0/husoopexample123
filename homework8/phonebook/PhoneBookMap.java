package homework8.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.getPhone(),p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student x : phoneBook.values()) {
            if (x.getName().equals(name)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student x : phoneBook.values()) {
            if (x.getLastname().equals(lastname)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student x : phoneBook.values()) {
            if (x.getPhone().equals(phone)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
