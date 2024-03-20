import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length > 0 && args[0].equalsIgnoreCase("-no-gui")) {
            new Converter();
        } else {
            new Gui();
        }
    }
}
