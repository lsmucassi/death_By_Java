import java.util.*;

public class SillyhelloWorld{

   public static void main(String ... args) {
        System.out.println(randStr(-229985452)+' '+randStr(-147909649));
    }

    public static String randStr(int sed) {
        Random rand = new Random(sed);
        StringBuilder sb = new StringBuilder();
    
        for(int i=0;;i++) {
            int n = rand.nextInt(27);
            if (n == 0) break;
            sb.append((char) ('`' + n));
        }
        return sb.toString();
    }
}
