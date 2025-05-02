package bsky4j.api.entity.bsky.actor;

import bsky4j.model.bsky.actor.ActorDefsProfileViewDetailed;
import bsky4j.model.common.BlueskyObject;

import java.util.List;

public class ActorGetProfilesResponse extends BlueskyObject {

    private List<ActorDefsProfileViewDetailed> profiles;

    // region
    public List<ActorDefsProfileViewDetailed> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<ActorDefsProfileViewDetailed> profiles) {
        this.profiles = profiles;
    }
    // endregion
}
