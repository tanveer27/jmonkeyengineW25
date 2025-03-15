package com.jme3.util;

import com.jme3.bounding.BoundingVolume;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;

public class DistanceUtils {
    public static float computeLastDistance(Spatial owner, Vector3f position) {
        if (owner.getWorldBound() != null) {
            BoundingVolume bv = owner.getWorldBound();
            return bv.distanceSquaredTo(position);
        } else {
            return owner.getWorldTranslation().distanceSquared(position);
        }
    }
}
