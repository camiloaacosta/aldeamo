package com.co.aldeamo.pruebaaldeamo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.aldeamo.pruebaaldeamo.model.Data;
import com.co.aldeamo.pruebaaldeamo.repository.DataRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  

@Service
public class DataService {

        @Autowired
            DataRepository dataRepository; 
        
        public String getData(Integer itera, Integer id) {
        	
        	Integer[] P = numerosPrimos();
        	ArrayList<Integer> A = new ArrayList<Integer>();
        	ArrayList<Integer> B = new ArrayList<Integer>();
        	
        	Data data = dataRepository.findById(id).get();
            String dataArray = data.getInputArray();
            String[] arrayFinal = dataArray.split(",");
            
            List<String> arrayPrueba = Arrays.asList(arrayFinal);
            
            Integer cont = 1;
            Integer last = 0;  
            Integer last2 = 0;
            Integer[] Respuesta = {};
            Integer i = 0;
                                 
            while (cont <= arrayPrueba.size()) {
            	last = Integer.parseInt(arrayPrueba.get(arrayPrueba.size() - cont));  	
	            
            	if ((last % P[i]) == 0) {
            		B.add(last);
	            } else {
	              	A.add(last);
	            }          	
	               	cont++;
	        }            
                 	
	        while (itera > 1) {
	        	
	        	ArrayList<Integer> Aaux = new ArrayList<>(A);
	          	A.clear();
	            Integer cont2 = 1;
	        	
	            while (cont2 <= Aaux.size()) {
	            	
	            	last2 = Aaux.get(Aaux.size() - cont2);  	
	    	            
	                if ((last2 % P[i+1]) == 0) {
	                	B.add(last2);
	    	        } else {
	    	        	A.add(last2);
	    	        }          	
	    	           	cont2++;
	    	    }
	                       
	            itera--;
		        i++;		            
	        }        		                    
            
            Respuesta = B.toArray(Respuesta);
            return Arrays.toString(Respuesta); 
        }
        
        public Integer[] numerosPrimos() {
        	
            Integer contador, numero, hasta, i;
            Integer[] numerosPrimos = {};
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            
            numero = 1;
            hasta = 50;
         
	        while (numero <= hasta) {
	            contador = 0;
	        	
	            for(i = 1; i <= numero; i++) {
		            	if((numero % i) == 0) {
		            		contador++;
		                }
		        }
	            
	            if(contador == 2) {
	            	arrayList.add(numero);
	            }
	            
	            numero++;
	        }
         
            numerosPrimos = arrayList.toArray(numerosPrimos);
            
            return numerosPrimos;
        }
}
