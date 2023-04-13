public class ClientActivity<Act> implements Activity 
{
  private String URI; // string URI 
  ClientActivity(String URI) // client activity string URI
  {
    this.URI = URI; // URI as the client activity
  }
  public String getURI() // getURI gets the string as an object
  {
    return this.URI; // return URI
  }
}

/*
Explanation
This is a class named ClientActivity which implements the Activity interface. 
The class has one instance variable named URI which is a String type. 
The constructor ClientActivity(String URI) takes a string URI as an argument and assigns it to the URI instance variable.
The class also has a public method named getURI() which returns the string URI as an object. 
The getURI() method simply returns the value of the URI instance variable using the return keyword.
*/