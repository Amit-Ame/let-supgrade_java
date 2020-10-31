import java.util.Scanner;

class main{

public static void main(String args[])
   { 
     
     employee s1=new employee();
     employee s2=new employee();
     s1.getdetails();
   
  }

public class employee {
     public void getdetails(){
        
        
        
       Scanner scn= new Scanner(System.in);
        
        
        String name =scn.next();
        int age = scn.nextInt();
        String city= scn.next();
        System.out.println("the name is"+ name);
        System.out.println("the age is"+ age);
        System.out.println("the city is"+ city);
   
    }



}



}
     
     
