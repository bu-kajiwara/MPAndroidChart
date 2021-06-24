package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

/**
 * Created by philipp on 13/06/16.
 */
@SuppressLint("ParcelCreator")
public class RadarEntry extends Entry {
    private float min;
    private float max;
    private float targetValue;

    public RadarEntry(float value) {
        super(0f, value);
    }

    public RadarEntry(float value, Object data) {
        super(0f, value, data);
    }

    /**
     * This is the same as getY(). Returns the value of the RadarEntry.
     *
     * @return
     */
    public float getValue() {
        return getY();
    }

    public RadarEntry copy() {
        RadarEntry e = new RadarEntry(getY(), getData());
        return e;
    }

    @Deprecated
    @Override
    public void setX(float x) {
        super.setX(x);
    }

    @Deprecated
    @Override
    public float getX() {
        return super.getX();
    }

    public float getMin() {
        return min;
    }

    public float getMax() {
        return max;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public float getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(float targetValue) {
        this.targetValue = targetValue;
    }
}
