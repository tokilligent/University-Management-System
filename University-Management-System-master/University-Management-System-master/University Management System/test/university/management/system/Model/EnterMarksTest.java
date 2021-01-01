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
public class EnterMarksTest {
    
    public EnterMarksTest() {
        EnterMarks e=new EnterMarks();
    }

    @Test
    public void testActionPerformed() throws SQLException {
        String rollno = "123";
        String subject1 = "bio";
        String subject2 = "chem";
        String subject3 = "phy";
        String subject4 = "mat";
        String subject5 = "sta";
        
        String marks1 = "50";
        String marks2= "70";
        String marks3 = "234";
        String marks4= "cse470";
        String marks5 = "11342";
        
        conn c1 = new conn();

        String s1 = "insert into subject values('"+rollno+"','"+subject1+"','"+subject2+"','"+subject3+"','"+subject4+"','"+subject5+"')";
        String s2 = "insert into marks values('"+rollno+"','"+marks1+"','"+marks2+"','"+marks3+"','"+marks4+"','"+marks5+"')";

        c1.s.executeUpdate(s1);
        c1.s.executeUpdate(s2);
        
        try{
            String q1="select * from subject where rollno='"+rollno+"'";
            ResultSet rs1= c1.s.executeQuery(q1);
            while(rs1.next()){
                assertEquals(rollno,rs1.getString("rollno"));
                assertEquals(subject1,rs1.getString("subject1"));
                assertEquals(subject2,rs1.getString("subject2"));
                assertEquals(subject3,rs1.getString("subject3"));
                assertEquals(subject4,rs1.getString("subject4"));
                assertEquals(subject5,rs1.getString("subject5"));
            }
        }
        catch(Exception z){
            z.printStackTrace();
        }
        
        try{
            String q2="select * from marks where rollno='"+rollno+"'";
            ResultSet rs2= c1.s.executeQuery(q2);
            while(rs2.next()){
                assertEquals(rollno,rs2.getString("rollno"));
                assertEquals(marks1,rs2.getString("marks1"));
                assertEquals(marks2,rs2.getString("marks2"));
                assertEquals(marks3,rs2.getString("marks3"));
                assertEquals(marks4,rs2.getString("marks4"));
                assertEquals(marks5,rs2.getString("marks5"));
            }
        }
        catch(Exception z){
            z.printStackTrace();
        }
        
    }

    
}
