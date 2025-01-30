public abstract class Animal {

    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public String getSpecialCare() {
        return specialCare;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}
