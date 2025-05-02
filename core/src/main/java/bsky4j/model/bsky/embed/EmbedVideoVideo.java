package bsky4j.model.bsky.embed;

import bsky4j.model.share.Blob;

public class EmbedVideoVideo {
    private Blob video;
    private String alt;

    // region
    public Blob getVideo() {
        return video;
    }

    public void setVideo(Blob video) {
        this.video = video;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
    // endregion
}
