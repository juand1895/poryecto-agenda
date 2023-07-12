package holamundo;

import java.util.Scanner;


public class Consola {
    private Scanner sc;
    
    
    public  Consola(){
            this.sc = new Scanner(System.in);
           
    
                 }
    
    public String leerString(String msg)
    {
    System.out.println(msg);
   return this.sc.nextLine();
   
   
}
    public String leerInt(String msg)
    {
    System.out.println(msg);
    return this.sc.nextLine();
    }
    
    public float leerfloat(String msg)
    {System.out.println(msg);
    return this.sc.nextFloat();
    }
    public boolean leerboolean(String msg)
    {System.out.println(msg);
    return this.sc.nextBoolean();
    }

}
