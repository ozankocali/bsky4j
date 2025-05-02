package bsky4j.api.entity.atproto.repo;

import bsky4j.model.common.BlueskyObject;

public class RepoCreateRecordResponse extends BlueskyObject {

    private String uri;
    private String cid;

    // region
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
    // endregion
}
