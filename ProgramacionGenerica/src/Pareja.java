public class Pareja<T> {

    private T primero;

    public Pareja(){
        primero = null;
    }

    public void setPrimero(T nuevoValor){
        this.primero = nuevoValor;
    }

    public T getPrimero(){
        return primero;
    }

}
