package KtraGK;

import java.util.ArrayList;

public class FruitList {
    private ArrayList<Fruit> Fruits = new ArrayList<>();
    public FruitList() {
        Fruit fruit1 = new FruitIn(1, "xoài", 30, 2.2);
            Fruits.add(fruit1);
            Fruit fruit2 = new FruitIn(2, "na", 10, 2.5);
            Fruits.add(fruit2);
            Fruit fruit3 = new FruitOut(3, "xoài", 40, "Hàn Quốc", 15.2);
            Fruits.add(fruit3);
        }

        public void themfruit(){
            char nhapNua = 'N';
            do{
                System.out.println("Press I: tạo FruitIn");
                System.out.println("Press O: tạo FruitOut");
                System.out.println("Press E: thoát nhập");
                System.out.println("Enter your choice I/O/E: ");
                char opt = Validation.in.nextLine().charAt(0);
                Fruit fruitnhap = new Fruit();
                switch (opt){
                    case 'I':
                        System.out.println("Nhập số id: ");
                        int id1 = Validation.checkInputInt();
                        System.out.println("Nhập tên trái cây: ");
                        String tc1 = Validation.checkInputString();
                        System.out.println("Nhập giá tiền: ");
                        double gt = Validation.checkInputDouble();
                        System.out.println("Nhập phí nội bộ: ");
                        double pnb = Validation.checkInputDouble();
                        fruitnhap = new FruitIn(id1,tc1,gt,pnb);
                        break;
                    case 'O':
                        System.out.println("Nhập số id: ");
                        int id2 = Validation.checkInputInt();
                        System.out.println("Nhập tên trái cây: ");
                        String tc2 = Validation.checkInputString();
                        System.out.println("Nhập giá tiền: ");
                        double gt2 = Validation.checkInputDouble();
                        System.out.println("Nhập nước xuất khẩu: ");
                        String nc = Validation.checkInputString();
                        System.out.println("Nhập phí nhập khẩu: ");
                        double pnt =Validation.checkInputDouble();
                        fruitnhap = new FruitOut(id2,tc2,gt2,nc,pnt);
                        break;
                    case 'E':
                        return;
                    default:
                        System.out.println("Invalid");
                }
                Fruits.add(fruitnhap);
                System.out.println("Muốn nhập nữa hay không Y/N: ");
                nhapNua = Validation.in.nextLine().charAt(0);
            }while (nhapNua == 'Y');
        }

        public void hienthi(){
            for(Fruit mine : Fruits){
                System.out.println(""+mine.toString());
                System.out.println(""+mine.priceForSale());
                System.out.println("");
            }
        }
        
        public void tong(){
        double sum = 0;
            for (Fruit element : Fruits) {
                sum += element.getPrice();
            }   
            System.out.println("Tổng Fruit = " + sum);
        }
}
