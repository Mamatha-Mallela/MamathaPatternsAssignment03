package mamathaQuestion22;

public final class StringImmutableDemo {
	private final String a;
    private final int b;

    public StringImmutableDemo(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public StringImmutableDemo A(String a) {
        return new StringImmutableDemo(a, this.b);
    }

    public StringImmutableDemo B(int b) {
        return new StringImmutableDemo(this.a, b);
    }
}
