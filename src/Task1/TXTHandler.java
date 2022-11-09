package Task1;

public class TXTHandler extends AbstractHandler{
    @Override
    void open(String file) {
        System.out.println("Opened TXT-file: " + file);
    }

    @Override
    void create() {
        System.out.println("Created TXT-file");
    }

    @Override
    void change(String file) {
        System.out.println("Changed TXT-file: " + file);
    }

    @Override
    void save(String file) {
        System.out.println("Saved TXT-file: " + file);
    }
}
