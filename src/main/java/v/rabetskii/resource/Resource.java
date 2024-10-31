package v.rabetskii.resource;

import java.util.UUID;

public class Resource {
    private final UUID uuid;
    private String name;

    public Resource(String name) {
        this.uuid = UUID.randomUUID();
        this.name = name;
    }

    public UUID getID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
