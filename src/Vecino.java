public class Vecino implements Observer {
    private String nombre;

    public Vecino(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println("Hola " + nombre + " ,recibio la notificacion: " + notificacion);
        System.out.println(nombre + ":Ya va por pan");
    }
}