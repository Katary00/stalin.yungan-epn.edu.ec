package DAC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import BL.Coordenadas;

public class CoordenadasDAC {
    private SQLiteHelper conexion = new SQLiteHelper();

    public List<Coordenadas> obtenerCoordenadas() {
        List<Coordenadas> coordenadas = new ArrayList<>();
        Set<String> geoposiciones = new HashSet<>();
        try (Connection conn = conexion.getCn();
             PreparedStatement stmt = conn.prepareStatement("SELECT CAPACIDAD_BELICA, GEOPOSICIONAMIENTO, ARSENAL FROM COORDENADAS");
             ResultSet rs = stmt.executeQuery()) {
    
            while (rs.next()) {
                int capacidadBelica = rs.getInt("CAPACIDAD_BELICA");
                String geoposicionamiento = rs.getString("GEOPOSICIONAMIENTO");
                String arsenal = rs.getString("ARSENAL");
                if (!geoposiciones.contains(geoposicionamiento)) {
                    Coordenadas coordenada = new Coordenadas(capacidadBelica, geoposicionamiento, arsenal);
                    coordenadas.add(coordenada);
                    geoposiciones.add(geoposicionamiento);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return coordenadas;
    }
    
}
