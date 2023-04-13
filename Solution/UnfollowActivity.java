public class UnfollowActivity extends ClientActivity<UnfollowActivity> 
{
    private Person actor;  
    private Person object;  
    private String summary; 
    UnfollowActivity(String URI, String summary, Person actor, Person object) 
    {
        super(URI); 
        setSummary(summary);
        setActor(actor);
        setObject(object);
    }
    public void setActor(Person actor) 
    {
        this.actor = actor;
    }
    public void setObject(Person object) 
    {
        this.object = object;
    }
    public void setSummary(String summary) 
    {
        this.summary = summary;
    }
    public Person getActor() 
    {
        return this.actor;
    }
    public Person getObject() 
    {
        return this.object;
    }
    public String getSummary() 
    {
        return this.summary;
    }
    public void unfollow(Person actor, Person object) 
    {
        if (actor.getFollowers().contains(object)) 
        {
            actor.getFollowers().remove(object);
        }
        if (object.getFollowing().contains(actor)) 
        {
            object.getFollowing().remove(actor);
        }
    }
}

/* 
Explanation:
This basically defining the UnfollowActivity class that can be extended as the ClientActivity. 
This class has four private fields: actor, object, summary, and URI, and a constructor to set these fields. 
The class also has several getter and setter methods to access these fields.
The main method in this class is the unfollow() method, which takes two Person objects as parameters: actor and object. 
This method checks if the actor is following the object and removes the object from the actor's list of followers and 
the actor from the object's list of followings if the actor is following the object.
*/