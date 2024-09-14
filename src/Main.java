import BuilderPattern.Cliente;
import PrototyperPattern.ClientePrototype;


public class Main {
    public static void main(String[] args) {
        // Uso del patrón Builder
        Cliente cliente = new Cliente.ClienteBuilder()
                .setNombre("Juan Camilo")
                .setIdentificacion("123456789")
                .setTipoPrestamo("Personal")
                .setMonto(5000.0)
                .build();
        System.out.println(cliente);

        // Uso del patrón Prototype
        ClientePrototype clientePrototype = new ClientePrototype("Ana Ramirez", "987654321", "Short Loan", 100000.0);
        ClientePrototype clienteClonado = clientePrototype.clone();
        System.out.println(clienteClonado);
    }
}