import java.util.HashMap;
import java.util.Map;

public class Program2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map=new HashMap();
        int n=8;
        //int []arr=new int[n];
        int []arr={4,1,2,3,1,2,5,2};
        int []res=new int[n];
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int temp=map.get(arr[i]);
                map.put(arr[i], temp+1);
            }else
                map.put(arr[i], 1);
        }
        System.out.println(map);
        int []temp=new int[map.size()];

    }
}
