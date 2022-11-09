package Task1;

public abstract class AbstractHandler {
    abstract void open(String file);

    abstract void create();
    abstract void change(String file);
    abstract void save(String file);
}
