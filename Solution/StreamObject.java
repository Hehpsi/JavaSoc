import java.util.ArrayList;
import java.util.List;
public class StreamObject 
{
    private String URI;
    private String attachment;
    private String attributedTo;
    private Audience audience;
    private List<Person> likes;
    private int shares;
    private String content;
    private String name;
    private String published;
    private boolean deleted;
    public StreamObject(String URI, String attachment, String attributedTo, Audience audience, String content, String name, String published) 
    {
        setURI(URI);
        setAttachment(attachment);
        setAttributedTo(attributedTo);
        setAudience(audience);
        this.likes = new ArrayList<>();
        this.shares = 0;
        setContent(content);
        setName(name);
        setPublished(published);
        this.deleted = false;
    }
    public void setURI(String URI) 
    {
        this.URI = URI;
    }
    public void setAttachment(String attachment) 
    {
        this.attachment = attachment;
    }
    public void setAttributedTo(String attributedTo) 
    {
        this.attributedTo = attributedTo;
    }
    public void setAudience(Audience audience) 
    {
        this.audience = audience;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setPublished(String published) 
    {
        this.published = published;
    }
    public String getURI() 
    {
        return this.URI;
    }
    public String getAttachment() 
    {
        return this.attachment;
    }
    public String getAttributedTo() 
    {
        return this.attributedTo;
    }
    public Audience getAudience() 
    {
        return this.audience;
    }
    public List<Person> getLikes() 
    {
        return this.likes;
    }
    public int getShares() 
    {
        return this.shares;
    }
    public String getContent() 
    {
        return this.content;
    }
    public String getName() 
    {
        return this.name;
    }
    public String getPublished() 
    {
        return this.published;
    }
    public boolean getDeleted() 
    {
        return this.deleted;
    }
    public void delete() 
    {
        this.deleted = true;
    }
    public String toString () 
    {
        return "- URI: " + this.getURI() + "\n- audience: " + this.getAudience() + "\n- likes: " + this.getLikes() + "\n- shares: " + this.getShares() + "\n- content: " + this.getContent() + "\n- name: " + this.getName() + "\n- published: " + this.getPublished() + "\n- deleted: " + this.getDeleted();
    }
}

/* 
Explanation:
The class called StreamObject that can basically represents a generic social media post or object. 
It has several private fields including URI, attachment, attributedTo, audience, likes, shares, content, name, published, and deleted.
The constructor initializes all the fields except for likes, which is initialized as an empty ArrayList, and shares, which is initialized as 0.
The class also has several getter and setter methods for accessing and modifying the private fields, as well as a delete() method to mark the object as deleted. 
Finally, there is a toString() method that returns a string representation of the object.
*/