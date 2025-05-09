package bsky4j.model.bsky.feed;

import bsky4j.model.common.BlueskyObject;

import javax.annotation.Nullable;

public class FeedDefsFeedViewPost extends BlueskyObject {

    private FeedDefsPostView post;
    @Nullable
    private FeedDefsReplyRef reply;
    @Nullable
    private FeedDefsReasonRepost reason;

    // region
    public FeedDefsPostView getPost() {
        return post;
    }

    public void setPost(FeedDefsPostView post) {
        this.post = post;
    }

    @Nullable
    public FeedDefsReplyRef getReply() {
        return reply;
    }

    public void setReply(@Nullable FeedDefsReplyRef reply) {
        this.reply = reply;
    }

    @Nullable
    public FeedDefsReasonRepost getReason() {
        return reason;
    }

    public void setReason(@Nullable FeedDefsReasonRepost reason) {
        this.reason = reason;
    }
    // endregion
}
