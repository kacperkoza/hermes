package pl.allegro.tech.hermes.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EntityCopy {
    private final String datacenter;
    private final String content;

    @JsonCreator
    public EntityCopy(@JsonProperty("datacenter") String datacenter,
                      @JsonProperty("content") String content) {
        this.datacenter = datacenter;
        this.content = content;
    }

    public String getDatacenter() {
        return datacenter;
    }

    public String getContent() {
        return content;
    }
}
