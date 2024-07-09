public class Main {
    public static void main(String[] args) { // Create an array of GarmentFactory instances
        GarmentFactory[] factories = {
                new ProfessionalGarmentFactory(),
                new CasualGarmentFactory(),
                new PartyGarmentFactory()
        };

        for (GarmentFactory factory : factories) {  // Loop through each factory to simulate garment creation
            GarmentSimulator simulator = new GarmentSimulator(factory);   // Create a GarmentSimulator instance with the current factory
            simulator.showGarment(); // Display the garments created by the simulator
            System.out.println("------------------------------");
        }
    }
}
