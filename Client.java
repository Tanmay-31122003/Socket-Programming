import java.net.*;
import java.io.*;

class Client 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Client Application is Running...");
        

        Socket sobj = new Socket("Localhost",2100);
        System.out.println("Client gets successfully Connected...");

        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2;

        System.out.println("Marvellous Messanger Started");
        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            str2 = br1.readLine();
            System.out.println("Enter message For server : ");
            System.out.println("Server says : "+str2);
        }
        System.out.println("Thanks you for using Marvellous Messanger..");
        sobj.close();
    }
}