/**
 * PartyGarmentFactory implements the GarmentFactory interface to create
 * party-themed garments: PartyTop, PartyPants, and PartyShoes.
 */
public class PartyGarmentFactory implements GarmentFactory {

    /**
     * Creates a new PartyTop instance.
     *
     * @return A PartyTop object.
     */
    public Top createTop() {
        return new PartyTop();
    }

    /**
     * Creates a new PartyPants instance.
     *
     * @return A PartyPants object.
     */
    public Pants createPants() {
        return new PartyPants();
    }

    /**
     * Creates a new PartyShoes instance.
     *
     * @return A PartyShoes object.
     */
    public Shoes createShoes() {
        return new PartyShoes();
    }
}

