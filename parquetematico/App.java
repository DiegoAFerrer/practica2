package parquetematico;
import java.util.ArrayList;
import java.util.Scanner;

public class App{

    public static String mostrarMenu(){
        return String.format("%s \n %s \n %s \n %s \n %s", "1. Agregar Tickets", "2. Establecer Tickets", "3. Comprar Premio", "4. Establecer festivo", "5. Salir");
    }

    public static void main(String[] args) {
        double descuentoFestivo = 50/100;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Premio> premios = new ArrayList<>();

        Premio camisa = new Premio("Camisa", 500);
        Premio sombrero = new Premio("Sombrero", 350);
        Premio tenis = new Premio("Tenis", 600);

        premios.add(camisa);
        premios.add(tenis);
        premios.add(sombrero);

        BilleteraParque wallet = new BilleteraParque(100);
        
        do {
            System.out.println("== Administrador de billeteras para parques temáticos==");
            System.out.println(mostrarMenu());
            System.out.println("Tu billetera tiene " + wallet.getTickets() + " boletos");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("¿Cuántos tickets se agregan?");
                    wallet.agregarTickets(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("¿Cuántos tickets se agregan?");
                    wallet.setTickets(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Premios Disponibles:");
                    int i = 1;
                    for (Premio premio : premios) {
                        System.out.println(i + ". " + premio.toString());
                        i++;
                    }

                    Premio selected = premios.get(scanner.nextInt());

                    wallet.removerTickets(selected.getPrice());

                    if (selected.getPrice() > wallet.getTickets()) {
                        System.out.println("No hay suficientes boletos para comprar ese premio");
                    } else{
                        System.out.println("Compré " + selected.getName() + " por " + selected.getPrice() + " boletos");
                    }
                    break;

                case 4:
                    BilleteraParque.setFestivo();
                
                case 5:

                    
                default:
                    throw new AssertionError();
            }





        } while (1 > 2);

    }
}