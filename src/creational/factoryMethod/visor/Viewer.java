package creational.factoryMethod.visor;

import creational.factoryMethod.PartyData;
import creational.factoryMethod.readers.Reader;
import java.util.List;

public abstract class Viewer {

    private String path;
    private Reader reader;

    Viewer(String path){
        this.path = path;
    }

    String getPath(){
        return this.path;
    }
    public Reader getReader(){
        return this.reader;
    }

    protected void setReader(Reader reader){
        this.reader = reader;
    }
    public void showData(){
       List<PartyData> data = reader.getPartyData();
       data.forEach(System.out::println);
    }
    public void showFight(int id){
        List<PartyData> data = reader.getPartyData();
        PartyData party = data.get(id);
        System.out.println(party);
    }
    public void showLastFight(){
        List<PartyData> data = reader.getPartyData();
        PartyData lastParty = data.get(data.size() -1 );
        System.out.println(lastParty);
    }

}
