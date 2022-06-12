/**
 * This class will describe a certain kind of dessert that Bob can pick: cakes. This class extends the Dessert class.
 * @author Mashu Takeda mtakeda9
 * @version 1
 */
public class Cake extends Dessert {
    private String frosting;

    /**
     * A constructor that takes in flavor, sweetness, and frosting of the cake.
     * @param flavor flavor of the cake
     * @param sweetness sweetness of the cake
     * @param frosting what the frosting of the cake is
     */
    public Cake(String flavor, double sweetness, String frosting) {
        super(flavor, sweetness);
        this.frosting = frosting;
    }

    /**
     * A constructor that takes in the flavor and sets the sweetness to 45.0 and frosting to vanilla.
     * @param flavor flavor of the cake
     */
    public Cake(String flavor) {
        this(flavor, 45.0, "vanilla");
    }

    @Override
    public String toString() {
        return String.format("This is a %s cake with a %s frosting and has a sweetness of %.2f.",
            getFlavor(), frosting, getSweetness());

    }

    @Override
    public boolean equals(Object o) {
        boolean equal;
        if (o == null) {
            equal = false;
        } else if (o instanceof Cake) {
            equal = super.equals(o) && this.frosting.equals(((Cake) o).frosting);
        } else {
            equal = false;
        }
        return equal;
    }

}