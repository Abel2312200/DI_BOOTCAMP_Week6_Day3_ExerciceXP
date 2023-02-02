public class NumberTriangle {
    public static void main(String[] args) {
        String lineContent;
        for (int i = 1; i < 8 ; i++) {
            lineContent = ""+i;
            System.out.println(lineContent.repeat(i));
        }
    }
}
