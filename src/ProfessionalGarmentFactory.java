/**
 * ProfessionalGarmentFactory implements the GarmentFactory interface to create
 * professional-themed garments: ProfessionalTop, ProfessionalPants, and ProfessionalShoes.
 */
public class ProfessionalGarmentFactory implements GarmentFactory {

    /**
     * Creates a new ProfessionalTop instance.
     *
     * @return A ProfessionalTop object.
     */
    public Top createTop() {
        return new ProfessionalTop();
    }

    /**
     * Creates a new ProfessionalPants instance.
     *
     * @return A ProfessionalPants object.
     */
    public Pants createPants() {
        return new ProfessionalPants();
    }

    /**
     * Creates a new ProfessionalShoes instance.
     *
     * @return A ProfessionalShoes object.
     */
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
