public class Book {
    private String author ;
    private String title;


    public Book(String author, String title) {
        this.author = author;
        this.title = title;


    }

    public static Book of(String author, String title) {
        return new Book(author,title);

    }
    {


        Book book = Book.of("Issac Asimov","The Galaxy");
        System.out.println(Book.of(Book);
    }
}


// Napisz klasę Book, która będzie posiadała pola
//
//private String author
//oraz
//
//private String title
//Wyposaż tę klasę również w statyczną metodę of, która jako parametry przyjmie nazwę autora oraz tytuł.
// Metoda ta ma zwracać utworzony obiekt książki (będziemy jej używać zamiast konstruktora). Jej użycie będzie wyglądało przykładowo tak:

//
//Book book = Book.of("Isaac Asimov", "The Galaxy");
//
//Stosowanie metody statycznej of jest często spotykanym rozwiązaniem w klasach wbudowanych w Javę, które poznasz późnie