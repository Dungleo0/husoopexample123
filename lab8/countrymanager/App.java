package lab8.countrymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITED = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        testOriginalData();
        System.out.println();

        testSortIncreasingByPopulation();
        System.out.println();

        testSortDecreasingByPopulation();
        System.out.println();

        testSortIncreasingByArea();
        System.out.println();

        testSortDecreasingByArea();
        System.out.println();

        testSortIncreasingByGdp();
        System.out.println();

        testSortDecreasingByGdp();
        System.out.println();

        testFilterAfricaCountry();
        System.out.println();

        testFilterAsiaCountry();
        System.out.println();

        testFilterEuropeCountry();
        System.out.println();

        testFilterNorthAmericaCountry();
        System.out.println();

        testFilterOceaniaCountry();
        System.out.println();

        testFilterSouthAmericaCountry();
        System.out.println();

        testFilterMostPopulousCountries();
        System.out.println();

        testFilterLeastPopulousCountries();
        System.out.println();

        testFilterLargestAreaCountries();
        System.out.println();

        testFilterSmallestAreaCountries();
        System.out.println();

        testFilterHighestGdpCountries();
        System.out.println();

        testFilterLowestGdpCountries();
        System.out.println();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.get(0).equals("code")) {
                    continue;
                }
                if (dataList.size() != 6) {
                    continue;
                }
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);
                switch (continent) {
                    case "Africa":
                        countryManager.append(new AfricaCountry(code, name, population, area, gdp));
                    case "South America":
                        countryManager.append(new SouthAmericaCountry(code, name, population, area, gdp));
                    case "Europe":
                        countryManager.append(new EuropeCountry(code, name, population, area, gdp));
                    case "Asia":
                        countryManager.append(new AsiaCountry(code, name, population, area, gdp));
                    case "North America":
                        countryManager.append(new NorthAmericaCountry(code, name, population, area, gdp));
                    case "Oceania":
                        countryManager.append(new OceaniaCountry(code, name, population, area, gdp));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITED);

            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }
        return dataLine.split(COMMA_DELIMITED);
    }

    public static void init() {
        String filePath = "lab8/data/countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {

        Country[] countries = countryManager.sortByDecreasingPopulation();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testSortIncreasingByArea() {

        Country[] countries = countryManager.sortByIncreasingArea();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testSortDecreasingByArea() {

        Country[] countries = countryManager.sortByDecreasingArea();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testSortIncreasingByGdp() {

        Country[] countries = countryManager.sortByIncreasingGdp();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testSortDecreasingByGdp() {

        Country[] countries = countryManager.sortByDecreasingGdp();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterAfricaCountry() {

        Country[] countries = countryManager.filterAfricaCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterAsiaCountry() {

        Country[] countries = countryManager.filterAsiaCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterNorthAmericaCountry() {

        Country[] countries = countryManager.filterNorthAmericaCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterOceaniaCountry() {

        Country[] countries = countryManager.filterOceaniaCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterSouthAmericaCountry() {

        Country[] countries = countryManager.filterSouthAmericaCountry();
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterMostPopulousCountries() {

        Country[] countries = countryManager.filterMostPopulousCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterLeastPopulousCountries() {

        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterLargestAreaCountries() {

        Country[] countries = countryManager.filterLargestAreaCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterSmallestAreaCountries() {

        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterHighestGdpCountries() {

        Country[] countries = countryManager.filterHighestGdpCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void testFilterLowestGdpCountries() {

        Country[] countries = countryManager.filterLowestGdpCountries(5);
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
