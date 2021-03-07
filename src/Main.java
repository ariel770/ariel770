public class Main {
    public static void main(String[] args) {
      for (Book book : Book.values()){
          System.out.println(book.getLanguage()+" : "+book.getYear());

      }
    }
}
