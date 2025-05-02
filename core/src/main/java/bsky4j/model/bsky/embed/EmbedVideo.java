package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;
import bsky4j.model.share.Blob;
import com.google.gson.annotations.SerializedName;

public class EmbedVideo implements EmbedUnion {
    @SerializedName("$type")
    private String type;
    private Blob video;

    public EmbedVideo() {
        this.type = BlueskyTypes.EmbedVideo;
    }


    public Blob getVideo() {
        return video;
    }

    public void setVideo(Blob video) {
        this.video = video;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
