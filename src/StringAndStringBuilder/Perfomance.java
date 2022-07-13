package StringAndStringBuilder;

public class Perfomance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 5; i++) {
            char ch = (char) ('a' + i);
            series+= ch;
            System.out.println(series);

        }
    }
}
