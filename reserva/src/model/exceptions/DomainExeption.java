package model.exceptions;

public class DomainExeption extends RuntimeException {
    private static final long srialVersionUTD = 1L;

    public DomainExeption (String msg){
        super(msg);
    }
}
