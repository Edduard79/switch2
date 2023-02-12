import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Insert string!");
        String words = in.nextLine();



        while(!words.equals("finish")) {        //escape value
            System.out.println("Insert string!");


            switch (words) {
                case "size":
                    System.out.println(list.size());
                    break;

                case "print":
                    System.out.println(list);
                    break;

                case "clear":
                    System.out.println(list.removeAll(list));
                    break;

                default:
                    list.add(words);
            }
            words = in.nextLine();


        }


    }
}
