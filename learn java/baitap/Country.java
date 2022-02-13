package baitap;
public class Country {
    public static int numberOfCountries = 20;
   private String name;
   private int population;
   private String capital;
   public Country(){

   }

   public Country(String name, int population, String capital) {
       this.name = name;
       this.population = population;
       this.capital = capital;
   }

   public static int getNumberOfCountries() {
       return numberOfCountries;
   }

   public static void setNumberOfCountries(int numberOfCountries) {
       Country.numberOfCountries = numberOfCountries;
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

   public String getCapital() {
       return capital;
   }

   public void setCapital(String capital) {
       this.capital = capital;
   }
   public void getDetails(){
       System.out.println(""+ "Country{" + "name="+name+",population="+population+",captial="+capital+'}');
   }

   @Override
   public String toString() {
       return "Country{" +
               "name='" + name + '\'' +
               ", population=" + population +
               ", capital='" + capital + '\'' +
               '}';
   }

}
