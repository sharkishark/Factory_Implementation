import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jakim autkiem chcesz pojezdzic ");

        String input = scanner.next();

        if(input.equals("M5")){
            new Garage(new bmwFactory());
        }
        else if(input.equals("B5")){
            new Garage(new VolskwagenFactory());
        }
    }
}
