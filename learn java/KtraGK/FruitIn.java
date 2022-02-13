package KtraGK;

public class FruitIn extends Fruit {
    private double extraIn;

    public FruitIn(){
    }

    public FruitIn(int id, String name, double price,double extraIn){
        super(id, name, price); 
        this.extraIn = extraIn;
    }

    public double getExtraIn() {
        return extraIn;
    }

    public void setExtraIn(double extraIn) {
        this.extraIn = extraIn;
    }

    @Override
    public double priceForSale() {
        System.out.print("Giá bán của trái cây là: ");
        return price + extraIn;
    }
    
    @Override
    public String toString() {
        return "FruitIn{" +super.toString()+
                "extraIn='" + extraIn + '\'' +
                '}';
    }
}
