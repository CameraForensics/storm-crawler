package com.digitalpebble.stormcrawler.elasticsearch.metrics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Elasticsearch metrics consumer that writes an index per day.
 * <p/>
 * This addresses the deprecation of the TTL functionality. The per-day indices can
 * be managed using ES Curator.
 */
public class IndexPerDayMetricsConsumer extends IndexPerPeriodMetricsConsumer {

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public DateFormat getDateFormat() {
        return dateFormat;
    }
}
