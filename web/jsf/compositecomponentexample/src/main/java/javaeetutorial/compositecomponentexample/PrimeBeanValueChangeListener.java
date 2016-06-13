/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeetutorial.compositecomponentexample;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 *
 * @author SanghviR
 */
public class PrimeBeanValueChangeListener implements ValueChangeListener{

    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
        System.out.println("The phase in which it is executing "+event.getPhaseId().getName());
         System.out.println("Hey In Value Change ");
        System.out.println("The old value is "+event.getOldValue() + " The new value is "+event.getNewValue());
    }
    
}
