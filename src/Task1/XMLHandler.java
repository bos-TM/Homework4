package Task1;

public class XMLHandler extends AbstractHandler {
    @Override
    void open(String file) {
        System.out.println("Opened XHL-file: " + file);
    }

    @Override
    void create() {
        System.out.println("Created XHL-file");
    }

    @Override
    void change(String file) {
        System.out.println("Changed XHL-file: " + file);
    }

    @Override
    void save(String file) {
        System.out.println("Saved XHL-file: " + file);
    }
}
