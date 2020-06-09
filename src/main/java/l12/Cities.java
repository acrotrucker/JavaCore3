package l12;

public class Cities {
    private String name;
    private int population;
    private String country;

    public Cities(String name, int population, String country) {
        this.name = name;
        this.population = population;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                '}';
    }
}