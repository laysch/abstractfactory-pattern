/**
 * GarmentSimulator simulates the creation and display of a complete outfit
 * consisting of a top, pants, and shoes, using a provided GarmentFactory.
 */
public class GarmentSimulator {
    private Top top;      // Represents the top garment
    private Pants pants;  // Represents the pants garment
    private Shoes shoes;  // Represents the shoes garment

    /**
     * Constructs a GarmentSimulator instance using a given GarmentFactory.
     *
     * @param factory The GarmentFactory to create the garments.
     */
    public GarmentSimulator(GarmentFactory factory) {
        this.top = factory.createTop();     // Creates a new top garment
        this.pants = factory.createPants(); // Creates a new pants garment
        this.shoes = factory.createShoes(); // Creates a new shoes garment
    }

    /**
     * Displays the type of each garment in the outfit.
     */
    public void showGarment() {
        top.garmentType();   // Displays the type of the top garment
        pants.garmentType(); // Displays the type of the pants garment
        shoes.garmentType(); // Displays the type of the shoes garment
    }
}

