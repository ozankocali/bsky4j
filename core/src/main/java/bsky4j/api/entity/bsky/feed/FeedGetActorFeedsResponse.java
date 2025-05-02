package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedDefsGeneratorView;
import bsky4j.model.common.BlueskyObject;

import java.util.List;

public class FeedGetActorFeedsResponse extends BlueskyObject {

    private String cursor;
    private List<FeedDefsGeneratorView> feeds;

    // region
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public List<FeedDefsGeneratorView> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<FeedDefsGeneratorView> feeds) {
        this.feeds = feeds;
    }
    // endregion
}
