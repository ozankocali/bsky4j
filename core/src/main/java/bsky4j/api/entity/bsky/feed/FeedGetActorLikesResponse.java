package bsky4j.api.entity.bsky.feed;

import java.util.List;

import bsky4j.model.bsky.feed.FeedDefsFeedViewPost;
import bsky4j.model.common.BlueskyObject;

public class FeedGetActorLikesResponse extends BlueskyObject {

    private String cursor;
    private List<FeedDefsFeedViewPost> feed;

    // region
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
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
