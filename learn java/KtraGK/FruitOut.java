package KtraGK;

public class FruitOut extends Fruit {
    private String orgin;
    private double extraOut;

    public FruitOut(){
    }

    public FruitOut(int id, String name, double price,String orgin,double extraOut){
        super(id, name, price);
        this.orgin = orgin;
        this.extraOut = extraOut;
    }

    public double getExtraOut() {
        return extraOut;
    }

    public void setExtraOut(double extraOut) {
        this.extraOut = extraOut;
    }

    public String getOrgin() {
        return orgin;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    @Override
    public double priceForSale() {
        System.out.print("Giá bán của trái cây là: ");
        return price + extraOut + (extraOut/10);
    }

    @Override
    public String toString() {
        return "FruitOut{" +super.toString()+
                "orgin='" + orgin + '\'' +
                ", extraOut=" + extraOut +'\'' +
                '}';
    }
}

