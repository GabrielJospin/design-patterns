package creational.factoryMethod.visor;

import creational.factoryMethod.readers.Reader;
import creational.factoryMethod.readers.ReaderCsv;
import creational.factoryMethod.readers.ReaderException;

import java.io.FileNotFoundException;

public class VisorCsv extends Visor {

    private Reader reader;

    public VisorCsv(String path) throws FileNotFoundException, ReaderException {
        super(path);
        setReader(new ReaderCsv(path));
    }

}
