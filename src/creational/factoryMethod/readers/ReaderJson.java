package creational.factoryMethod.readers;

import com.google.gson.Gson;
import creational.factoryMethod.PartyData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.*;

public class ReaderJson  implements Reader{

    private final String path;
    private final List<String> file = new ArrayList<>();
    private JSONObject jsonObject;

    public ReaderJson(String path) throws ReaderException, FileNotFoundException {
        this.path = path;
        if(! path.endsWith(".json"))
            throw new ReaderException("File is not a json");
        Scanner scanner = new Scanner(new File(path));

        String jsonText = "";
        while(scanner.hasNext()){
             String line = scanner.nextLine();
             jsonText = jsonText.concat("\n" + line);
             file.add(line);
        }

        this.jsonObject = new JSONObject(jsonText);
    }

    @Override
    public String getPath() {
        return this.path;
    }

    @Override
    public String getLine(int line) {
        return file.get(line);
    }

    @Override
    public PartyData getPartyDataAt(int line) {
        return (PartyData) jsonObject.getJSONArray("Data").get(line);
    }

    @Override
    public List<PartyData> getPartyData() {
        Gson gson = new Gson();
        List<PartyData> partyDataList = new ArrayList<>();
        jsonObject.getJSONArray("data").iterator().forEachRemaining(l -> partyDataList.add(
                gson.fromJson(l.toString(), PartyData.class)
        ));

        return partyDataList;
    }
}
