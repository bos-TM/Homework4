package Task2;

public class DOCHandler extends AbstractHandler {

    @Override
    void open(String file) {
        System.out.println("Opened DOC-file: " + file);
    }

    @Override
    void create() {
        System.out.println("Created DOC-file");
    }

    @Override
    void change(String file) {
        System.out.println("Changed DOC-file: " + file);
    }

    @Override
    void save(String file) {
        System.out.println("Saved DOC-file: " + file);
    }
}
