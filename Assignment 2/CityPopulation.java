public class CityPopulation {
    public static void main(String args[]) {
        double population = 80000, growth_rate = 0.05;
        int max_population = 150000;
        int years = 0;

        // till the population if less than 150,000
        while(population < max_population) {
            // increase it by 5%
            population += (growth_rate)*population;

            // add 1 year
            years += 1;
        }

        System.out.println("Population will exceed 150,000 after " + years + " years");
    }
}