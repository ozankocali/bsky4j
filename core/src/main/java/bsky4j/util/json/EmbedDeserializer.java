package bsky4j.util.json;

import bsky4j.BlueskyTypes;
import bsky4j.model.bsky.embed.*;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class EmbedDeserializer implements JsonDeserializer<EmbedUnion> {

    @Override
    public EmbedUnion deserialize(
            JsonElement json,
            Type typeOfT,
            JsonDeserializationContext context
    ) throws JsonParseException {

        JsonObject obj = json.getAsJsonObject();
        JsonElement type = obj.get("$type");

        if (type != null) {
            if (type.getAsString().equals(BlueskyTypes.EmbedImages)) {
                return context.deserialize(obj, new TypeToken<EmbedImages>() {
                }.getType());
            }

            if (type.getAsString().equals(BlueskyTypes.EmbedExternal)) {
                return context.deserialize(obj, new TypeToken<EmbedExternal>() {
                }.getType());
            }

            if (type.getAsString().equals(BlueskyTypes.EmbedRecord)) {
                return context.deserialize(obj, new TypeToken<EmbedRecord>() {
                }.getType());
            }

            if (type.getAsString().equals(BlueskyTypes.EmbedRecordWithMedia)) {
                return context.deserialize(obj, new TypeToken<EmbedRecordWithMedia>() {
                }.getType());
            }

            if (type.getAsString().equals(BlueskyTypes.EmbedVideo)) {
                return context.deserialize(obj, new TypeToken<EmbedVideo>() {
                }.getType());
            }
        }
        return null;
    }
}
