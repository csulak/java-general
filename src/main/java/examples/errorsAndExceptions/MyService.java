package examples.errorsAndExceptions;

public class MyService {


    /**
     * Sample of Throwing a RUNTIME EXCEPTION (Un-Checked)
     */
    public void sayHelloAndGoodBye_runtimeException(String name) {

        System.out.println("Hello " + name);
        if (name == null) {
            System.out.println("Oh no!, name is null");
            throw new BusinessRuntimeException("Name cannot be null. Throwing 'RuntimeException'");
        }
        System.out.println("Goodbye " + name);
    }


    /**
     * Sample of Throwing an EXCEPTION (Checked)
     */
    public void sayHelloAndGoodBye_exception(String name) throws BusinessException
    {
        System.out.println("Hello " + name);
        if (name == null) {
            System.out.println("Oh no!, name is null");
            throw new BusinessException("Name cannot be null. Throwing 'Exception'");
        }
        System.out.println("Goodbye " + name);
    }
}
