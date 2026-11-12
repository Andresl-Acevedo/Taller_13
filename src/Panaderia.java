import java.util.ArrayList;
import java.util.List;

public class Panaderia implements Observable {
    private boolean hayPan = false;
    private List<Observer> vecinos = new ArrayList<>();

    public void sacarPan() {
        hayPan = true;
        System.out.println(">> Salio el pan caliente");
        notificar("¡Ya salio el pan caliente!");
    }

    @Override
    public void suscribir(Observer o) {
        vecinos.add(o);
    }

    @Override
    public void desuscribir(Observer o) {
        vecinos.remove(o);
    }

    @Override
    public void notificar(String mensaje) {
        for (Observer o : vecinos) {
            o.actualizar(mensaje);
        }
    }
}