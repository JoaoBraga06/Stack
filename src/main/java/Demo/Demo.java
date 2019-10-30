/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;
import Exceptions.EmptyCollectionException;
import StackADT.*;

/**
 *
 * @author joaop
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EmptyCollectionException {
        StackADT<String> arrayStack = new ArrayStack<>();
        
        String a="Viva";
        String b="o";
        String c="Sporting";
        
        arrayStack.push(a);
        arrayStack.push(b);
        arrayStack.push(c);
        arrayStack.toString();
        arrayStack.pop();
        arrayStack.toString();

        LinkedStack<String> linkedStack= new LinkedStack<>();
        
        linkedStack.push(a);
        linkedStack.push(b);
        linkedStack.push(c);
        linkedStack.toString();
        linkedStack.pop();
        linkedStack.toString();
    
    }
}
