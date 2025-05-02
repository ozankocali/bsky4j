package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;

public class EmbedVideoView implements EmbedViewUnion {
    public static final String TYPE = BlueskyTypes.EmbedVideo + "#view";

    @Override
    public String getType() {
        return TYPE;
    }

    private String cid;
    private String playlist;
    private String thumbnail;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}



