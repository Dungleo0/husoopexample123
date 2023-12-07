package homework8.phonebook;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBookList implements PhoneBook {
    private ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student x : phoneBook) {
            if (x.getName().equals(name)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student x : phoneBook) {
            if (x.getLastname().equalsIgnoreCase(lastname)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student x : phoneBook) {
            if (x.getPhone().equals(phone)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        Iterator<Student> itr = phoneBook.iterator();
        while (itr.hasNext()){
            Student x = itr.next();
            if(x.getPhone().equals(phone)){
                itr.remove();

            }
        }
    }

}
