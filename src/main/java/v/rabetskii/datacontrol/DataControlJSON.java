package v.rabetskii.datacontrol;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public class DataControlJSON<T> {
    private final String filename;
    ObjectMapper mapper = new ObjectMapper();

    public DataControlJSON(String filename) {
        this.filename = filename;
    }

    public void loadData(Map<UUID, T> objectMap) {
        try (FileReader fileReader = new FileReader(filename)) {
            Map<UUID, T> dataFromFile = mapper.readValue(fileReader, new TypeReference<>() {});
            objectMap.putAll(dataFromFile);
            System.out.println("Load data from " + filename);
        } catch (IOException e) {
            throw new RuntimeException("Error Loading data", e);
        }
    }

    public void saveData(Map<UUID, T> objectMap) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            mapper.writerWithDefaultPrettyPrinter().writeValue(fileWriter, objectMap);
            System.out.println("Saved data to " + filename);
        } catch (IOException e) {
            throw new RuntimeException("Error saving data", e);
        }
    }
}
