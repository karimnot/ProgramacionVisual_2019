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
public class TitleException extends Exception {

    /**
     * Creates a new instance of <code>TitleException</code> without detail
     * message.
     */
    public TitleException() {
    }

    /**
     * Constructs an instance of <code>TitleException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TitleException(String msg) {
        super(msg);
    }
}
