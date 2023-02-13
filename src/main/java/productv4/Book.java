package productv4;

import ie.atu.productv3.Product;

public class Book extends Product {

    private String artist;

    public Book() {
        super();
        artist = "";
        count++;
    }

    public void setAuthor(String author) {
        this.artist = author;
    }

    public String getAuthor() {
        return artist;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist;
    }
}
