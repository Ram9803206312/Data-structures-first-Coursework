/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author ING Skill
 */
public class Sorting {
    
    
    //sorting class create  selection sortID   method  
     public void SelectionSortID(int[] ID, String[] Names, String[] Address, String[] Date, String[] Number,int[]Balance, String[] Acc_types, String[] Acc_Status, int values){
        int size = ID.length;
        
        for(int step=0; step<size-1; step++){
            int min_Index = step;
            
            for(int next=step+1; next<size; next++){
                if (values==1) {
                    if(ID[next]>ID[min_Index]){
                        min_Index = next;
                    }
                }else{
                    if(ID[next]<ID[min_Index]){
                        min_Index = next;
                    }
                }
            }
           
           
            //number swap
           int temp = ID[step];
           ID[step] = ID[min_Index];
           ID[min_Index] = temp;
           
           //word swap
           String temp1 = Names[step];
           Names[step] = Names[min_Index];
           Names[min_Index] = temp1;
           
            //Address swap
           String temp2 = Address[step];
           Address[step] = Address[min_Index];
            Address[min_Index] = temp2;
            
             //Date swap
            String temp3 = Date[step];
            Date[step] = Date[min_Index];
            Date[min_Index] = temp3;
            
            
             // holder_name swap
            String temp4 = Number[step];
            Number[step] = Number[min_Index];
            Number[min_Index] = temp4;
            
            //current_blc swap
             int temp5 = Balance[step];
            Balance[step] = Balance[min_Index];
            Balance[min_Index] = temp5;
            
            
             //Account_type swap
            String temp6 = Acc_types[step];
            Acc_types[step] = Acc_types[min_Index];
            Acc_types[min_Index] = temp6;
            
            //Account_Status swap
           String temp7 = Acc_Status[step];
            Acc_Status[step] = Acc_Status[min_Index];
            Acc_Status[min_Index] = temp7;
       }
    }
    //cerate method for balance sorting
     public void SelectionSortBalance(int[] ID, String[] Names, String[] Address, String[] Date, String[] Number,int[]Balance, String[] Acc_types, String[] Acc_Status, int values){
        int size = Balance.length;
        
        for(int step=0; step<size-1; step++){
            int min_Index = step;
            
            for(int next=step+1; next<size; next++){
                if (values==1) {
                    if(Balance[next]>Balance[min_Index]){
                        min_Index = next;
                    }
                }else{
                    if(Balance[next]<Balance[min_Index]){
                        min_Index = next;
                    }
                }
            }
           
           
            //number swap
           int temp = ID[step];
           ID[step] = ID[min_Index];
           ID[min_Index] = temp;
           
           //word swap
           String temp1 = Names[step];
           Names[step] = Names[min_Index];
           Names[min_Index] = temp1;
           
            //Address swap
           String temp2 = Address[step];
           Address[step] = Address[min_Index];
            Address[min_Index] = temp2;
            
             //Date swap
            String temp3 = Date[step];
            Date[step] = Date[min_Index];
            Date[min_Index] = temp3;
            
            
             // holder_name swap
            String temp4 = Number[step];
            Number[step] = Number[min_Index];
            Number[min_Index] = temp4;
            
            //current_blc swap
             int temp5 = Balance[step];
            Balance[step] = Balance[min_Index];
            Balance[min_Index] = temp5;
            
            
             //Account_type swap
            String temp6 = Acc_types[step];
            Acc_types[step] = Acc_types[min_Index];
            Acc_types[min_Index] = temp6;
            
            //Account_Status swap
           String temp7 = Acc_Status[step];
            Acc_Status[step] = Acc_Status[min_Index];
            Acc_Status[min_Index] = temp7;
       }
    }
    
}
