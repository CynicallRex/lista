public class Nodo {

    //dato
    Object dato;
    Nodo siguiente;

    public Nodo (Object dato, Nodo sig) {
        this.dato = dato;
        this.siguiente = siguiente;

    }
    public Object getDato() {
        return this.dato;
    }
    public void setDato (Object dato) {
        this.dato = dato;
    }
    public Nodo getSiguiente() {
        return this.siguiente;
    }
    public void setSiguiente (Nodo siguiente) {
        this.siguiente = siguiente;
    }

}


