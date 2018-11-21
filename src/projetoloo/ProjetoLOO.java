/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloo;

import javax.swing.JOptionPane;

/**
 *
 * @author Danie
 */
public class ProjetoLOO  extends Lista implements Queue {
    protected Lista first;
    protected Lista last;
    protected int size;
    protected int p1;
    protected int p2;
    protected int p3;
    public int var;
    public ProjetoLOO(Object c, Lista n, int p, int x) {
        super(c, n, p, x);
    }
    
    
    public ProjetoLOO(){
    }
    
    @Override
    public int size() {
        JOptionPane.showMessageDialog(null,"A fila contém "+size+" Pessoas");
        return size;
    }

    @Override
    public boolean isEmpty() {
       return(size==0);
    }

    @Override
    public Object peek(){
        if(isEmpty()){
            System.out.println("Lista Vazia!");
        }
        JOptionPane.showMessageDialog(null,"Senha :"+ first.val);
        return first.val;
    }

    @Override
    public Object remove(){
        if(isEmpty()){
            System.out.println("Lista Vazia!");
        }
        Object r = first.val;
        first = first.next;
        size--;
        if(first==null){
            last = null;
        }
        return r;
    }

    @Override
    public void add(Object p, int v) {
        Lista n = new Lista(p, null, v, x++);
        if(isEmpty()){
            last = n;
            first=last;
        }else{
            last.next=n;
            last =n;
        }
        if(v == 1){
            p3++;
        }else if(v == 2){
            p2++;
        }else{
            p1++;
        }
        size++;
        JOptionPane.showMessageDialog(null, "Sua senha é:" + x);
    }

    public Lista getFirst() {
        return first;
    }

    public void setFirst(Lista first) {
        this.first = first;
    }

    public Lista getLast() {
        return last;
    }

    public void setLast(Lista last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Lista getNext() {
        return next;
    }

    public void setNext(Lista next) {
        this.next = next;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
     public static int getX() {
        x++;
        return x;
    }

    public static void setX(int x) {
        ProjetoLOO.x = x;
    }
        public Object ChamarRecP1(Lista cursor){
            if(cursor.val != null && cursor.p == 1){
                var = cursor.x;
                JOptionPane.showMessageDialog(null,"Sua senha é: " + cursor.val);
                return cursor.val;
            }
                return ChamarRecP1(cursor.next);
            }
            public Object ChamarRecP2(Lista cursor){
            if(cursor.val != null && cursor.p == 2){
                JOptionPane.showMessageDialog(null,"Sua senha é: " + cursor.val);
                return cursor.val;
            }
               return ChamarRecP1(cursor = cursor.next);
            }
            public Object ChamarRecP3(Lista cursor){
            if(cursor.val != null && cursor.p == 3){
                JOptionPane.showMessageDialog(null,"Sua senha é: " + cursor.val);
                remove();
                return cursor.val;
            }
                return ChamarRecP1(cursor = cursor.next);
            }
        }
