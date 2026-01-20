public class Personaje {
    private String nombre;
    private int nivel;
    
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    public void mostrarInfo() {
        System.out.println("Personaje: " + nombre + ", Nivel: " + nivel);
    }
}
