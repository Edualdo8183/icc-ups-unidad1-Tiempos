public class App {
    public static void main(String[] args) throws Exception {
        long inicio_millis = System.currentTimeMillis();


        long inicio = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            String s = "Numero: " + i;
            System.out.println(s);
        }

        long fin = System.nanoTime();
        System.out.println("Tiempo transcurrido " + (fin - inicio) + "nanosegundos");
        System.out.println("Tiempo transcurrido " + (fin - inicio)/1_000_000_000.0 + " segundos");
    }
}
