
package cs285;

//CS285 PROJECT 
import java.util.*;

/**
 *
 * @author faris
 */

public class main {

    private static int shift;//created a shift so we can use it inside the loop
    
public static void main(String[] args) {
//        long start = System.currentTimeMillis();
            Scanner in = new Scanner(System.in);

            System.out.print("write the code that you want to encrypt(please put space between your letters):");
            String code = in.nextLine();
        
          
            String[] nCode = code.split(" ");
           
            try {
               
                System.out.print("how much do you want to shift:");
         
                shift = in.nextInt();//we put with the main method so we can use it inside the for loop

            } catch (Exception e) {
                
                System.err.println("the shift amount should be an integer ");
            
            }
 
        System.out.print("your encrypted code is:");
                  for (int i = 0; i < nCode.length; i++) {    
         
                       //    nCode[i] = nCode[i] + shift;//we cant do this becuase (we are out of the scope but if we were in oop its possible )
                   
//    if(shift >= 26 ){
        
      switch(nCode[i].toLowerCase()){//nCode[i] becasue a switch cant take an array 
                case "a":System.out.print(outOfBounds(0 +shift)+" ");break;
                case "b":System.out.print(outOfBounds(1+shift)+" ");break;
                case "c":System.out.print(outOfBounds(2 + shift)+" ");break;
                case "d":System.out.print(outOfBounds(3 + shift)+" ");break;
                case "e":System.out.print(outOfBounds(4 + shift)+" ");break;
                case "f":System.out.print(outOfBounds(5 + shift)+" ");break; 
                case "g":System.out.print(outOfBounds(6 + shift)+" ");break;
                case "h":System.out.print(outOfBounds(7 + shift)+" ");break;
                case "i":System.out.print(outOfBounds (8 + shift)+" ");break; 
                case "j":System.out.print(outOfBounds (9 +shift)+" ");break;
                case "k":System.out.print(outOfBounds (10 + shift)+" ");break; 
                case "l":System.out.print(outOfBounds (11 + shift)+" ");break;
                case "m":System.out.print(outOfBounds (12 + shift)+" ");break;
                case "n":System.out.print(outOfBounds (13 + shift)+" ");break;
                case "o":System.out.print(outOfBounds (14 + shift)+" ");break;
                case "p":System.out.print(outOfBounds (15 + shift)+" ");break;
                case "q":System.out.print(outOfBounds (16 + shift)+" ");break;
                case "r":System.out.print(outOfBounds (17 +shift)+" ");break;
                case "s":System.out.print(outOfBounds (18 +shift)+" ");break;
                case "t":System.out.print(outOfBounds (19 +shift)+" ");break;
                case "u":System.out.print(outOfBounds (21 +shift)+" ");break;
                case "w":System.out.print(outOfBounds (22 +shift)+" ");break;
                case "x":System.out.print(outOfBounds (23 +shift)+" ");break;
                case "y":System.out.print(outOfBounds (24 +shift)+" ");break;
                case "Z":System.out.print(outOfBounds (25 +shift)+" ");break;
                      default:System.err.println("your letter should be a-z");break;
                                
                                
            }
    
                            //turns out there is no need for this switch 
//    if(shift < 26){
//      switch(nCode[i].toLowerCase()){   
//          
//                case "a":System.out.print((0 +shift)+" ");break;
//                case "b":System.out.print((1+shift)+" ");break;
//                case "c":System.out.print((2 + shift)+" ");break;
//                case "d":System.out.print((3 + shift)+" ");break;
//                case "e":System.out.print((4 + shift)+" ");break;
//                case "f":System.out.print((5 + shift)+" ");break; 
//                case "g":System.out.print((6 + shift)+" ");break;
//                case "h":System.out.print((7 + shift)+" ");break;
//                case "i":System.out.print((8 + shift)+" ");break; 
//                case "j":System.out.print( (9 +shift)+" ");break;
//                case "k":System.out.print( (10 + shift)+" ");break; 
//                case "l":System.out.print( (11 + shift)+" ");break;
//                case "m":System.out.print( (12 + shift)+" ");break;
//                case "n":System.out.print( (13 + shift)+" ");break;
//                case "o":System.out.print( (14 + shift)+" ");break;
//                case "p":System.out.print( (15 + shift)+" ");break;
//                case "q":System.out.print( (16 + shift)+" ");break;
//                case "r":System.out.print( (17 +shift)+" ");break;
//                case "s":System.out.print( (18 +shift)+" ");break;
//                case "t":System.out.print( (19 +shift)+" ");break;
//                case "u":System.out.print( (21 +shift)+" ");break;
//                case "w":System.out.print( (22 +shift)+" ");break;
//                case "x":System.out.print( (23 +shift)+" ");break;
//                case "y":System.out.print( (24 +shift)+" ");break;
//                case "Z":System.out.print( (25 +shift)+" ");break;
//                default:System.err.println("your letter should be a-z");break;
//            }
//    }
                  }
//        long end = System.currentTimeMillis();
//    System.out.println("the runtime is: "+((end-start)/1000)+" seconds");

}

    public static int outOfBounds(int amount){
        //if the amount of shifting was more than 25
//      int cnt;
        if(amount < 26)
            return amount;
        else
//            if (amount - 26 > 26){
//                
//                for (int i = 0; i < amount; i++) {
//                    cnt = amount;
//                    cnt--;
//                    if(cnt == 25){
//                     amount = cnt;
//                        break;
//                    }
//                }
//            }
                return (amount-26);
       
    }


}
