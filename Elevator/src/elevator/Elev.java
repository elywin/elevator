
package elevator;

import java.util.Scanner;

/**
 *
 * @author Elywin Michael Lukeera S19B23/120
 * @author Rwatangabo Osbert S19B23/669
 * @author Nkuraija Gary Mathew S19B23/537
 * @author Isiyagi Abraham S19B23/120
 * 
 * On our honor, as a Uganda Christian University student , we have neither given nor received unauthorized assistance on this work.
 */
public class Elev {
     public static void NextFloor(int num) {
       int num1 = 1;
       String   h;
      
 do{
    
         if((num >= 1)&&(num <= 20)){
                     System.out.println("Closing door");
       
        System.out.println("Going to floor " + num + " from floor " + num1);
        
         if(num1<num){
                 for(int i=num1; i<num;i++){
            
                System.out.println("Going up to floor "+ (num1+=1));
                 }
               
                 }else if(num1>num){
                     for(int i=num1; i>num;i--){
                  System.out.println("Going down to floor "+(num1-=1));
                     }
            }else{
                 System.out.println("Closing door");
                System.out.println("Opening door at floor "+num1);
        }
    }else {
        System.out.println("Invalid floor!");
    }

         System.out.println("The elevator is on floor "+num1);
         System.out.println("Please enter the new floor(Enter to quit): ");

          Scanner n = new Scanner(System.in);
             h = n.nextLine();
             if(!h.isEmpty()){
        num = Integer.parseInt(h);
             }else{
                 System.out.println("Exited");
             }
      

 }while(!(h.isEmpty())); 
   
    }
}
