public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getNeededArea() {
        return neededArea;
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
