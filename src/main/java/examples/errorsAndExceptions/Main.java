package examples.errorsAndExceptions;

public class Main
{
    public static void main(String[] args) throws BusinessException
    {
        MyService myService = new MyService();

        String name = null;

        //runtimeException(myService, name);

        exception_with_try_catch(myService, name);


        // Como aca no hay un try-catch, la excepcion se lanza y el programa termina.
        // Como no hay try-catch me vi obligado a firmar el metodo de main con "throws BusinessException"
        // La aplicacion es interrumpida. Como en los otros try-catch solo estoy imprimiendo en pantalla
        // No son interrumpidos
        exception_with_throws_signature(myService, name);


        StackOverflowError stackOverflowError = new StackOverflowError();
    }

    /**
     * Sample of calling a method that throws a RUNTIME EXCEPTION (Un-Checked).
     * Using the try/catch block is optional and will be a decision of the developer use it or not
     */
    private static void runtimeException(MyService myService, String name)
    {
        printSeparator("Runtime Exception");
        try
        {
            myService.sayHelloAndGoodBye_runtimeException(name);
        }
        catch (BusinessRuntimeException e)
        {
            System.out.println("Runtime Exception caught: " + e.getMessage());
        }
    }

    private static void exception_with_try_catch(MyService myService, String name)
    {
        printSeparator("exception_with_try_catch");
        try
        {
            myService.sayHelloAndGoodBye_exception(name);
        }
        catch (BusinessException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    private static void exception_with_throws_signature(MyService myService, String name) throws BusinessException
    {
        printSeparator("exception_with_throws_signature");
        myService.sayHelloAndGoodBye_exception(name);
    }



    public static void printSeparator(String title) {
        System.out.println("\n---------------------------- " + title + " -------------------------------\n");
    }
}