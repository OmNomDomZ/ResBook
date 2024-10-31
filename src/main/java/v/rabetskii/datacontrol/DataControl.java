package v.rabetskii.datacontrol;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import v.rabetskii.user.User;

public class DataControl {
    public void UploadData(){
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\":\"Alex\", \"email\":\"alex@gmail.com\", \"role\":\"client\"}";

        try {
            User user = mapper.readValue(jsonString, User.class);
            System.out.println(user);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
