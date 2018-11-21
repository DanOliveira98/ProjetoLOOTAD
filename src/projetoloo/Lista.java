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
public class Lista {
   public static int x;
   protected Lista next;
   protected Object val;
   protected int p;
    public Lista(Object c, Lista n, int p, int x) {
        this.val = c;
        this.next = n;
        this.p = p;
        this.x = x; 
    }
    public Lista(){
        
    }
}
