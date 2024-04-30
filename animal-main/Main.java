public class Main {

    int age;
    float height;
    String name;
    String password;

    public void printUserData() {
        age = 18;
        height = 170;
        name = "Dawn";
        name.length();

        password = "123456";
        if (password.contains("123456") && password.contains("abcdef")) {
            System.out.println("Invalid pass code (too easy)");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
