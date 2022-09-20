import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String PATH="/Users/thanushkumarreddykondreddy/Desktop/work python";
        Lockedimpl lm=new Lockedimpl();
        lm.searchFile("Helo.txt",PATH);
    }
}