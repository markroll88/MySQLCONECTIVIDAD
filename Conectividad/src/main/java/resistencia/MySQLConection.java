package resistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConection {

        Connection connection;

        private final String URL = "jdbc:mysql://localhost:3306/";
// utilza jdbc conectando a esta direccion sirve para toda maquoina

        //xamp levantara de este host  nnuestra base de datos, es por defevto este puerto, hay q especificar
        private final String BD = "fabrica";
        private final String USER = "root";
        private final String PASSWORD = "";
// si hay otra configuracion, conectar esto, root o vacio para password


        public void establecerConexion()  {
//throws SQLException puede ser por errores de olvido de llaves, no es conveniente porque no soluciona nadathrows SQLException


            try {
                connection = DriverManager.getConnection( URL + BD,USER,PASSWORD);
                System.out.println("LA CONEXION SE HA ESTABLECIDO EXITOSAMENTE");
            } catch (SQLException e) {
                System.out.println("ERROR EN LA CONEXION");
                // throw new RuntimeException(e);
            }


        }
    }




