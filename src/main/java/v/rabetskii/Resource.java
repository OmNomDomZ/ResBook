package v.rabetskii;

import java.util.UUID;

public class Resource {
    private final UUID uuid;
    private String name;

    public Resource(String name) {
        this.uuid = UUID.randomUUID();
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
