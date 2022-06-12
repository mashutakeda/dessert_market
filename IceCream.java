/**
 * This class will describe a certain kind of dessert that Bob can pick: ice cream. Write this class so Bob can
 * have ice cream. This class will have to extend the Dessert class.
 * @author Mashu Takeda mtakeda9
 * @version 1
 */
public class IceCream extends Dessert {
    private int scoops;
    private boolean cone;

    /**
     * A constructor that takes in flavor, sweetness, scoops, and cone of the ice cream.
     * @param flavor flavor of the ice cream
     * @param sweetness flavor of the ice cream
     * @param scoops number of scoops of ice cream you get
     * @param cone if the ice cream has a cone
     */
    public IceCream(String flavor, double sweetness, int scoops, boolean cone) {
        super(flavor, sweetness);
        this.cone = cone;
        this.scoops = scoops;
    }

    /**
     * A constructor that takes in scoops and cone of the ice cream and sets flavor to vanilla and
     * sweetness to 45.0.
     * @param scoops number of scoops of ice cream you get
     * @param cone if the ice cream has a cone
     */
    public IceCream(int scoops, boolean cone) {
        this("vanilla", 45.0, scoops, cone);
    }

    /**
     * A default constructor that assigns flavor to vanilla, sweetness to 45.0, scoops to 1, and
     * cone to false.
     */
    public IceCream() {
        this("vanilla", 45.0, 1, false);
    }

    @Override
    public String toString() {
        if (cone) {
            return String.format("This is a %s ice cream with %d scoops and has a cone.",
                getFlavor(), scoops);

        } else {
            return String.format("This is a %s ice cream with %d scoops and does not have a cone.",
                getFlavor(), scoops);
        }
    }

    @Override
    public boolean equals(Object o) {
        IceCream anotherIceCream = (IceCream) o;
        if (super.equals(o) && this.cone == anotherIceCream.cone) {
            return true;
        }
        return false;

    }
}