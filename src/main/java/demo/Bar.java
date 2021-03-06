package demo;

import javax.inject.Inject;

public class Bar {
    private final Foo foo;

    @Inject
    public Bar(Foo foo) {
        this.foo = foo;
    }

    public String get() {
        return foo.get() + " via bar";
    }
}
