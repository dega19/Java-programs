public class WordCount {
    public static void main(String[] args) {

        String str = "Java is easy to learn and highly packages they given";

        String words[] = str.split(" ");

        System.out.println("Number of words: " + words.length);
    }
}
