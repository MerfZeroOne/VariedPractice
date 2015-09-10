//************************************************************************************************
//Programmer: Christopher Murphy
//Program/Class: Various/ EmptyCollectionException.java
//Details: This is an exception class tailored for a runtime exception relating to collection capacity
//
//************************************************************************************************

public class EmptyCollectionException extends RuntimeException {

	public EmptyCollectionException(String collection) {
		super ("The " + collection + " is empty.");
	}

}
