package networking;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",6666);
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input massage: ");
            String massage = scanner.nextLine();
            out.writeUTF(massage);
            out.flush();
            out.close();
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
