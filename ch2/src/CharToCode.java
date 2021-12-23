public class CharToCode {
    public static void main(String[] args){
       char c = 'A';
       int code = (int) c;

       System.out.printf("%c=%d(%#X)%n", c, code, code);

       char hch = '가';
       System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}
