import java.util.HashMap;

class CountingElements {

    public static int counter(int[] arr){
        int result = 0;
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int num:arr){
            if(hmap.containsKey(num)==false){
                hmap.put(num,0);
            }
        }
        for(int i:arr){
            if(hmap.containsKey(i+1)){
                result+=1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,5,0};
        System.out.println(counter(arr));
    }
}