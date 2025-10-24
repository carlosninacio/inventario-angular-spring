package gm.inventarios;

import gm.inventarios.modelo.Producto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.ref.SoftReference;

@SpringBootApplication
public class InventariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventariosApplication.class, args);

        // Prueba de lombok
        Producto producto = new Producto();
        producto.setDescripcion("Camisa M");
        producto.setPrecio(600.0);
        producto.setExistencia(30);

        // Imprimir
        System.out.println(producto);
	}

}
