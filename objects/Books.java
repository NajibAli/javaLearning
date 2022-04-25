public class Books {

    private String name;
    private String author;
    private Double price;

    Books(String name, String author, Double price){
        this.name = name;
        this.author = author;
        this.price = price;
    };

    public void setName(String name){
        this.name = name;
    };
    public void setAuthor(String author){
        this.author = author;
    };
    public void setPrice(Double price){
        this.price = price;
    };
    
    public String getName(){
        return this.name;
    };
    public String getAuthor(){
        return this.author;
    
    };
    public Double getPrice(){
        return this.price;
    };

    public String getBookDetails(){
        String name = this.getName();
        String author = this.getAuthor();
        Double price = this.getPrice();
        String detail = "Name: " + name +", Author: "+ author + ", Price: £" + price;

        return detail;
    };

    public String toString(){
        return this.name + " " + this.author + " " + this.price;
    };

    public static void main(String[] args) {

        Books[] bookArray = new Books[5];
        String[] names = {"naruto","bleach", "one piece", "berserk", "dragon ball"};
        String[] authors = {"Kishimoto","Kubo", "Oda", "Miura", "Toriyama"};
        Double[] prices = {7.99, 7.99, 7.99, 7.99, 7.99};

        for (int i = 0; i < names.length; i++) {
            Books book = new Books(names[i], authors[i], prices[i]);
            bookArray[i] = book;
        }

        Books dune = new Books("Dune1", "some guy", 4.99);
        Books dune2 = new Books("Dune2", "some guy", 4.99);
        Books dune3 = new Books("Dune3", "some guy", 4.99);
        
        Books[] bookList = {dune, dune2, dune3};


        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i].getBookDetails());
        }
        System.out.println(bookArray[0].toString());

        for (int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i]);
        }


    }
}