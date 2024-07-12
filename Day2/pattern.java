package Day2;
import java.util.*;
public class pattern {
    public static void main(String[] args) {
        //que1
        //* * * * *
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        */

        //que2
        /* * * *
         * * * *
         * * * *
         */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
        */

        //que3 RIGHT FACING TRIANGLE
        /*
        * 
        * *
        * * * 
        * * * *
         */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

            
        }
        
        */

        //que4 LEFT FACING TRIANGLE
        /*
         *   *
        *  * *
        * * * *
        */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        */

        //que5 INVERTED RIGHT FACING TRIANGLE
        /*
         *  * * *
         *  * *
         *  *
         */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        */
        

        //que6 INVERTED LEFT FACING TRIANGLE
        /*
         *  * * *
         *    * *
         *      *
         */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        */

        //que7
        /* * * * * * *
         *     * * * *
         *         * *
         *           *
         */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++) System.out.print("    ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        */

        //que8
        /*
         * * * *
         *     *
         *     *
         * * * *
         */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                } 
            }
            System.out.println();
            
        }
        */
        
        //que9 (homework)
        /*
         *  *   *
         *    *
         *  *    *
         */
         /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i==j || i+j==n+1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */

        //que10 HOMEWORK
        /*
         *     *
         *   * * *
         * * * * * *
         * * * * * * *
         */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            for(int j=2;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        */

         //que11
         /* * * * * * * * * *
          *   * * * * * * *
                * * * * *
                  * * *
                    *
         */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            for(int j=2;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        */
        /* ommit
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-1);k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            for(int j=2;j<=i && j<n-1 ;j++)
                System.out.print("* ");
            System.out.println();
        }

         */
        
         //que12
        /*
         *      *
         *    * *
         *  * * *
         *    * *
         *      *
         */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=(n-i);k++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        */

        //que13
        /* * * * *
           * * * *
             * * *
               * *
                 *  
             * *
         * * *
        * * * 
        */
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++) System.out.print("    ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int k=1;k<=(n-i);k++) System.out.print("    ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        */
        
        //que14
        /*           *
         * *       * *
         * * *   * * *
         * * * * * * *
         */
    }
}
    

