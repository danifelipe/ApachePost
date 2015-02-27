/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.apachecommpos.Consulta;
import java.io.IOException;
import java.sql.SQLException;
import org.testng.annotations.Test;

/**
 *
 * @author DanielSF
 */
public class ApacheCommPosTest {
    
    public ApacheCommPosTest() {
    }

    @Test
    public void conexion() throws SQLException, IOException{
        Consulta consulta= new Consulta();
        consulta.conexion();
    }
}
