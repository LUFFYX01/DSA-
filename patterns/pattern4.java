public class pattern4 {
    public static void pat(int n){
        for (int i = 1; i<=n; i++){
            for(int j = 1 ; j <= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j<= 2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[]args){
        pat(5);
    }
}

/* 
       *
      ***
     *****
    *******

*/

/* if we put 2*n-1 instead of 2*i-1 we get */
/* 
   ********
  ********
 ********
********

*/
