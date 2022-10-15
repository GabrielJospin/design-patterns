package creational.factoryMethod;

import creational.factoryMethod.readers.ReaderException;
import creational.factoryMethod.visor.Visor;
import creational.factoryMethod.visor.VisorCsv;
import creational.factoryMethod.visor.VisorJson;

import java.io.FileNotFoundException;

public class FactoryMethod {

    public enum Type{CSV, JSON};

    public static Visor getVisorCsv(String path){
        try {
            return new VisorCsv("./inSys/creational/factoryMethod/data.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Not Found File" + path);
            System.out.println(e.getMessage());
            return null;
        } catch (ReaderException e) {
            System.out.println("File is not a CSV file");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static Visor getVisorJson(String path){
        try {
            return new VisorJson(path);
        } catch (FileNotFoundException e) {
            System.out.println("Not Found File" + path);
            System.out.println(e.getMessage());
            return null;
        } catch (ReaderException e) {
            System.out.println("File is not a CSV file");
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static Visor getVisor(String path, Type type){
        if(type.equals(Type.CSV))
            return getVisorCsv(path);
        if(type.equals(Type.JSON))
            return getVisorJson(path);
        return null;
    }

    public static void test(String path, Type type){

        Visor visor = getVisor(path, type);

        if(visor == null){
            System.out.println("VISOR NULL");
            return;
        }

        System.out.println("Last Fight Result: ");
        visor.showLastFight();

        System.out.println();
        System.out.println("second Fight result: ");
        visor.showFight(1);

        System.out.println();
        System.out.println("All Data:");
        visor.showData();
    }

    public static void main(String[] args) {
        String path = "./inSys/creational/factoryMethod/data.csv";
        System.out.println("Testing to CSV");
        test(path, Type.CSV);

        path = "./inSys/creational/factoryMethod/data.json";
        System.out.println("Testing to JSON");
        test(path, Type.JSON);





    }
}
