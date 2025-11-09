
package TablaUsuarios;
//Espinoza Flores Yojan Gael

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class UsuarioManager {
    private static final String archivo = "usuarios.txt";

    public static List<Usuario> cargarUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(archivo));
            for (int i = 0; i < lineas.size(); i++) {
                String lin = lineas.get(i);
                Usuario u = Usuario.fromString(lin);
                if (u != null) {
                    lista.add(u);
                }
            }
        } catch (IOException e) {
        }
        return lista;
    }
    
    public static void guardarUsuarios(List<Usuario> lista) {
        List<String> lineas = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            Usuario u = lista.get(i);
            lineas.add(u.toString());
        }
        try {
            Files.write(Paths.get(archivo), lineas);
        } catch (IOException e) {
        }
    }
}
