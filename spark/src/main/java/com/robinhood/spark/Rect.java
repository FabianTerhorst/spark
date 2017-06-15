package com.robinhood.spark;

/**
 * Created by fabianterhorst on 15.06.17.
 */

public class Rect {

    long left, right;

    double top, bottom;

    public Rect(long left, double top, long right, double bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public final long width() {
        return right - left;
    }

    public final double height() {
        return bottom - top;
    }

    public void inset(float dx, float dy) {
        left += dx;
        top += dy;
        right -= dx;
        bottom -= dy;
    }
}
