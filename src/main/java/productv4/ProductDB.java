package productv4;

public class ProductDB {

    public static Product getProduct (String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("PINK")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here by Pink Flyod");
            myMusic.setPrice(8.00);
            myMusic.setLabel("Part of the Columbia group");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("JOHN")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("New light by John Mayer");
            myMusic.setPrice(13.99);
            myMusic.setLabel("Part of the Coulumbia group");
            p = myMusic;
        }
        return p;
    }
}

