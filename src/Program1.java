public class Program1 {
    public static void main(String[] args) {
        char input='F';
        int n='F'-'A'+1;
        System.out.println(n);
        char s='A';
        for(int i=1;i<=6;i++){
            //space
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //char
            for(int j=0;j<i;j++){
                System.out.print(s+" ");
            }
            s++;
            System.out.println();
        }
        s--;
        for(int i=5;i>=1;i--){
            //space
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //char
            --s;
            for(int j=0;j<i;j++){
                System.out.print(s+" ");
            }

            System.out.println();
        }

    }
}
