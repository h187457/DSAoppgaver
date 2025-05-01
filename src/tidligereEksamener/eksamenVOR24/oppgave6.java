package tidligereEksamener.eksamenVOR24;

public class oppgave6 {

    public static class Node {
        int data;
        Node neste;
        public Node(int data) {
            this.data = data;
            this.neste = null;
        }
    }

    //  A)
    public static int antallNoderIterativ(Node forste){
        int antall = 0;
        while (forste != null) {
            antall++;
            forste = forste.neste;
        }
        return antall;
    }

    // B)
    public static int antallNoderRekursiv(Node forste){
        int antall = 0;
        if (forste == null) {
            return 0;
        }
        return 1+antallNoderRekursiv(forste.neste);
    }
}
