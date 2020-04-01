package Dominio;

public class Producto {

    private int id_articulo;
    private String seccion;
    private String nomArticulo;
    private int precio;
    private String fecha;
    private String importado;
    private String paisOrigen;

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_producto(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNomArticulo() {
        return nomArticulo;
    }

    public void setNomArticulo(String nomArticulo) {
        this.nomArticulo = nomArticulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String toString(){
        return "id_producto: " + id_articulo + ", seccion: " + seccion + ", nomArticulo: " + nomArticulo + ", precio: " + precio + ", fecha: " + fecha + ", importado: " + importado + ", pais de origen: " + paisOrigen;
    }
}
