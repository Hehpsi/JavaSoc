import java.util.ArrayList; // gives the resizable array
import java.util.List; // this interface can extend the collection interface
import java.util.stream.Collectors; // perform the operations for collections
public class ClientInbox implements Inbox // class ClientInbox
{
    private List<Activity> messages; // gets the messages for List
    ClientInbox () // ClientInbox uses the library
    { 
        messages = new ArrayList<>(); // gets the messages object
    } 
    public int getCount () // getcount 
    {
        return messages.size(); // return the message size
    }
    public Activity readNext () // readNext activity
    {
        return (this.getCount() > 0) ? messages.remove(0) : null; // return the messages
    }
    public boolean receive(Activity activity) // receive the activity that implements the activity
    {
        return this.messages.add(activity); // return the messages 
    }
    public String toString () 
    {
        if (this.getCount() > 0) 
        {
            String result = messages.stream().map(Activity::getURI).collect(Collectors.joining("\n-")); // gets the result
            return "- " + result; // return the result
        }
        return "- Inbox is empty"; // return the messages
    }
}

/*
Explanation:
This code defines a class called ClientInbox that implements the Inbox interface. 
The ClientInbox class represents an inbox for a client that can receive and store messages.
The class has the following methods:
ClientInbox() - This is the constructor method that initializes the messages field with a new ArrayList object.
getCount() - This method returns the number of messages currently stored in the inbox.
readNext() - This method removes and returns the next message in the inbox. 
If there are no messages, it returns null.
receive(Activity activity) - This method adds a new message to the inbox. 
The activity parameter is an Activity object that represents the message being added. 
The method returns true if the message was successfully added to the inbox.
toString() - This method returns a string representation of the inbox. 
If the inbox is not empty, it returns a string containing the URIs of all messages in the inbox, separated by newline characters. 
If the inbox is empty, it returns the string "- Inbox is empty".
*/