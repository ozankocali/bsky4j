package bsky4j.model.bsky.actor;

import bsky4j.model.atproto.label.LabelDefsLabel;
import bsky4j.model.common.BlueskyObject;

import javax.annotation.Nullable;
import java.util.List;

/**
 * A reference to an actor in the network.
 */
public class ActorDefsProfileViewBasic extends BlueskyObject {

    private String did;
    private String handle;
    @Nullable
    private String displayName;
    @Nullable
    private String avatar;
    @Nullable
    private ActorDefsViewerState viewer;
    @Nullable
    private List<LabelDefsLabel> labels;

    // region
    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Nullable
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(@Nullable String displayName) {
        this.displayName = displayName;
    }

    @Nullable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(@Nullable String avatar) {
        this.avatar = avatar;
    }

    @Nullable
    public ActorDefsViewerState getViewer() {
        return viewer;
    }

    public void setViewer(@Nullable ActorDefsViewerState viewer) {
        this.viewer = viewer;
    }

    @Nullable
    public List<LabelDefsLabel> getLabels() {
        return labels;
    }

    public void setLabels(@Nullable List<LabelDefsLabel> labels) {
        this.labels = labels;
    }
    // endregion
}
