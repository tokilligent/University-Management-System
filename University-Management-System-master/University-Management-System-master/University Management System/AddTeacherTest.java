/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system.Model;


import java.sql.*;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author ASUS
 */
public class AddTeacherTest {
    
    
    public AddTeacherTest() {
        AddTeacher a = new AddTeacher();
    }



    @Test
    public void testActionPerformed() throws Exception {
        String a = "toki";
        String bb = "dad";
        String c = "19";
        String d = "27 may";
        String e = "dhaka";
        String ff = "018";
        String g = "sad@";
        String h = "50";
        String i = "70";
        String j = "234";
        String k = "cse470";
        String l = "11342";
        String m = "cse";
        
        conn cc = new conn();
        String q = "insert into teacher values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"')";
        cc.s.executeUpdate(q);
        try{
        String q1="select * from teacher where name='"+a+"'";
        ResultSet rs= cc.s.executeQuery(q1);
        while(rs.next()){
        assertEquals(a,rs.getString("name"));
        assertEquals(bb,rs.getString("fathers_name"));
        assertEquals(c,rs.getString("age"));
        assertEquals(d,rs.getString("dob"));
        assertEquals(e,rs.getString("address"));
        assertEquals(ff,rs.getString("phone"));
        assertEquals(g,rs.getString("email"));
        assertEquals(h,rs.getString("class_x"));
        assertEquals(i,rs.getString("class_xii"));
        assertEquals(j,rs.getString("aadhar"));
        assertEquals(k,rs.getString("course"));
        assertEquals(l,rs.getString("emp_id"));
        assertEquals(m,rs.getString("dept"));
        }
        }
        catch (SQLException z){
            z.printStackTrace();
        }
    }
    
}
