package DAL;

import DTO.TenisDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TenisDAL {

    public void cadastrar(TenisDTO dto) {

        String sql = "INSERT INTO Tenis (tenFabricante, tenModelo) VALUES (?, ?)";

        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, dto.getTenFabricante());
            stmt.setString(2, dto.getTenModelo());

            stmt.execute();

            stmt.close();
            conn.close();

            System.out.println("Tênis cadastrado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }

    public void alterar(TenisDTO dto) {

        String sql = "UPDATE Tenis SET tenFabricante=?, tenModelo=? WHERE tenID=?";

        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, dto.getTenFabricante());
            stmt.setString(2, dto.getTenModelo());
            stmt.setInt(3, dto.getTenID());

            stmt.executeUpdate();

            stmt.close();
            conn.close();

            System.out.println("Tênis alterado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao alterar: " + e.getMessage());
        }
    }

    public void excluir(int id) {

        String sql = "DELETE FROM Tenis WHERE tenID=?";

        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
            conn.close();

            System.out.println("Tênis excluído com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao excluir: " + e.getMessage());
        }
    }
}