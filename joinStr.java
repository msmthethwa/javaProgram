public class joinStr
{
   public static void main (String [] args)
   {
      String name = "", surname = "", str = "";
;
      name = "Sibusiso";
      surname = "Mthethwa";
      
      str = name.concat(surname);
      System.out.println("Joined strings : " + "\t" + str);
      
   }
}