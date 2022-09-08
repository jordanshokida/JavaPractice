import java.util.ArrayList;
import java.util.List;

public class IteradorDeListas {
    public static void main(String[] args) {
    List<String> listaComidas= new ArrayList<>();
    listaComidas.add("Hamburguesa");
    listaComidas.add("Milanesa a la fugazzeta");
    listaComidas.add("Fideos con manteca y queso rayado");
    listaComidas.add("Helado de sambayón");
    listaComidas.add("Chocotorta");
    //Iterator+while:
        /*Iterator<String> iterador= listaComidas.iterator();
        System.out.println("Cantidad de elementos a iterar: " + listaComidas.size());
        while(iterador.hasNext()){
            String comidas= iterador.next();
            System.out.println("Comida: " + comidas);*/
    //Iterator+for:
        /* for (Iterator<String> iterador = listaComidas.iterator(); iterador.hasNext();){
            String comidas = iterador.next();
            System.out.println("Comida: " + comidas);
        }*/
    //ForEach:
       /* listaComidas.forEach(comidas -> {
            System.out.println("Comida: " + comidas);
        });*/
    //Iterable+While:
        /*int indice=0;
        while(indice < listaComidas.size()){
            System.out.println("Comida: " + listaComidas.get(indice));
            indice++;
        }*/
    //Iterable+For:
        /*for (int i = 0; i < listaComidas.size(); i++) {
            System.out.println("Comida: " + listaComidas.get(i));
        }*/
    for (String Comida : listaComidas) {
        System.out.println("Comida: " + Comida);
    }
}

}
