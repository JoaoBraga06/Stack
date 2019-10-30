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
 * @param <T>
 */
public interface StackADT<T> {
    public void push(T element);
    
    public T pop() throws EmptyCollectionException;
    
    public T peek() throws EmptyCollectionException;
    
    public boolean isEmpty();
    
    public int Size();
    
    @Override
    public String toString();
}
