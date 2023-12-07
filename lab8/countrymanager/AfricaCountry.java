package lab8.countrymanager;

public class AfricaCountry extends Country{
    private int population;
    private double area;
    private double gdp;

    public AfricaCountry(String code, String name, int population, double area, double gdp) {
        super(code, name);
        this.population = population;
        this.area = area;
        this.gdp = gdp;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    @Override
    public double getGdp() {
        return gdp;
    }

    @Override
    public int getPopulation() {
        return population;
    }

}
