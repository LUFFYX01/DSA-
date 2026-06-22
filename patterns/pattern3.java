public class pattern3 {
    public void pat(int n){
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern3 p = new pattern3();
        p.pat(5);
    }
}

/*
1
22
333
4444
55555

*/