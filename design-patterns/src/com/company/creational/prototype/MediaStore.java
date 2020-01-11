package com.company.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by omerfarukcoban on 1.12.2019.
 */
public class MediaStore {

    private static java.util.Map<MediaType , Media> prototypes = new java.util.HashMap<MediaType , Media>();

    static
    {
        prototypes.put(MediaType.MOVIE, new Movie());
        prototypes.put(MediaType.ALBUM, new Album());
    }

    public static Media getMedia(final MediaType type) throws CloneNotSupportedException {
        return prototypes.get(type).clone();
    }
}
