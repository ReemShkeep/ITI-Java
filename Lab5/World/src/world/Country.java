package world;

public class Country
{
    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private double gnp;
    private int capital;
    

    public Country(String code, String name, String continent, double surfaceArea, double gnp, int capital, int population) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfaceArea = surfaceArea;
        this.gnp = gnp;
        this.capital = capital;
        this.population = population;
    }
    private int population;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getGnp() {
        return gnp;
    }

    public int getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
    public void prindData()
    {
        System.out.println(this.code + this.name + this.continent +
        this.surfaceArea +
        this.gnp +
        this.capital +
        this.population);
    }
}
