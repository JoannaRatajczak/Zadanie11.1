import java.util.Scanner;

public class Book {

    private String title;
    private int pageNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageNo == book.pageNo &&
                title.equals(book.title);
    }

    static Book addBook (){
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Podaj tytuł");
        book.title = scanner.nextLine();
        System.out.println("Podaj ilość stron");
        book.pageNo = scanner.nextInt();
        return book;
    }

    public Book(){}


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }


}
