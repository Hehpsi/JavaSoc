public interface Activity // activity is an event 
{
  String getURI(); // getURI as a string
}

/*
Explanation:
This is the interface called Activity that can basically declares method called getURI() which returns a String.
In this case, any class that can implements the Activity interface must provide an implementation for the getURI() method, 
which should return a String that represents the URI of the activity.
*/