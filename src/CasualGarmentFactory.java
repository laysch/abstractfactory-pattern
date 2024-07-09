/**
 * CasualGarmentFactory implements the GarmentFactory interface to create
 * casual-themed garments: CasualTop, CasualPants, and CasualShoes.
 */
public class CasualGarmentFactory implements GarmentFactory {

    /**
     * Creates a new CasualTop instance.
     *
     * @return A CasualTop object.
     */
    public Top createTop() {
        return new CasualTop();
    }

    /**
     * Creates a new CasualPants instance.
     *
     * @return A CasualPants object.
     */
    public Pants createPants() {
        return new CasualPants();
    }

    /**
     * Creates a new CasualShoes instance.
     *
     * @return A CasualShoes object.
     */
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
