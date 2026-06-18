public class pattern2 {
    public void pat(int n){
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern2 p = new pattern2();
        p.pat(6);
    }
}

/*

*
**
***
****
*****
******

*/
