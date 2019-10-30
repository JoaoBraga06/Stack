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
public class ArrayStack<T> implements StackADT<T>{

    private final int DEFAULT_CAPACITY=100;
    private final int EXTEND_CAPACITY=20;
    
    private int top;
    
    private T[] stack;

    public ArrayStack() {
        top=0;
        stack=(T[])new Object[DEFAULT_CAPACITY];
    }
    
    public ArrayStack(int initalCapacity) {
         top=0;
         stack=(T[])new Object[initalCapacity];
     }

    @Override
    public void push(T element) {
        if(Size()==stack.length)
            extendCapacity();
        stack[top]=element;
        top++;
    }


    @Override
    public T pop() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException();
        
        top--;
        T temp=stack[top];
        stack[top]=null;
        return temp;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException();
        return stack[top-1];
    }

    @Override
    public boolean isEmpty() {
        return (top==0);
    }

    @Override
    public int Size() {
        return top;
    }
    
    private void extendCapacity(){
        T[] temp=(T[])new Object[Size()+EXTEND_CAPACITY];
        System.arraycopy(stack, 0, temp, 0, Size());
        stack=temp;
    }
    
    @Override
    public String toString(){
        String result="";
        for(int i=Size()-1;i>=0;i--){
            System.out.println("Position "+(i+1)+": "+stack[i].toString());
            result+=stack[i].toString();
        }
        return result;
    }
    
}
