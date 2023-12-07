package lab9.singletonpattern.pseudocode;

public class Database {
    private static Database instance;

    public Database() {
    }

    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public void query() {
        System.out.println("Query successful " );
    }
}
