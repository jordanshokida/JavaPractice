package CarritoCompras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarritoDeCompras {
    public static void main(String[] args) {
        System.out.println("Bienvenidos al local de guitarras La Guitarrita");
        System.out.println("A continuación verá la lista de productos disponibles: ");
        List<String> stockGuitarras = new ArrayList<>();
        stockGuitarras.add("0.Fender Stratocaster: " + Helper.fender);
        stockGuitarras.add("1.ESP ec-1000: " + Helper.esp);
        stockGuitarras.add("2.Musicman jp6: " + Helper.musicman);
        stockGuitarras.add("3.Gibson LesPaul: " + Helper.gibson);
        List<String> carritoCompras = new ArrayList<>();
        Scanner producto = new Scanner(System.in);
        Scanner datosCliente = new Scanner(System.in);
        int opciones;
        System.out.println(stockGuitarras);
        do {

            System.out.println("Ingrese los numeros(0,1,2,3) correspondiente a cada uno de los productos, para agregarlos en el carrito de compras, o 4 para terminar la compra.");
            opciones = producto.nextInt();
            switch (opciones) {
                case 0:
                    System.out.println("El producto seleccionado es Fender Stratocaster, y se ha agregado al carrito.");
                    carritoCompras.add(stockGuitarras.get(0));
                    System.out.println(Helper.mensaje + mostrarCarrito(carritoCompras));
                    break;
                case 1:
                    System.out.println("El producto seleccionado es ESP ec-1000, y se ha agregado al carrito.");
                    carritoCompras.add(stockGuitarras.get(1));
                    System.out.println(Helper.mensaje + mostrarCarrito(carritoCompras));
                    break;
                case 2:
                    System.out.println("El producto seleccionado es Musicman jp6, y se ha agregado al carrito.");
                    carritoCompras.add(stockGuitarras.get(2));
                    System.out.println(Helper.mensaje  + mostrarCarrito(carritoCompras));
                    break;
                case 3:
                    System.out.println("El producto seleccionado es Gibson LesPaul, y se ha agregado al carrito.");
                    carritoCompras.add(stockGuitarras.get(3));
                    System.out.println(Helper.mensaje + mostrarCarrito(carritoCompras));
                    break;
            }

        } while (opciones < 4);
        System.out.println("Este es el carrito con todos sus productos seleccionados: \n " + mostrarCarrito(carritoCompras));
        System.out.println("Escriba 5 en caso de confirmar la compra, y 6 en caso de cancelarla.\n En caso de confirmar la compra, se le pedirán sus datos.");
        opciones = producto.nextInt();
       // producto.close();
        if (opciones == 5) {

            System.out.println("Ingrese su nombre");
            String nombre = datosCliente.nextLine();
            System.out.println("Ingrese su dirección");
            String direccion = datosCliente.nextLine();
            System.out.println("Ingrese su telefono");
            String telefono = datosCliente.nextLine();
            imprimirTicket(nombre, direccion, telefono, carritoCompras);
        } else if (opciones == 6) {
            System.out.println("Su compra ha sido cancelada");
        }
    }

    private static List<String> mostrarCarrito(List<String> carritoCompras) {
        return carritoCompras;
    }

    private static void imprimirTicket(String nombre, String direccion, String telefono, List<String> carritoCompras) {
        System.out.println("Detalles de su compra: ");
        System.out.printf("nombre:%s.\ndirección:%s.\ntelefono:%s.\n", nombre, direccion, telefono);
        System.out.println("Productos: ");
        carritoCompras.forEach(System.out::println);

    }
}
