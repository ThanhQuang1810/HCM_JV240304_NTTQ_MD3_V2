package ss11;

import java.util.Comparator;
import java.util.Date;

public class Book implements Comparable<Book>{
    private String id;
    private String name;
    private String content;
    private Date createAt;
    private int numberPage;
    private double price;

    public Book(String id, String name, String content, Date createAt, int numberPage, double price) {
        this.id = id;
        this.name = name;
        this.content = content;

        this.numberPage = numberPage;
        this.price = price;
        this.createAt = createAt;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", createAt=" + createAt +
                ", numberPage=" + numberPage +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        // Compare by id
        int result = this.id.compareTo(o.id);
        if (result != 0) return result;

        // Compare by name
        result = this.name.compareTo(o.name);
        if (result != 0) return result;

        // Compare by numberPage
        result = Integer.compare(this.numberPage, o.numberPage);
        if (result != 0) return result;

        // Compare by content
        result = this.content.compareTo(o.content);
        if (result != 0) return result;

        // Compare by price
        result = Double.compare(this.price, o.price);
        if (result != 0) return result;

        // Compare by createAt (in reverse order)
        return o.createAt.compareTo(this.createAt);
    }
}

