package lab9.decoratorpattern.pseudocode;

public class Application {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("somefile.dat");
        source.writeData("Salary record");

        DataSource decorator = new CompressionDecorator(source);
        decorator.writeData("Salary record");

        DataSource decorator2 = new EncryptionDecorator(decorator);
        decorator2.writeData("Salary record");

        SalaryManager manager = new SalaryManager(new DataSourceDecorator(decorator));
        System.out.println(manager.load());

    }
}