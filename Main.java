/////////////////////////////////////
//     Title  : SwapTWoNumbers     //                                    
//    Authore : SivaPragasam.v     //
//                                 //
/////////////////////////////////////

package com.siva;                           /// package name
    
import java.util.Scanner;                   /// import Scanner class

public class Main {                         /// start here class

    public static void main(String[] args) {        /// start here method
        int x,y;
        Scanner input = new Scanner(System.in);         /// by used to get a input values to user
        System.out.println("Enter ethe x values");
        x = input.nextInt();                            /// get a x value
        System.out.println("Enter the y value");
        y = input.nextInt();                            /// get a y value
        System.out.println("After Swap values");
        y = x+y;                                       //// add "x" an "y" values and store to "y"
        x = y-x;                                       //// subtrc "y"an "x" value after store to "y" now this variable have "x" value
        y= y-x;                                        //// subtrc "y"an "x" value after store to "x" now this variable have "y" value
        System.out.println("x value :"+x);
        System.out.println("y value :"+y);                      /// finaly print swap two variable value

    }
}
