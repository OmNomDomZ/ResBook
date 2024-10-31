package v.rabetskii.resource;

import v.rabetskii.user.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ResourceService {
    private final Map<UUID, Resource> resources = new HashMap<>();

    public void createResource(Resource resource) {
        resources.put(resource.getID(), resource);
    }

    public Resource getResource(UUID id) {
        return resources.get(id);
    }

    public void updateResource(Resource resource){
        resources.put(resource.getID(), resource);
    }

    public void deleteResource(UUID id) {
        resources.remove(id);
    }
}
