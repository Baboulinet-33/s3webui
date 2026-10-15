package tech.wenisch.s3webui.model;

import lombok.Data;

import java.util.List;

@Data
public class MoveObjectsRequest {
    /** Object keys; keys ending in "/" are folders and are moved recursively. */
    private List<String> keys;
    private String targetBucket;
    private String targetPrefix;
    /** When true the sources are kept (copy); otherwise they are deleted after copying (move). */
    private boolean copy;
}
