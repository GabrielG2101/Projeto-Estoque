
package br.facens.model.dao.exception;


public class DAOexception extends Exception {
     public DAOexception() {
    }

    public DAOexception(String message) {
        super(message);
    }

    public DAOexception(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOexception(Throwable cause) {
        super(cause);
    }
}

