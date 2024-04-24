public class Main {
    public static void main(String[] args) {
        char ch='A';
        int n=12;
        int index=1;
        for(int i=n/2;i>=1;i--){
            char temp=ch;
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print(temp);
            for(int j=1;j<index;j=j+2){
                System.out.print(" ");
            }System.out.print(temp);
            index++;
            System.out.println();
            ch++;
        }
        ch--;index--;
        for(int i=1;i<=n/2-1;i++){
            --ch;
            char temp=ch;
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print(temp);
            for(int j=1;j<index;j=j+2){
                System.out.print(" ");
            }System.out.print(temp);
            index--;
            System.out.println();
        }

    }
}