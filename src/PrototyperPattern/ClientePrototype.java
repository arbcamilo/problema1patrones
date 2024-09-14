package PrototyperPattern;

public class ClientePrototype implements Cloneable {
    private String nombre;
    private String identificacion;
    private String tipoPrestamo;
    private double monto;

    public ClientePrototype(String nombre, String identificacion, String tipoPrestamo, double monto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoPrestamo = tipoPrestamo;
        this.monto = monto;
    }

    @Override
    public ClientePrototype clone() {
        try {
            return (ClientePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "ClientePrototype{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", tipoPrestamo='" + tipoPrestamo + '\'' +
                ", monto=" + monto +
                '}';
    }
}