/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.restaurent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gisa
 */
public class RestaurentDao {

public void save(restaurent Resto){
        Session ss=null;
        Transaction tr=null;
        try
        {
            ss=HibernateUtil.getSessionFactory().openSession();
            tr=ss.beginTransaction();
            ss.save(Resto);
            tr.commit();
            JOptionPane.showMessageDialog(null, "New Restaurent saved successfully!", "Restaurent", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
            ex.printStackTrace();
        }
}

    
    public List<restaurent> Read(){
        List<restaurent> list = new ArrayList<>();
        Session ss=null;
        try{
            ss=HibernateUtil.getSessionFactory().openSession();
            list = ss.createQuery("FROM restaurent").list();
        }catch(HibernateException ex){
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            if(ss!=null){
                ss.close();
            }
        }        
       return list;
    }
    
    public boolean update(restaurent resto){
       
        boolean result=false;
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.update(resto);
        result=true;
        tr.commit();
        ss.close();
        return result;
    }
    
    public boolean deleteVehicle(restaurent resto){
        
        boolean result=false;
        Session ss=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.delete(resto);
        result=true;
        tr.commit();
        ss.close();
        return result;
    }
}



