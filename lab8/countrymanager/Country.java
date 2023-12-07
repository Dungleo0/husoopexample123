package lab8.countrymanager;

public abstract class Country {
    protected String code;
    protected String name;

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    public abstract double getArea();
    public abstract double getGdp();
    public abstract int getPopulation();

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
}
