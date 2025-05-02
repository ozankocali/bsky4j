package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.actor.ActorDefsProfileView;
import bsky4j.model.common.BlueskyObject;

import javax.annotation.Nullable;
import java.util.List;

public class FeedGetRepostedByResponse extends BlueskyObject {

    private String uri;
    @Nullable
    private String cid;
    @Nullable
    private String cursor;
    private List<ActorDefsProfileView> repostedBy;

    // region
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Nullable
    public String getCid() {
        return cid;
    }

    public void setCid(@Nullable String cid) {
        this.cid = cid;
    }

    @Nullable
    public String getCursor() {
        return cursor;
    }

    public void setCursor(@Nullable String cursor) {
        this.cursor = cursor;
    }

    public List<ActorDefsProfileView> getRepostedBy() {
        return repostedBy;
    }

    public void setRepostedBy(List<ActorDefsProfileView> repostedBy) {
        this.repostedBy = repostedBy;
    }
    // endregion
}
