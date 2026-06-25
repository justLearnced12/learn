import java.util;
public class hello{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Hello enter your name: ");
    String nam = scan.nextLine();
    if(nam.equals("cedrick")){
      System.out.println("sup pogi:>");
    }else{
      System.out.println("not pogi:<");
    }
  }
}
  
