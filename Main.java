import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> newHash = newFullHash(15);
        Integer numero = 8;
        System.out.println("set iniziale " + newHash);
        System.out.println("valore " + numero);
        Iterator<Integer> iterator = newHash.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element.equals(numero)) {
                iterator.remove();
            }
        }
        System.out.println("set modificato " + newHash);
        newHash.clear();
        System.out.println("set svuotato " + newHash);
    }
    public static HashSet<Integer> newFullHash (int numElementi) {
        HashSet<Integer> nuovo = new HashSet<>();
        for (int i = 0; i < numElementi; i++) {
            nuovo.add(i);
        }
        return nuovo;
    }
}
