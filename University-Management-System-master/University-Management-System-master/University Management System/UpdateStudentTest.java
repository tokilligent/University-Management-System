/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class UpdateStudentTest{
    
    public UpdateStudentTest() {
        UpdateStudent a=new UpdateStudent();
    }

    @Test
    public void testActionPerformed() throws SQLException {
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
        String k = "12";
        String l = "bsc";
        String m = "cse";
        
        conn cc = new conn();
        String q = "update student set name='"+a+"',fathers_name='"+bb+"',age='"+c+"', dob='"+d+"',address='"+e+"',phone='"+ff+"',email='"+g+"',class_x='"+h+"',class_xii='"+i+"',aadhar='"+j+"',course='"+l+"',branch='"+m+"' where rollno='"+k+"'";
        cc.s.executeUpdate(q);
        try{
        String q1="select * from student where rollno='"+k+"'";
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
        assertEquals(k,rs.getString("rollno"));
        assertEquals(l,rs.getString("course"));
        assertEquals(m,rs.getString("branch"));
        }
        }
        catch (SQLException z){
            z.printStackTrace();
        }
    }

}
