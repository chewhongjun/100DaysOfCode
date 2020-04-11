import java.util.HashMap;
import java.util.Map;



//This is a copy of the suggested answer i couldnt figure it out by mysefl
public class hasGroupSizex {
    public static boolean f(int[] deck){
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for (int i: deck){
            hmap.put(i,hmap.getOrDefault(i, 0)+1);
        }
        int gcd = -1;
        for(Integer i:hmap.values()){
            if (gcd == -1) gcd = i;
            else{
                gcd = gcd(gcd,i);
            }
        }
    
    
    return gcd>=2;
    }
    private static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,b);
    }





    public static void main(String[] args) {
        int[] deck = {1,2,3,4,4,3,2,1};
        System.out.println(f(deck));
    }
}