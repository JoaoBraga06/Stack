/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackADT;

/**
 *
 * @author joaop
 */
public class LinkedNode<T> {
    private LinkedNode<T> next;
    private T element;

    public LinkedNode() {
        element=null;
        next=null;
    }
    
    public LinkedNode(T element) {
        next=null;
        this.element = element;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
    
    
}
