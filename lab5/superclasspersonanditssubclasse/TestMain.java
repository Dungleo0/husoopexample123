package lab5.superclasspersonanditssubclasse;

public class TestMain {

    public static void main(String[] args) {
        Student student1 = new Student("Dung", "Thanh Xuan", "KHTN", 2023, 500.0);
        System.out.println(student1);

        System.out.println("-------------");

        Staff staff = new Staff("Tung","Cau Giay","UET",750.0);
        System.out.println(staff);
    }
}
