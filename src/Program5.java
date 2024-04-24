import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        int n=scanner.nextInt();
        int front=0;
        int last=n;
        int [][]arr=new int[100][100];
        while(n>0){
            for(int i=front;i<last;i++){
                for(int j=front;j<last;j++){
                    if(i==front || j==front || i==last || j==last){
                        if(n%2!=0){
                            //System.out.print("1"+" ");
                            arr[i][j]=1;
                        }
                    }

                }n--;
                front++; last--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}
