
class performingStringShifts{
    // this particular question task is to shift the characters in the string

    public static String mover(String s,int[][] shift){
        
        int  shiftAmount = 0;
        for (int[] i : shift){
            if(i[0]==0){
                shiftAmount -= i[1];
            }
            else{
                shiftAmount += i[1];
            }
        }

        shiftAmount %= s.length();
        if(shiftAmount<0){
            shiftAmount+=s.length();
        }
        
        return s.substring(s.length()-shiftAmount)+s.substring(0,s.length()-shiftAmount);
    }



    public static void main(String[] args) {
        int[][] shift =  {{0,1},{1,2}};
        String s = new String("abc");

        System.out.println(mover(s, shift));
    }

}