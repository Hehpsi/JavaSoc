interface App // APP is the event
{
    Inbox getInbox(); // getInbox for interface
    Outbox getOutbox(); // getOutbox for interface
    String demo(); // demo as a string
}

/*
Explanation:
This is a bascially an interface named App that can have 3 methods:
getInbox(): This method returns an object of type Inbox.
getOutbox(): This method returns an object of type Outbox. 
demo(): This method returns a string. The purpose of this method is not clear from the interface definition alone, 
but it may be a method that is used for demonstration purposes, such as to showcase the app's features or capabilities. 
*/