public interface SendMessage 
{
    boolean send(Activity activity);
}

/* 
Explanation: 
This is an interface named SendMessage that can contains a single method signature send(Activity activity) 
that takes an instance of the Activity class as a parameter and returns a boolean value.
In this case, any class that implements the SendMessage interface must provide an implementation for the send(Activity activity) method. 
*/