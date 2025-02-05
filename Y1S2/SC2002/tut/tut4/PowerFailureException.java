package Y1S2.SC2002.tut.tut4;

public class PowerFailureException extends Exception {

    public PowerFailureException(){
        super("Power failure!");
    }

    public PowerFailureException(String message) {
        super(message);
    }
    
}
