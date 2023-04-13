import java.util.ArrayList; // gives the resizable array
import java.util.List; // this interface can extend the collection interface
import java.util.stream.Collectors; // perform the operations for collections
public class ClientOutbox implements Outbox  // class ClientOutbox
{
    private List<Activity> messages; // // gets the messages for List
    ClientOutbox() // ClientOutbox uses the library
    {
        messages = new ArrayList<>(); // gets the messages object
    }
    public int getCount() // getcount
    {
        return messages.size(); // return the message size
    }
    public boolean send (Activity activity) // receive the activity that implements the activity
    {
        return messages.add(activity); // return the messages
    }
    public Activity deliverNext () // deliverNext uses the activity interface
    {
        return (this.getCount() > 0) ? messages.remove(0) : null; // return the messages
    }
    public String toString () 
    {
        if (this.getCount() > 0) 
        {
            String result = messages.stream().map(Activity::getURI).collect(Collectors.joining("\n- "));
            return "- " + result; // return the result
        }
        return "- Outbox is empty"; // return the messages
    }
}

/*
Explanation:
This is a class named ClientOutbox that implements the Outbox interface. 
It contains methods to manage the list of Activity objects, which can be added to the lists and removed from the beginning of the list and it will be counted.
The ClientOutbox constructor initializes the messages list as a new ArrayList object.
The getCount method returns the size of the messages list.
The send method takes an Activity object as input and adds it to the messages list using the add method from the List interface.
The deliverNext method returns the first Activity object in the messages list and removes it from the list using the remove method 
from the List interface. 
If the list is empty, it returns null.
The toString method returns a String representation of the messages list. 
If the list is not empty, it maps each Activity object in the list to its URI using the map method from the Stream interface, 
then concatenates them using the joining method from the Collectors class. 
If the list is empty, it returns the message "- Outbox is empty".
*/