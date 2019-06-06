public class Test {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            if (i == 0) {
                books[i] = Book.addBook();
            } else {
                do {
                    books[i] = Book.addBook();
                    if (books[i].equals(books[i - 1])){
                        System.out.println("Wprowadzono istniejącą pozycję, podaj inną książkę.");
                    }
                } while (books[i].equals(books[i - 1]));

            }
            System.out.println("Wprowadzono książkę nr " +(i+1));
        }


    }
}
