package creational.factoryMethod.visor;

import creational.factoryMethod.readers.ReaderException;
import creational.factoryMethod.readers.ReaderJson;

import java.io.FileNotFoundException;

public class ViewerJson extends Viewer {
    public ViewerJson(String path) throws FileNotFoundException, ReaderException {
        super(path);
        setReader(new ReaderJson(path));
    }
}
