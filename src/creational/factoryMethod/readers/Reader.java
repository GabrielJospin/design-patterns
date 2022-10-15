package creational.factoryMethod.readers;

import creational.factoryMethod.PartyData;

import java.util.List;

public interface Reader {

    String getPath();
    String getLine(int line);
    PartyData getPartyDataAt (int line);
    List<PartyData> getPartyData();
}
