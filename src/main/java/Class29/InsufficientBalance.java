package Class29;

/***
 * This exception is thrown when theres not enough balance in the users account
 * and he tries to withdraw more
 */
public class InsufficientBalance extends RuntimeException {

    public InsufficientBalance(String errorMsg) {
        super(errorMsg);
    }
}


