/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system.Model;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class StudentAttendanceTest {
    
    public StudentAttendanceTest() {
        StudentAttendance a= new StudentAttendance();
    }

    @Test
    public void testActionPerformed() throws SQLException {
        conn c1= new conn();
        String f = "first";
        String s = "second";
        String dt = "30 dec";
        String id="121";
        String qry = "insert into attendance_student values("+ id +",'"+dt+"','"+f+"','"+s+"')";
        c1.s.executeUpdate(qry);
        
        try{
            qry="select * from attendance_student where rollno='"+id+"'";
            ResultSet rs= c1.s.executeQuery(qry);
                while(rs.next()){
                    assertEquals(f,rs.getString("first"));
                    assertEquals(s,rs.getString("second"));
                    assertEquals(dt,rs.getString("Date"));
                    assertEquals(id,rs.getString("rollno"));
                }
        }
        catch (Exception z){
            z.printStackTrace();
        }
    }
        
}


