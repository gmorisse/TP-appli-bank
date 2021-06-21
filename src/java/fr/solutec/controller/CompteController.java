/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.controller;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author PC
 */
public class CompteController {
    
    public static String genererNumeroCompte(){
        String numero = "";
        Random r = new Random();
        
        for (int i = 0; i<10; i++) {
            String setOfCharacters = "abcdefghxyz1234567-/@";

        int randomInt = r.nextInt(setOfCharacters.length());
        numero += setOfCharacters.charAt(randomInt);
            
        }
        
        return numero;
    }
    
        public static int genererNumeroCarte(){
        Random r = new Random();

        
        return r.nextInt(999999999);
    }
    
    
}
