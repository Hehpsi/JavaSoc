public interface Inbox extends ReceiveMessage, ReadNextMessage 
{
  int getCount();
}

/*
Explanation:
This is an example of a Java interface called Inbox. 
In this interface, there are two other interfaces, ReceiveMessage and ReadNextMessage, that this Inbox interface is extending. 
This means that any class that implements the Inbox interface will also need to implement the methods from both ReceiveMessage and ReadNextMessage interfaces.
In addition, the Inbox interface has its own abstract method called getCount() which returns an integer. 
This method is not inherited from any other interface and must be implemented by any class that implements the Inbox interface.
*/