package KtraGK;

public class Fruit implements IFruit {
    protected int id;
    protected String name;
    protected double price;

    public Fruit(){
    }

    public Fruit(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double priceForSale() {
        return price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id='" + id + '\'' +
                ", name=" + name +'\'' +
                ", price=" + price +'\'' +
                '}';
    }
}
