package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedDefsThreadUnion;
import bsky4j.model.common.BlueskyObject;

public class FeedGetPostThreadResponse extends BlueskyObject {

    private FeedDefsThreadUnion thread;

    // region
    public FeedDefsThreadUnion getThread() {
        return thread;
    }

    public void setThread(FeedDefsThreadUnion thread) {
        this.thread = thread;
    }
    // endregion
}
