public class Main {
    public static void main(String[] args) {
        Author vasya = new Author("Василий", "Пупкин");
        System.out.println("Имя автора - " + vasya.getFirstName());
        System.out.println("Фамилия автора - " + vasya.getLastName());

        Book hello = new Book("Привет", "Василий Пупкин", 2022);
        System.out.println("Заголовок - " + hello.getTitle());
        System.out.println("Автор - " + hello.getAuthor());
        System.out.println("Год издания - " + hello.getPublisherYear());
        hello.setPublisherYear(2023);
        System.out.println("Год издания - " + hello.getPublisherYear());

        System.out.println();

        Author vasya1 = new Author("Пупка", "Васильев");
        System.out.println("Имя автора - " + vasya1.getFirstName());
        System.out.println("Фамилия автора - " + vasya1.getLastName());

        Book hello1 = new Book("как делишки?", "Пупка Васильев", 2016);
        System.out.println("Заголовок - " + hello1.getTitle());
        System.out.println("Автор - " + hello1.getAuthor());
        System.out.println("Год издания - " + hello1.getPublisherYear());
        hello1.setPublisherYear(2018);
        System.out.println("Год издания - " + hello1.getPublisherYear());


    }


}