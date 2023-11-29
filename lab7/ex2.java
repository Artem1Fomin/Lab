package lab7;


    class Magazine {
        public static void printMagazines(Printable[] printable) {
            for (Printable item : printable) {
                if (item instanceof Journal) {
                    System.out.println(((Journal) item).getMagazineName());
                }
            }
        }

        public static void printBooks(Printable[] printable) {
            for (Printable item : printable) {
                if (item instanceof Book) {
                    Book book = (Book) item;
                    System.out.println(book.getTitle() +" "+ book.getAuthor());
                }
            }
        }
    }

    interface Printable {
        void print();
    }

    class Book implements Printable {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public void print() {
            System.out.println( title +  author);
        }
    }

    class Journal implements Printable {
        private String magazineName;

        public Journal(String magazineName) {
            this.magazineName = magazineName;
        }

        public String getMagazineName() {
            return magazineName;
        }

        @Override
        public void print() {
            System.out.println(magazineName);
        }
    }

    public class ex2 {
        public static void main(String[] args) {
            Printable[] printableItems = {
                    new Book("50/50", "Ли Дзунь"),
                    new Journal("Для Садоводов"),
                    new Book("Матан", "Кто-то"),
                    new Journal("Все про огород")
            };

            System.out.println("Имя журналов");
            Magazine.printMagazines(printableItems);

            System.out.println("\nДетали книги:");
            Magazine.printBooks(printableItems);
        }
    }

