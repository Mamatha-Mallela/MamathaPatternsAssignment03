package mamathaQuestion23;

public class ImmutableMessageDemo {
	private final String message;

    public ImmutableMessageDemo(String message) {
        this.message = message;
    }

	public String getMessage() {
		return message;
	}
    
}
