

public class Run{
    public static void main(String[] args) {
        
        

        Thread HiloCancion = new Thread(new ReproducirCancion());
        Thread HiloInfo = new Thread(new InfoPorConsola());


        HiloCancion.start();
        HiloInfo.start();

        try {
            HiloCancion.join();
            HiloInfo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado.");
    
    }
}