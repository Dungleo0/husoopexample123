package lab9.decoratorpattern.pseudocode;

public class FileDataSource implements DataSource{
    private String fileName;
    public FileDataSource(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void writeData(String data) {
        System.out.println("Write data to file: FileDataSource " +data);
    }
    @Override
    public String readData() {
        return "Read data from file: FileDataSource";
    }

}
