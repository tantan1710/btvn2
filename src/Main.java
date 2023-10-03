public class Main {
    public static void main(String[] args) {

        String s = "I love you";
        s = s + " forever"; //Nối chuỗi
        s = s.substring(0, 8); //Cắt chuỗi thành "i love y"
        s = s.replace("love", "hate");

        System.out.println(s);


    }

}
