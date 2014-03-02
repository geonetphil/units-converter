/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.geonetphil.unitconverter.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author djabry
 */
public class App {
    

    private Map<String,Double> conversions;
    
    
    public App(){
        
        conversions = new HashMap();
        
        conversions.put("feet",0.3048);
        conversions.put("metres", 1.0);
        conversions.put("yards", 0.9144);
        
        
    }
    
   public double process(int o1, double v1,String u1String,int o2,String u2String){
       
       double u1 = conversions.get(u1String);
       double u2 = conversions.get(u2String);
       double o1Val = Math.pow(10, o1);
       double o2Val = Math.pow(10, o2);
       
       
       
       
       double v2 = (o1Val*v1*u1)/(u2*o2Val);
       
       return v2;
       
   }
   
   

    public static void main(String[] args){
        
        App a = new App();
        
        int o1 = 0;
        double v1 = 2.5;
        String u1String = "metres";
        int o2 = 0;
        String u2String  = "yards";
        
        double v2 = a.process(o1, v1, u1String, o2, u2String);
        
        System.out.println("Output vlaue = "+v2);
        
    }
    
}
