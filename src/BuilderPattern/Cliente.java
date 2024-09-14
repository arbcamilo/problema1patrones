package BuilderPattern;

public class Cliente {
    private String nombre;
    private String identificacion;
    private String tipoPrestamo;
    private double monto;

    private Cliente(ClienteBuilder builder) {
        this.nombre = builder.nombre;
        this.identificacion = builder.identificacion;
        this.tipoPrestamo = builder.tipoPrestamo;
        this.monto = builder.monto;
    }

    public static class ClienteBuilder {
        private String nombre;
        private String identificacion;
        private String tipoPrestamo;
        private double monto;

        public ClienteBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public ClienteBuilder setIdentificacion(String identificacion) {
            this.identificacion = identificacion;
            return this;
        }

        public ClienteBuilder setTipoPrestamo(String tipoPrestamo) {
            this.tipoPrestamo = tipoPrestamo;
            return this;
        }

        public ClienteBuilder setMonto(double monto) {
            this.monto = monto;
            return this;
        }

        public Cliente build() {
            return new Cliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", tipoPrestamo='" + tipoPrestamo + '\'' +
                ", monto=" + monto +
                '}';
    }
}
