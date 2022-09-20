import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String PATH="/Users/thanushkumarreddykondreddy/Desktop/work python";
        Lockedimpl lm=new Lockedimpl();
        lm.filesInAscendingOrder(PATH);
//        lm.addFile("hello1.txt",PATH);
        lm.deleteFile("hello1.txt",PATH);
        lm.filesInAscendingOrder(PATH);
    }
}