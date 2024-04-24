import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Number of digits of 1st array:");
        int n1=scanner.nextInt();
        int []A=new int[n1];
        System.out.println("Enter the 1st inputs");
        for(int i=0;i<n1;i++){
            A[i]=scanner.nextInt();
        }
        System.out.println("Number of digits of 2nd array:");
        int n2=scanner.nextInt();
        int []B=new int[n2];
        System.out.println("Enter the 2nd inputs");
        for(int i=0;i<n2;i++){
            B[i]=scanner.nextInt();
        }
        int max=0, min=0;
        if(A.length>B.length){
            max=A.length;
        }else {
            min=B.length;
        }

//        int []A={9,2,8,1,3,5,6,7,3,1,1,6};
//        int []B={0,0,0,7,8,4,6,2,1,9,9,7};
        int []res=new int[max];
        int carry=0;
        int k=A.length-1, l=B.length-1, index=max-1;
        while(k>=0 && l>=0){
            int sum=0;
            sum=carry+A[k]+B[l];
            if(sum>=10){
                carry=sum/10;
                sum=sum%10;
            }else{
                carry=0;
            }
            res[index--]=sum;
            k--;l--;
        }
        while(k>=0){
            res[k]=res[k]+carry+A[k];
            k--;
        }
        while(l>=0){
            res[l]=res[l]+carry+B[l];
            l--;
        }



        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
