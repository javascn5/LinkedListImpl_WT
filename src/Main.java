import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //ArrayList - implementacja tablicowa  //dziala szybciej
        // LinkedList - implementacja wiazana  //gdy usuwamy czesciej wybieramy to

        CustomList<String> customList = new CustomLinkedList<>();

        customList.add("Jeden");
        customList.add("Dwa");
        customList.add("Trzy");
        customList.add("Cztery");
        customList.add("Pięć");
        customList.add("Sześć");

	List<String> list = new LinkedList<>();

    list.add("Janko");
    list.add("Marcinko");
    list.add("Karolko");

    for (String l: list){
        System.out.println(l);
    }



    }
}
