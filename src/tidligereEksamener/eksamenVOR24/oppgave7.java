package tidligereEksamener.eksamenVOR24;
import java.util.Stack;


public class oppgave7 {
    public static String desimalTilBinaer(int tallet){
        if (tallet == 0){
            return "0";
        }
        else{
            Stack<String> stabel = new Stack<>();

            while (tallet > 0){
                int rest = tallet%2;
                stabel.push(String.valueOf(rest));
                tallet/=2;
            }

            String resultat = "";
            while (!stabel.isEmpty()){
                resultat += stabel.pop();
            }
            return resultat;
        }
    }

}
