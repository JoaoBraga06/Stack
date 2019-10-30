/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackADT;

import Exceptions.EmptyCollectionException;

/**
 *
 * @author joaop
 */
public class LinkedStack<T> implements StackADT<T>{
    private LinkedNode<T> top;

    public LinkedStack() {
        top=null;
    }
 
    @Override
    public void push(T element) {
        LinkedNode<T> temp=top;
        top=new LinkedNode<>(element);
        top.setNext(temp);
    }

    @Override
    public T pop() throws EmptyCollectionException {
        LinkedNode<T> temp=top;
        top=top.getNext();
        temp.setNext(null);
        return temp.getElement();
    }

    @Override
    public T peek() throws EmptyCollectionException {
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return (top==null);
    }

    @Override
    public int Size() {
        int i=0;
        LinkedNode<T> temp=top;
        while(temp!=null){
            i++;
            temp=temp.getNext();
        }
        return i;
    }
    
    @Override
    public String toString(){
        String result="";
        LinkedNode<T> temp=top;
        while(temp!=null){
            System.out.println(temp.getElement().toString());
            result+=temp.getElement().toString();
            temp=temp.getNext();
        }
        return result;
    }
    
}
