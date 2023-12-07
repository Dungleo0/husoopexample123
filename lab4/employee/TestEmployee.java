package lab4.employee;

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setSalary(3000);
        System.out.println("Salary of employee is: "+employee1.getSalary());
        Employee employee2 = new Employee(1,"Nguyen","Dung",2000);
        Employee employee3 = new Employee(2,"Dinh","Hai",1500);

        System.out.println("id employee is: "+employee2.getId());

        System.out.println("Name of employee: "+employee2.getName());
        System.out.println("Name of employee: "+employee3.getName());

        System.out.println("First name "+employee3.getFirstName());
        System.out.println("Last name "+employee3.getLastName());


        System.out.println("Annual salary is:"+employee2.getAnnualSalary());

        employee3.raiseSalary(50);
        System.out.println("Employee 3 raise salary is:"+employee3.getSalary());

        System.out.println(employee2);
        System.out.println(employee3);

        employee2.setSalary(5000);
        System.out.println("Employee 2 after change is:"+ employee2.getSalary());


    }
}
