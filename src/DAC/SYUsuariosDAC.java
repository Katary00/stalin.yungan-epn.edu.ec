package DAC;

import BL.SYUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class SYUsuariosDAC {
    private SQLiteHelper conexion = new SQLiteHelper();
    

    public boolean syAutenticarUsuario(SYUsuarios syUsuario) {
        String sql = "SELECT * FROM usuarios WHERE USUARIO = ? AND CONTRASENIA = ?";
        try (Connection conn = conexion.getCn();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, syUsuario.getSyUsuario());
            pstmt.setString(2, syUsuario.getSyContrasenia() );
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (Exception ex) {
               
            return false;
        }
    }
}