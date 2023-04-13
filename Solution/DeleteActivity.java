public class DeleteActivity extends ClientActivity<DeleteActivity> 
{
    private Person actor;
    private CreateActivity createActivity;
    private String summary;
    DeleteActivity (String URI, String summary, Person actor, CreateActivity createActivity) 
    {
        super(URI);
        setSummary(summary);
        setActor(actor);
        setCreateActivity(createActivity);
    }
    public void setActor (Person actor) 
    {
        this.actor = actor;
    }
    public void setCreateActivity (CreateActivity createActivity) 
    {
        this.createActivity = createActivity;
    }
    public void setSummary (String summary) 
    {
        this.summary = summary;
    }
    public Person getActor () 
    {
        return this.actor;
    }
    public String getSummary () 
    {
        return this.summary;
    }
    public CreateActivity getCreateActivity () 
    {
        return this.createActivity;
    }
    public void delete (CreateActivity createActivity) 
    {
        createActivity.getStreamObject().delete();
    }
}

/*
Expalanation:
This code defines a DeleteActivity class that extends the ClientActivity class. 
The DeleteActivity class represents a deletion of a stream object by a person. 
The ClientActivity class is not provided in this code, but it is assumed to exist and to have a constructor that takes a URI as its argument.
The DeleteActivity class has four instance variables: actor, createActivity, summary, and the URI inherited from the ClientActivity class. 
The actor instance variable represents the person who performed the deletion. 
The createActivity instance variable represents the activity that created the stream object that was deleted. 
The summary instance variable represents a summary of the deletion activity.
The DeleteActivity class has a constructor that takes four arguments: a URI, a summary, a person object representing the actor, 
and an activity object representing the activity that created the stream object. 
The constructor calls the constructor of the ClientActivity class to initialize the URI instance variable, 
and then it calls the setSummary, setActor, and setCreateActivity methods to initialize the other instance variables.
The DeleteActivity class also has getters and setters for each instance variable. 
The delete method takes a CreateActivity object as its argument and calls the delete method of its stream object to delete the stream object.
*/