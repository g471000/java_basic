class VarEx2 {
    /**
     * Exchange varable
     * @param args
     */
    public static void main(String[] args){
        int x = 10, y = 20;

        System.out.println("x:" + x + ", y:" + y);

        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("After Swap --> x:" + x + ", y:" + y);
    }
}
