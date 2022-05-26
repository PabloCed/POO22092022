
package ico.fes.db;

import java.util.ArrayList;
import org.sqlite.SQLiteException;
import ico.fes.herencia.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class PersonaDAO implements interfazDao{

    public PersonaDAO() {
    }
    

@Override
public ArrayList obtenerTodo() throws SQLiteException{
ArrayList<Persona> info = new ArrayList<Persona>();

try{
    Statement stm = (Statement) BaseDeDatos.getInstance().getConexion().createStatement();
    ResultSet rst = stm.executeQuery("Select * FROM persona; " );

while (rst.next()){
info.add(new Persona(rst.getString(1), rst.getInt(2)));
}

}catch(SQLException ex){
ex.printStackTrace();
}
return info;
}





@Override
public boolean insertar(Object o) throws SQLiteException{
boolean respuesta = false;

Persona p=(Persona ) o ;
String sql= "INSERT INTO persona VALUES (?,?)";
try{
PreparedStatement pstm = BaseDeDatos.getInstance().getConexion().prepareStatement(sql);
pstm.setString(1, p.getNombre());
pstm.setInt(2, p.getEdad());
int rowCount=pstm.executeUpdate();
respuesta= rowCount ==1? true:false;



}catch (SQLException ex){
ex.printStackTrace();
}




return respuesta;
}




@Override
public boolean eliminar(String n) throws SQLiteException{
return true;
}

}
