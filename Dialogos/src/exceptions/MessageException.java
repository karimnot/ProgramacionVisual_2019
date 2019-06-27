/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author karimnot
 */
public class MessageException extends Exception {

    /**
     * Creates a new instance of <code>MessageException</code> without detail
     * message.
     */
    public MessageException() {
    }

    /**
     * Constructs an instance of <code>MessageException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MessageException(String msg) {
        super(msg);
    }
}
