import javax.xml.namespace.QName;

class Library {
    // 在此类中添加缺失的实现
    String Address;
    int num;
    Book[] books=new Book[10];
    public Library(String Address)
    {
        this.Address=Address;
        this.num=0;
    }
    public void addBook(Book newbook)
    {
        books[++num]=newbook;
    }
    public static void printOpeningHours()
    {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }
    public void printAddress()
    {
        System.out.print(Address);
    }
    public void borrowBook(String TargetBook)
    {
        boolean borrowed=false;
        for(int i=1;i<=num;i++)
        {
            if(TargetBook.equals(books[i].getTitle()))
            {
                if(!books[i].isBorrowed())
                {
                    books[i].borrowed();
                    System.out.println("You successfully borrowed "+TargetBook);
                    return;
                }
                else
                {
                    borrowed=true;
                }
            }
        }
        if(borrowed)System.out.println("Sorry, this book is already borrowed.");
        else System.out.println("Sorry, this book is not in our catalog.");
    }
    public void printAvailableBooks()
    {
        int sum=0;
//        System.out.println("Books available in the first library:");
        for(int i=1;i<=num;i++)
        {
            if(!books[i].isBorrowed())
            {
                System.out.println(books[i].getTitle());
                sum++;
            }
        }
        if(sum==0)System.out.println("No book in catalog");
    }
    public void returnBook(String TargetBook)
    {
        for(int i=1;i<=num;i++)
        {
            if(TargetBook.equals(books[i].getTitle()))
            {
                books[i].returned();
                return;
            }
        }
    }
    public static void main(String[] args) {
        // 创建两个图书馆
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // 向第一个图书馆添加四本书
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // 打印开放时间和地址
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // 尝试从两个图书馆借阅《指环王》
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // 打印两个图书馆所有可借阅书籍的标题
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // 将《指环王》归还到第一个图书馆
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println("Returning The Lord of the Rings:");
        System.out.println();

        // 打印第一个图书馆可借阅书籍的标题
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}