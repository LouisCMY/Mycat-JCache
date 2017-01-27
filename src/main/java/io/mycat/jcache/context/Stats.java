package io.mycat.jcache.context;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Global stats. Only resettable stats should go into this structure.
 */
public class Stats {
    public static AtomicLong total_items = new AtomicLong(0);
    public static AtomicLong total_conns = new AtomicLong(0);
    public static AtomicLong rejected_conns = new AtomicLong(0);
    public static AtomicLong malloc_fails = new AtomicLong(0);
    public static AtomicLong listen_disabled_num = new AtomicLong(0);
    public static AtomicLong slabs_moved = new AtomicLong(0);       /* times slabs were moved around */
    public static AtomicLong slab_reassign_rescues = new AtomicLong(0); /* items rescued during slab move */
    public static AtomicLong slab_reassign_evictions_nomem = new AtomicLong(0); /* valid items lost during slab move */
    public static AtomicLong slab_reassign_inline_reclaim = new AtomicLong(0); /* valid items lost during slab move */
    public static AtomicLong slab_reassign_chunk_rescues = new AtomicLong(0); /* chunked-item chunks recovered */
    public static AtomicLong slab_reassign_busy_items = new AtomicLong(0); /* valid temporarily unmovable */
    public static AtomicLong lru_crawler_starts = new AtomicLong(0); /* Number of item crawlers kicked off */
    public static AtomicLong lru_maintainer_juggles = new AtomicLong(0); /* number of LRU bg pokes */
    public static AtomicLong time_in_listen_disabled_us = new AtomicLong(0);  /* elapsed time in microseconds while server unable to process new connections */
    public static AtomicLong log_worker_dropped = new AtomicLong(0); /* logs dropped by worker threads */
    public static AtomicLong log_worker_written = new AtomicLong(0); /* logs written by worker threads */
    public static AtomicLong log_watcher_skipped = new AtomicLong(0); /* logs watchers missed */
    public static AtomicLong log_watcher_sent = new AtomicLong(0); /* logs sent to watcher buffers */
    public static AtomicLong maxconns_entered = new AtomicLong(0);  /* last time maxconns entered */

}
