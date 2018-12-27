package com.stackroute.unittest.pe3;

public class ExceptionHandling extends Exception {

    public ExceptionHandling(String s)
    {
        super(s);
    }
    public static void main(String args[])
    {
//        try{
//            int data=25/0;
//            System.out.println(data);
//        }
//        catch(ArithmeticException e){System.out.println(e);}
//        finally{System.out.println("finally block is always executed");}
//        System.out.println("rest of the code...");

            try
            {
                // Throw an object of user defined exception
                throw new ExceptionHandling("Exception is thrown");
            }
            catch (ExceptionHandling ex)
            {
                System.out.println("Caught the exception");

                // Print the message from MyException object
                System.out.println(ex.getMessage());
            }
            finally
            {
                System.out.println("Final block");
            }
    }
}
