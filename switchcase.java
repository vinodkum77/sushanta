import java.io.*;
public class switchcase {
    public static void main(String[] args)throws IOException{
        int age;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your age");
        age= Integer.parseInt(br.readLine());
        switch (age) {
            case 18 -> System.out.println("u r an adult");
            case 21 -> System.out.println("going to join a job");
            case 60 -> System.out.println("you are going to retire");
            default -> System.out.println("enjoy your life");
        }
    }

}
