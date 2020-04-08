class maxProfits{

    public static int maxcount(int[]pxs){
        int maxRange = 0;
        int localMin = pxs[0];
        int localMax = pxs[0];
        int i =0;
        while(i<pxs.length-1){
            while(i<pxs.length-1 && pxs[i]>pxs[i+1])
                i++;
            localMin=pxs[i];
            while(i<pxs.length-1 && pxs[i]<pxs[i+1])
                i++;
            localMax=pxs[i];

            maxRange += localMax-localMin;
        }
        return maxRange;
    }

    public static void main(String[] args) {
        int[] pxs = {7, 1, 5, 3, 6, 4};
        System.out.println(maxcount(pxs));
    }
    
}