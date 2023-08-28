public class InfoPorConsola implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tarea por consola: Paso " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}