package class17;

public class BookHM6 {
    //6) Write Book class that will have instance variables
    // and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    String name;
    String author;
    String style;
    int sales;


     BookHM6 (String bName,String bAuthor, String bStyle, int bSales) {
        name = bName;
        author = bAuthor;
        style = bStyle;
        sales = bSales;
    }
    BookHM6 (String bName,String bStyle,String bAuthor) {
        name = bName;
        style = bStyle;
        author = bAuthor;


    }
    void print(){
        System.out.println("Bestseller :"+name+", Author of the book: "+author+", Publication year: "+style+", Page count: "+sales);
    }

}
