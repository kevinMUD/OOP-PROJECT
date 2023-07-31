/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

;
import Model.menu;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gisa
 */
public class menuDao {
   public void save(menu mn){
        Session ss=null;
        Transaction tr=null;
        try
        {
            ss=HibernateUtil.getSessionFactory().openSession();
            tr=ss.beginTransaction();
            ss.save(mn);
            tr.commit();
            JOptionPane.showMessageDialog(null, "New menu established!!", "Restaurent", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
            ex.printStackTrace();
        }
}

    
    public List<menu> Read(){
        List<menu> list = new ArrayList<>();
        Session ss=null;
        try{
            ss=HibernateUtil.getSessionFactory().openSession();
            list = ss.createQuery("FROM menu").list();
        }catch(HibernateException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            if(ss!=null){
                ss.close();
            }
        }        
       return list;
    }
    
    public boolean update(menu mn){
       
        boolean result=false;
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.update(mn);
        result=true;
        tr.commit();
        ss.close();
        return result;
    }
    
    public boolean deleteVehicle(menu mn){
        
        boolean result=false;
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.delete(mn);
        result=true;
        tr.commit();
        ss.close();
        return result;
    }
}
