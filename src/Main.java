public class Main {
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();

        Vecino ana = new Vecino("Ana");
        Vecino luis = new Vecino("Luis");
        Vecino marta = new Vecino("Marta");

        // Suscribir vecinos
        panaderia.suscribir(ana);
        panaderia.suscribir(luis);
        panaderia.suscribir(marta);

        for (int hora = 5; hora <= 7; hora++) {
            System.out.println("-- " + hora + ":00 --");
            if (hora == 7) {
                panaderia.sacarPan();
            }
        }
    }
}