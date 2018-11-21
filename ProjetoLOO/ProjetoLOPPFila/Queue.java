/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloo;

/**
 *
 * @author Danie
 */
public interface Queue {
    public int size();
    public boolean isEmpty();
    public Object peek();
    public Object remove();
    public void add(Object elem, int v); 
}
