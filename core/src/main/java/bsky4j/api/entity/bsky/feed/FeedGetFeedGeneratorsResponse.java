package bsky4j.api.entity.bsky.feed;

import bsky4j.model.bsky.feed.FeedDefsGeneratorView;
import bsky4j.model.common.BlueskyObject;

import java.util.List;

public class FeedGetFeedGeneratorsResponse extends BlueskyObject {

    private List<FeedDefsGeneratorView> feeds;

    // region
    public List<FeedDefsGeneratorView> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<FeedDefsGeneratorView> feeds) {
        this.feeds = feeds;
    }
    // endregion
}
