
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
public class Elevator {

    public static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
       String   h;
       int floor = 0;
        int currentFloor = 1;
          System.out.println("The elevator is on floor "+currentFloor);
    
          System.out.println("Please enter the new floor(Enter to quit): ");

           Scanner n = new Scanner(System.in);
             h = n.nextLine();
             if(!h.isEmpty()){
        floor = Integer.parseInt(h);
         Elev.NextFloor(floor);
             }else{
                 System.out.println("Exited");
             } 
}

}