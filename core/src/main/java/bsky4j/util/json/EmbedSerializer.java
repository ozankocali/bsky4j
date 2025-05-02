package bsky4j.util.json;

import bsky4j.model.bsky.embed.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class EmbedSerializer implements JsonSerializer<EmbedUnion> {

    @Override
    public JsonElement serialize(
            EmbedUnion src,
            Type typeOfSrc,
            JsonSerializationContext context
    ) {
        if (src instanceof EmbedImages) {
            return context.serialize(src, EmbedImages.class);
        }
        if (src instanceof EmbedExternal) {
            return context.serialize(src, EmbedExternal.class);
        }
        if (src instanceof EmbedRecord) {
            return context.serialize(src, EmbedRecord.class);
        }
        if (src instanceof EmbedRecordWithMedia) {
            return context.serialize(src, EmbedRecordWithMedia.class);
        }
        if (src instanceof EmbedVideo) {
            return context.serialize(src, EmbedVideo.class);
        }
        return null;
    }
}
