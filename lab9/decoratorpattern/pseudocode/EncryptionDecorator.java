package lab9.decoratorpattern.pseudocode;

public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("EncryptionDecorator write "+data);
    }
    @Override
    public String readData() {
        return "Write data to file: FileDataSource";
    }
}
