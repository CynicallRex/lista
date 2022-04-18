public class ListaSE {
    Nodo inicio;
    //metodo constructor
    public ListaSE() {
        this.inicio = null;
    }
    //vacia?
    public boolean estavacia() {
        return inicio == null;
    }
    //tamaño de la lista
    public void n() {
        int contador = 0;
        Nodo aux = inicio;
        while (aux != null) {
            contador +=1;
            aux = aux.getSiguiente();
        }
    }
    public Object ultimoDato() {
        Nodo aux = inicio;
        while (aux.getSiguiente() != null){
            aux  = aux.getSiguiente();
        }
        return aux.getDato();
    }
    //insertar
    public void insertarInicio (Object dato){
        if (estavacia()) {
            this.inicio = new Nodo(dato, null);
        } else {
            Nodo aux = inicio;
            this.inicio = new Nodo(dato, aux);
        }
    }
    //eliminar
    public void eliminarInicio() {
        if (!estavacia()) {
            this.inicio = inicio.getSiguiente();
        }
    }
    public void mostrar () {
        if (estavacia()){
            System.out.println("Esta vacia");
        }else {
            Nodo aux = inicio;
            while (aux != null){
                System.out.print(aux.getDato()+" ");

            }
            System.out.println("");
        }
    }
}
