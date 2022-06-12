/**
 * Superclass for all the dessert classes.
 * @author Mashu Takeda mtakeda9
 * @version 1
 */
public abstract class Dessert implements Comparable<Dessert> {

    private String flavor;
    private double sweetness;

    /**
     * A constructor that takes in flavor and sweetness of the dessert.
     * @param flavor the flavor of the cake
     * @param sweetness the sweetness of the cake
     */
    public Dessert(String flavor, double sweetness) {
        this.flavor = flavor;
        this.sweetness = sweetness;
    }

    /**
     * A default constructor that sets flavor to vanilla and sweetness to 25.0.
     */
    public Dessert() {
        this("vanilla", 25);
    }

    @Override
    public String toString() {
        return String.format("This is a %s dessert with a sweetness of %.2f.", flavor, sweetness);
    }

    @Override
    public boolean equals(Object o) {
        Dessert anotherDessert = (Dessert) o;
        return (this.flavor == anotherDessert.getFlavor() && this.sweetness == anotherDessert.getSweetness());
    }

    @Override
    public int compareTo(Dessert anotherDessert) {
        if (this.sweetness - anotherDessert.sweetness > 0) {
            return 1;
        } else if (this.sweetness - anotherDessert.sweetness < 0) {
            return -1;
        } else {
            return this.flavor.compareTo(anotherDessert.flavor);
        }
    }

    /**
     * Getter for the flavor variable.
     * @return String representing flavor of the cake
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Getter for the sweetness variable.
     * @return double representing sweetness of the cake.
     */
    public double getSweetness() {
        return sweetness;
    }
}