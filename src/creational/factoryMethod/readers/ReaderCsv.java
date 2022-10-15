package creational.factoryMethod.readers;

import creational.factoryMethod.PartyData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderCsv implements Reader{

    private final String path;
    private final Scanner reader;
    private final List<String> file = new ArrayList<>();

    public ReaderCsv(String path) throws FileNotFoundException, ReaderException {
        this.path = path;
        if(! path.endsWith(".csv"))
            throw new ReaderException("File is not a csv file");
        this.reader = new Scanner(new File(this.path));

        reader.nextLine();
        while(reader.hasNext()){
            file.add(reader.nextLine());
        }
    }

    @Override
    public String getPath() {
        return this.path;
    }

    @Override
    public String getLine(int line){
        return file.get(line);
    }

    @Override
    public PartyData getPartyDataAt(int line) {
        String data = file.get(line);
        String[] subData = data.split(";");
        return new PartyData(Integer.parseInt(subData[0]), Long.parseLong(subData[1]), subData[2],
                subData[3], subData[4], Integer.parseInt(subData[5]), Integer.parseInt( subData[6]));
    }

    @Override
    public List<PartyData> getPartyData() {
        List<PartyData> partyDataList = new ArrayList<>();
        this.file.forEach(line -> {
            String[] subData = line.split(";");
            partyDataList.add(new PartyData(Integer.parseInt(subData[0]), Long.parseLong(subData[1]), subData[2],
                    subData[3], subData[4], Integer.parseInt(subData[5]), Integer.parseInt( subData[6])));
        });
        return partyDataList;
    }
}
