import java.util.ArrayList;
import java.util.List;
public class Person 
{
    private String URI; 
    private String name; 
    private String preferredUsername; 
    private String summary; 
    private Inbox inbox; 
    private Outbox outbox; 
    private List<Person> followers; 
    private List<Person> following; 
    private List<StreamObject> liked; 
    public Person(String URI, String name, String preferredUsername, String summary) 
    {
        setURI(URI);
        setName(name);
        setPreferredUsername(preferredUsername);
        setSummary(summary);
        inbox = new ClientInbox();
        outbox = new ClientOutbox();
        followers = new ArrayList<>();
        following = new ArrayList<>();
        liked = new ArrayList<>();
    }
    public void setURI(String URI) 
    {
        this.URI = URI;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setPreferredUsername(String preferredUsername) 
    {
        this.preferredUsername = preferredUsername;
    }
    public void setSummary(String summary) 
    {
        this.summary = summary;
    }
    public String getURI() 
    {
        return this.URI;
    }
    public String getName() 
    {
        return this.name;
    }
    public String getPreferredUsername() 
    {
        return this.preferredUsername;
    }
    public String getSummary() 
    {
        return this.summary;
    }
    public Inbox getInbox() 
    {
        return this.inbox;
    }
    public Outbox getOutbox () 
    {
        return this.outbox;
    }
    public List<Person> getFollowers () 
    {
        return this.followers;
    }
    public List<Person> getFollowing () 
    {
        return this.following;
    }
    public List<StreamObject> getLiked () 
    {
        return this.liked;
    }
}

/*
Explanation:
This is a class called Person that defines a data structure for a person in a social media platform. 
The class has several private fields, including URI, name, preferredUsername, summary, inbox, outbox, followers, following, and liked.
The class has a constructor that takes four parameters - URI, name, preferredUsername, and summary - and initializes its fields. 
The constructor also creates new instances of ClientInbox, ClientOutbox, ArrayList of Person for followers and following, and ArrayList of StreamObject for liked.
The class also has several getter and setter methods for accessing and modifying the private fields. 
*/