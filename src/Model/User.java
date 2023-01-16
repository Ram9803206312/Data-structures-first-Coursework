/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ING Skill
 */
public class User {
    
    private int id;
    private String Acc_Name;
    private String address;
    private String Account_type;
    private String openingdate;
    private String Acc_holder_number;
    private int currentBLC;
    private String Account_status;
    
  //user class account holder details  getter and setter method 
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcc_Name() {
        return Acc_Name;
    }

    public void setAcc_Name(String A_name) {
        this.Acc_Name = A_name;
    }

    public String getaddress() {
        return address;
       }

    public void setaddress(String add) {
        this.address = add;
       }
    
    public String getopeningdate() {
        return openingdate;
       }

    public void setopeningdate(String open_date) {
        this.openingdate = open_date;
        }
   
    public String  getAcc_holder_number() {
        return Acc_holder_number ;
       }
    public void  setAcc_holder_number( String H_num) {
        
         this.Acc_holder_number = H_num;
      }
    public int  getcurrentBLC() {
        return currentBLC ;
      }
    public void  setcurrentBLC( int current_blc) {
        
         this.currentBLC = current_blc;
       }  
      
      public String getAccount_type() {
        return Account_type ;
         }
     public void setAccount_type(String acc_type) {
       this.Account_type = acc_type; 
       }
      public String getAccount_Status() {
        return Account_status ;
         }
     public void setAccount_status(String acc_st) {
       this.Account_status = acc_st; 
       }
    
     
   
   
   
    @Override
    public String toString() {
       return "wallet{" + "Account id=" + id + ", Account Name =" + Acc_Name +",Address ="+address+"opening_date="+openingdate+"Account holder name="+Acc_holder_number+"current Balance="+currentBLC+ "Account type="+Account_type+"Account Status ="+Account_status+ '}';

    }
    
    
    
}
