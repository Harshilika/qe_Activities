package qe.java;
class customException extends Exception{
   String  message;
  customException(String message)
  {
    this.message=message;
  }
  public String getMessage()
  {
    return message;
  }
}
public class Activity8_ExceptionHandling {
    public static void exceptionTest(String message) throws customException
    {
                if(message.length()==0)
                {
                    throw new customException("Invalid String");
                }
                else{
                    System.out.println(message);
                }
            
        
    }
 public static void main(String[] args) throws customException{
    try{
      exceptionTest("");
    }
    catch(customException e)
    {
        System.out.println(e.getMessage());
    }
 }
}
