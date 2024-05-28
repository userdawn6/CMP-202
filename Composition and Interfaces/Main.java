import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String args[]) {

        computer hp250 = new computer(new RAM(), new processor(), new storage());
        System.out.println(hp250);
    }
}
