package lab8.countrymanager;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxlength) {
        countries = new Country[maxlength];
        this.length = 0;
    }

    public Country[] getCountries() {
        return countries;
    }

    public int getLength() {
        return length;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }
        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }
        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }
        if ((this.length) >= this.countries.length) {
            allocateMore();
        }
        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }
        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }
        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }
        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }
        return this.countries[index];
    }

    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];

        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[i].getPopulation()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];

        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[i].getPopulation()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getArea() > newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getArea() < newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length - 1; j++) {
                if (newArray[i].getGdp() > newArray[j].getGdp()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length - 1; j++) {
                if (newArray[i].getGdp() < newArray[j].getGdp()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] africaCountries = new AfricaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries[index] = (AfricaCountry) country;
                index++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] asiaCountries = new AsiaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries[index] = (AsiaCountry) country;
                index++;
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] europeCountries = new EuropeCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries[index] = (EuropeCountry) country;
                index++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {

        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries[index] = (NorthAmericaCountry) country;
                index++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {

        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries[index] = (OceaniaCountry) country;
                index++;
            }
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {

        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries[index] = (SouthAmericaCountry) country;
                index++;
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {

        Country[] mostPopulationCountries = new Country[howMany];
        Country[] newArray = sortByDecreasingPopulation();
        System.arraycopy(newArray, 0, mostPopulationCountries, 0, mostPopulationCountries.length);
        return mostPopulationCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {

        Country[] leastPopulationCountries = new Country[howMany];
        Country[] newArray = sortByIncreasingPopulation();
        System.arraycopy(newArray, 0, leastPopulationCountries, 0, leastPopulationCountries.length);
        return leastPopulationCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {

        Country[] largestAreaCountries = new Country[howMany];
        Country[] newArray = sortByDecreasingArea();
        System.arraycopy(newArray, 0, largestAreaCountries, 0, largestAreaCountries.length);
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] smallestAreaCountries = new Country[howMany];
        Country[] newArray = sortByIncreasingArea();
        System.arraycopy(newArray, 0, smallestAreaCountries, 0, smallestAreaCountries.length);
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {

        Country[] highestGdpCountries = new Country[howMany];
        Country[] newArray = sortByDecreasingGdp();
        System.arraycopy(newArray, 0, highestGdpCountries, 0, highestGdpCountries.length);
        return highestGdpCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {

        Country[] lowestGdpCountries = new Country[howMany];
        Country[] newArray = sortByIncreasingGdp();
        System.arraycopy(newArray, 0, lowestGdpCountries, 0, lowestGdpCountries.length);
        return lowestGdpCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode()).append(" ");
            }
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }

}

