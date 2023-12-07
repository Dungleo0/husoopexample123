package lab9.decoratorpattern.pseudocode;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Compressing " + data);
    }

    @Override
    public String readData() {
        return "Write data to file: FileDataSource";
    }

}
