public class Main {
    public static void main(String[] args) {

        Author Tolstoy = new Author("Лев","Толстой");

        Book book = new Book("Война и мир",new Author("Николай","Толстой"),1980);
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getDate());

        Author Lermontov = new Author("Юрий","Лермонтов");
        Book book2 = new Book("Герой нашего времени",new Author("Юрий","Лермонтов"),1840);
        System.out.println(book2.getName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getDate());
        book2.setDate(1933);
        System.out.println(book2.getDate());
    }
}