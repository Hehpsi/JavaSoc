public class ClientApp implements App // client app implements the App
{
    private Inbox inbox; // Inbox uses the inbox as an object
    private Outbox outbox; // Outbox uses the outbox as an object
    ClientApp() // ClientApp
    {
        inbox = new ClientInbox(); // inbox 
        outbox = new ClientOutbox();
    }
    public Inbox getInbox() 
    {
        return this.inbox; // return the inbox
    }
    public Outbox getOutbox() 
    { 
        return this.outbox; // return the outbox
    }
    public String demo () 
    {
        
        Person p1 = new Person("https://www.w3.org/TR/activitypub/", "Activity Pub", "Activity", "Created user Person1"); // creates person1
        System.out.println("Person1 added"); // person 1 added
        System.out.println("- URI: " + p1.getURI()); // get the URI
        System.out.println("- name: " + p1.getName() + "\n"); // get the name
        Person p2 = new Person("https://www.w3.org/TR/activitypub/#Overview", "Activity Pub1", "Activity", "Created user Person2"); // creates person2
        System.out.println("Person2 added"); // person 2 added
        System.out.println("- URI: " + p2.getURI()); // get the URI
        System.out.println("- name: " + p2.getName() + "\n"); // get the name
        return ""; // return the name
    }
    public static void main (String args[]) // main
    {
        ClientApp C = new ClientApp(); // gets the client app as the ClientApp class
        System.out.println(C.demo()); // gets the demo
    }
}

/*
Explanation:
This code defines a class called ClientApp that implements an interface called App. 
The ClientApp class basically have the two private instance variables of types Inbox and Outbox. 
It also have the constructor that initializes these variables with objects of classes ClientInbox and ClientOutbox.
The ClientApp class provides public methods to retrieve the Inbox and Outbox objects it has created, called getInbox() 
and getOutbox().
The code also defines a method called demo() that returns a String object called demo.
The main method of the ClientApp class creates an object of the ClientApp class, retrieves the demo String object from it.
*/