package bsky4j.model.bsky.embed;

import bsky4j.BlueskyTypes;
import com.google.gson.annotations.SerializedName;

public class EmbedVideo implements EmbedUnion {
    @SerializedName("$type")
    private String type;
    private EmbedVideoVideo video;

    public EmbedVideo() {
        this.type = BlueskyTypes.EmbedVideo;
    }


    public EmbedVideoVideo getVideo() {
        return video;
    }

    public void setVideo(EmbedVideoVideo video) {
        this.video = video;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
