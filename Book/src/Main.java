class Book {
    String title;
    boolean borrowed;

    // 创建一本新书
    public Book(String bookTitle) {
        // 实现此方法
        title=bookTitle;
        borrowed=false;
    }

    // 将书籍标记为已借阅
    public void borrowed() {
        // 实现此方法
        borrowed=true;
    }

    // 将书籍标记为未借阅
    public void returned() {
        // 实现此方法
        borrowed=false;
    }

    // 如果书籍已被借阅，返回true，否则返回false
    public boolean isBorrowed() {
        // 实现此方法
        return borrowed;
    }

    // 返回书籍的标题
    public String getTitle() {
        // 实现此方法
        return title;
    }

    public static void main(String[] arguments) {
        // 对Book类进行小测试
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}