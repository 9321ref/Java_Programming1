package day282930_Tasks.StateTask;

public class State {

    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;

    public State( String abbreviation,String politicalParty,String governor, String senator,int population){

        setName(getClass().getSimpleName()); // subclass icinde name necessary grünce burada getClass() ... methodlariyla inheritance ettik
                                            //bu methodu normalde toString yazariz print ederken subclass isimleriyle print etmesi icin Parent class ismiyle deil
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    private boolean isValidStr(String str){
        return str != null && !str.trim().isEmpty();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {

        if (!isValidStr(name)) {
            System.exit(1);
        }

        this.name = name;
    }


    public String getAbbreviation(){
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation){

        if (!isValidStr(abbreviation)) {
            System.err.println("Abbreviation must not be null, empty, or blank.");
            System.exit(1);

        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {

        if (!isValidStr(politicalParty)) {
            System.err.println("Political Party must not be null, empty, or blank.");
            System.exit(1);

        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {

        if(isValidStr(governor)){
            this.governor = governor;

        }else {
            System.err.println("Governor must not be null, empty, or blank.");
            System.exit(1);

        }

    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {

        if(isValidStr(senator)){
            this.senator = senator;
        }
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if( population < 0){
            System.err.println("population' must be greater than zero.");
            System.exit(1);
        }
        this.population = population;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
