package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedDefsFeedViewPost;
import bsky4j.model.common.BlueskyObject;

import javax.annotation.Nullable;
import java.util.List;

public class FeedGetTimelineResponse extends BlueskyObject {

    @Nullable
    private String cursor;
    private List<FeedDefsFeedViewPost> feed;

    // region
    @Nullable
    public String getCursor() {
        return cursor;
    }

    public void setCursor(@Nullable String cursor) {
        this.cursor = cursor;
    }

    public List<FeedDefsFeedViewPost> getFeed() {
        return feed;
    }

    public void setFeed(List<FeedDefsFeedViewPost> feed) {
        this.feed = feed;
    }
    // endregion
}
