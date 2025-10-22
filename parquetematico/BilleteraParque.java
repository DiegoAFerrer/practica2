package parquetematico;

public class BilleteraParque {
    private int tickets;
    private static boolean festivo = false;

    public BilleteraParque(){
        this.tickets = 0;
    }

    public BilleteraParque(int tickets){
        this.tickets = tickets;
    }

    public int getTickets(){
        return this.tickets;
    }

    public static boolean getFestivo(){
        return festivo;
    }

    public void setTickets(int ticketAmount){
        if(ticketAmount >= 0){
            this.tickets = ticketAmount;
        }
    }

    public static void setFestivo(){
        if(festivo == false){
            festivo = true;
        }
        if(festivo == true){
            festivo = false;
        }
    }

    public void agregarTickets(int sum){
        if(sum > 0){
            this.tickets =+ sum;
        }
    }

    public boolean removerTickets(int subtract){
        if(subtract > 0 && this.tickets >= subtract){
            this.tickets =- subtract;
            return true;
        } else{
            return false;
        }
    }
}