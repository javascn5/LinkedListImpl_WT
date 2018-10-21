import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //ArrayList - implementacja tablicowa  //dziala szybciej
        // LinkedList - implementacja   //gdy usuwamy czesciej wybieramy to

	List<String> list = new LinkedList<>();

    list.add("Jan");
    list.add("Marcin");
    list.add("Karol");

    for (String l: list){
        System.out.println(l);
    }



    }
}
