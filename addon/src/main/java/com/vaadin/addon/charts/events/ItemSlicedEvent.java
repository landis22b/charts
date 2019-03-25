package com.vaadin.addon.charts.events;

/*-
 * #%L
 * Vaadin Charts Addon
 * %%
 * Copyright (C) 2012 - 2019 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

import com.vaadin.addon.charts.model.Series;

/**
 * Event for information about slicing a pie point
 * 
 * @since 2.0
 */
public class ItemSlicedEvent extends AbstractSeriesEvent {

    private final int index;
    private final boolean sliced;
    private final boolean redraw;
    private final boolean animation;

    /**
     * Constructs the event.
     * 
     * @param index
     * @param sliced
     * @param redraw
     * @param animation
     */
    public ItemSlicedEvent(Series series, int index, boolean sliced,
            boolean redraw, boolean animation) {
        super(series);
        this.index = index;
        this.sliced = sliced;
        this.redraw = redraw;
        this.animation = animation;
    }

    /**
     * Constructs the event with animated transition
     * 
     * @param index
     * @param sliced
     * @param redraw
     */
    public ItemSlicedEvent(Series series, int index, boolean sliced,
            boolean redraw) {
        this(series, index, sliced, redraw, true);
    }

    /**
     * Constructs the event with animated transition, redraws the chart
     * 
     * @param index
     * @param sliced
     */
    public ItemSlicedEvent(Series series, int index, boolean sliced) {
        this(series, index, sliced, true, true);
    }

    /**
     * Returns the index of the point to be sliced
     * 
     * @return
     */
    public int getIndex() {
        return index;
    }

    /**
     * When true, the point is sliced out. When false, the point is set in. When
     * null or undefined, the sliced state is toggled.
     * 
     * @return
     */
    public boolean isSliced() {
        return sliced;
    }

    /**
     * Whether or not redrawing should be immediate.
     * 
     * @return <b>true</b> when redrawing needs to be immediate, <b>false</b>
     *         otherwise.
     */
    public boolean isRedraw() {
        return redraw;
    }

    /**
     * Whether or not animation should be used.
     * 
     * @return <b>true</b> when slicing should be animated, <b>false</b>
     *         otherwise.
     */
    public boolean isAnimation() {
        return animation;
    }

}
