package creational.singleton;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class Writer {

    private static Writer instance;
    private final String path;
    private PrintWriter file;

    private Writer() throws IOException {
        this.path = "./outSys/creational/singleton/" + LocalDateTime.now() + ".txt";
        this.file = new PrintWriter(this.path, StandardCharsets.UTF_8);
    }

    public static Writer getInstance() throws IOException {
        if(instance == null)
            instance = new Writer();
        return instance;
    }

    public String getPath() {
        return path;
    }

    private void print(String message){
        this.file.println(message);
    }

    public void messageUser(String message, String user){
        String msg = user + "> " + message;
        print(msg);
    }

    public void messageSystem(String message){
        String msg = "AVISO> " + message;
        print(msg);
    }

    public void close(){
        this.file.close();
        instance = null;
    }
}
