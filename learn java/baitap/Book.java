package baitap;
public class Book {
   
        private String title;
        private Author aut;
        private double price;
        private int quanlity = 0;
     
        public Book() {
     
        }
     
        public Book(String title, Author aut, double price) {
            this.title = title;
            this.aut = aut;
            this.price = price;
        }
     
        public Book(String title, Author aut, double price, int quanlity) {
            this.title = title;
            this.aut = aut;
            this.price = price;
            this.quanlity = quanlity;
        }
     
        public String getTitle() {
            return title;
        }
     
        public void setTitle(String title) {
            this.title = title;
        }
     
        public Author getAut() {
            return aut;
        }
     
        public void setAut(Author aut) {
            this.aut = aut;
        }
     
        public double getPrice() {
            return price;
        }
     
        public void setPrice(double price) {
            this.price = price;
        }
     
        public int getQuanlity() {
            return quanlity;
        }
     
        public void setQuanlity(int quanlity) {
            this.quanlity = quanlity;
        }
     
        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", aut=" + aut.toString() +
                    ", price=" + price +
                    ", quanlity=" + quanlity +
                    '}';
        }
}
     

