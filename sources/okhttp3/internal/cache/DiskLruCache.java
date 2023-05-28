package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p392j0.C12113j;
import okhttp3.internal.Util;
import okhttp3.internal.p397io.FileSystem;
import okhttp3.internal.platform.Platform;
import p015cm.aptoide.p016pt.database.room.RoomNotification;
import p413s.C12892a0;
import p413s.C12909g;
import p413s.C12919p;
import p413s.C12932y;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010)\n\u0002\b\u0007\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0004VWXYB7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0016J!\u00107\u001a\u0002052\n\u00108\u001a\u000609R\u00020\u00002\u0006\u0010:\u001a\u00020\u0012H\u0000¢\u0006\u0002\b;J\u0006\u0010<\u001a\u000205J \u0010=\u001a\b\u0018\u000109R\u00020\u00002\u0006\u0010>\u001a\u00020$2\b\b\u0002\u0010?\u001a\u00020\u000bH\u0007J\u0006\u0010@\u001a\u000205J\b\u0010A\u001a\u000205H\u0016J\u0017\u0010B\u001a\b\u0018\u00010CR\u00020\u00002\u0006\u0010>\u001a\u00020$H\u0002J\u0006\u0010D\u001a\u000205J\u0006\u0010E\u001a\u00020\u0012J\b\u0010F\u001a\u00020\u0012H\u0002J\b\u0010G\u001a\u00020!H\u0002J\b\u0010H\u001a\u000205H\u0002J\b\u0010I\u001a\u000205H\u0002J\u0010\u0010J\u001a\u0002052\u0006\u0010K\u001a\u00020$H\u0002J\r\u0010L\u001a\u000205H\u0000¢\u0006\u0002\bMJ\u000e\u0010N\u001a\u00020\u00122\u0006\u0010>\u001a\u00020$J\u0019\u0010O\u001a\u00020\u00122\n\u0010P\u001a\u00060%R\u00020\u0000H\u0000¢\u0006\u0002\bQJ\u0006\u00101\u001a\u00020\u000bJ\u0010\u0010R\u001a\f\u0012\b\u0012\u00060CR\u00020\u00000SJ\u0006\u0010T\u001a\u000205J\u0010\u0010U\u001a\u0002052\u0006\u0010>\u001a\u00020$H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\b\u0012\u00060%R\u00020\u00000#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R&\u0010\n\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b8F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006Z"}, mo16641d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "directory", "Ljava/io/File;", "appVersion", "", "valueCount", "maxSize", "", "executor", "Ljava/util/concurrent/Executor;", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLjava/util/concurrent/Executor;)V", "cleanupRunnable", "Ljava/lang/Runnable;", "closed", "", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getDirectory", "()Ljava/io/File;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "hasJournalErrors", "initialized", "journalFile", "journalFileBackup", "journalFileTmp", "journalWriter", "Lokio/BufferedSink;", "lruEntries", "Ljava/util/LinkedHashMap;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "value", "getMaxSize", "()J", "setMaxSize", "(J)V", "mostRecentRebuildFailed", "mostRecentTrimFailed", "nextSequenceNumber", "redundantOpCount", "size", "getValueCount$okhttp", "()I", "checkNotClosed", "", "close", "completeEdit", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "success", "completeEdit$okhttp", "delete", "edit", "key", "expectedSequenceNumber", "evictAll", "flush", "get", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "initialize", "isClosed", "journalRebuildRequired", "newJournalWriter", "processJournal", "readJournal", "readJournalLine", "line", "rebuildJournal", "rebuildJournal$okhttp", "remove", "removeEntry", "entry", "removeEntry$okhttp", "snapshots", "", "trimToSize", "validateKey", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: DiskLruCache.kt */
public final class DiskLruCache implements Closeable, Flushable {
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final String CLEAN = CLEAN;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DIRTY = DIRTY;
    public static final String JOURNAL_FILE = JOURNAL_FILE;
    public static final String JOURNAL_FILE_BACKUP = JOURNAL_FILE_BACKUP;
    public static final String JOURNAL_FILE_TEMP = JOURNAL_FILE_TEMP;
    public static final C12113j LEGAL_KEY_PATTERN = new C12113j("[a-z0-9_-]{1,120}");
    public static final String MAGIC = MAGIC;
    public static final String READ = READ;
    public static final String REMOVE = REMOVE;
    public static final String VERSION_1 = VERSION_1;
    private final int appVersion;
    private final Runnable cleanupRunnable = new DiskLruCache$cleanupRunnable$1(this);
    private boolean closed;
    private final File directory;
    private final Executor executor;
    private final FileSystem fileSystem;
    /* access modifiers changed from: private */
    public boolean hasJournalErrors;
    /* access modifiers changed from: private */
    public boolean initialized;
    private final File journalFile = new File(this.directory, JOURNAL_FILE);
    private final File journalFileBackup = new File(this.directory, JOURNAL_FILE_BACKUP);
    private final File journalFileTmp = new File(this.directory, JOURNAL_FILE_TEMP);
    /* access modifiers changed from: private */
    public C12909g journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    /* access modifiers changed from: private */
    public boolean mostRecentRebuildFailed;
    /* access modifiers changed from: private */
    public boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    /* access modifiers changed from: private */
    public int redundantOpCount;
    private long size;
    private final int valueCount;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00068\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo16641d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "()V", "ANY_SEQUENCE_NUMBER", "", "CLEAN", "", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", "READ", "REMOVE", "VERSION_1", "create", "Lokhttp3/internal/cache/DiskLruCache;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "directory", "Ljava/io/File;", "appVersion", "", "valueCount", "maxSize", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: DiskLruCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public final DiskLruCache create(FileSystem fileSystem, File file, int i, int i2, long j) {
            FileSystem fileSystem2 = fileSystem;
            C10202j.m34178b(fileSystem, "fileSystem");
            File file2 = file;
            C10202j.m34178b(file, "directory");
            boolean z = false;
            if (j > 0) {
                if (i2 > 0) {
                    z = true;
                }
                if (z) {
                    return new DiskLruCache(fileSystem, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory("OkHttp DiskLruCache", true)));
                }
                throw new IllegalArgumentException("valueCount <= 0".toString());
            }
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\r\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, mo16641d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "done", "", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "written", "", "getWritten$okhttp", "()[Z", "abort", "", "commit", "detach", "detach$okhttp", "newSink", "Lokio/Sink;", "index", "", "newSource", "Lokio/Source;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: DiskLruCache.kt */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry2) {
            C10202j.m34178b(entry2, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry2;
            this.written = entry2.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        public final void abort() throws IOException {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (C10202j.m34176a((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                        this.this$0.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    C10483v vVar = C10483v.f28357a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void commit() throws IOException {
            synchronized (this.this$0) {
                if (!this.done) {
                    if (C10202j.m34176a((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                        this.this$0.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    C10483v vVar = C10483v.f28357a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void detach$okhttp() {
            if (C10202j.m34176a((Object) this.entry.getCurrentEditor$okhttp(), (Object) this)) {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i = 0; i < valueCount$okhttp; i++) {
                    try {
                        this.this$0.getFileSystem$okhttp().delete(this.entry.getDirtyFiles$okhttp().get(i));
                    } catch (IOException unused) {
                    }
                }
                this.entry.setCurrentEditor$okhttp((Editor) null);
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r5 = p413s.C12919p.m41676a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
            return r5;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0052 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p413s.C12932y newSink(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x0064 }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x0058
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x0064 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0064 }
                boolean r1 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x0064 }
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x001c
                s.y r5 = p413s.C12919p.m41676a()     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r5
            L_0x001c:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x0064 }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x0064 }
                if (r1 != 0) goto L_0x0030
                boolean[] r1 = r4.written     // Catch:{ all -> 0x0064 }
                if (r1 == 0) goto L_0x002b
                r1[r5] = r2     // Catch:{ all -> 0x0064 }
                goto L_0x0030
            L_0x002b:
                kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x0064 }
                r5 = 0
                throw r5
            L_0x0030:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x0064 }
                java.util.List r1 = r1.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0064 }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0064 }
                java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0064 }
                okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch:{ FileNotFoundException -> 0x0052 }
                okhttp3.internal.io.FileSystem r2 = r2.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x0052 }
                s.y r1 = r2.sink(r1)     // Catch:{ FileNotFoundException -> 0x0052 }
                okhttp3.internal.cache.FaultHidingSink r2 = new okhttp3.internal.cache.FaultHidingSink     // Catch:{ all -> 0x0064 }
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 r3 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1     // Catch:{ all -> 0x0064 }
                r3.<init>(r4, r5)     // Catch:{ all -> 0x0064 }
                r2.<init>(r1, r3)     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r2
            L_0x0052:
                s.y r5 = p413s.C12919p.m41676a()     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r5
            L_0x0058:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0064 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0064 }
                r1.<init>(r5)     // Catch:{ all -> 0x0064 }
                throw r1     // Catch:{ all -> 0x0064 }
            L_0x0064:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSink(int):s.y");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p413s.C12892a0 newSource(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x0047 }
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x003b
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x0047 }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x0047 }
                r2 = 0
                if (r1 == 0) goto L_0x0039
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.entry     // Catch:{ all -> 0x0047 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0047 }
                boolean r1 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x0047 }
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0021
                goto L_0x0039
            L_0x0021:
                okhttp3.internal.cache.DiskLruCache r1 = r4.this$0     // Catch:{ FileNotFoundException -> 0x0037 }
                okhttp3.internal.io.FileSystem r1 = r1.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x0037 }
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.entry     // Catch:{ FileNotFoundException -> 0x0037 }
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch:{ FileNotFoundException -> 0x0037 }
                java.lang.Object r5 = r3.get(r5)     // Catch:{ FileNotFoundException -> 0x0037 }
                java.io.File r5 = (java.io.File) r5     // Catch:{ FileNotFoundException -> 0x0037 }
                s.a0 r2 = r1.source(r5)     // Catch:{ FileNotFoundException -> 0x0037 }
            L_0x0037:
                monitor-exit(r0)
                return r2
            L_0x0039:
                monitor-exit(r0)
                return r2
            L_0x003b:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0047 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0047 }
                r1.<init>(r5)     // Catch:{ all -> 0x0047 }
                throw r1     // Catch:{ all -> 0x0047 }
            L_0x0047:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSource(int):s.a0");
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030(H\u0002J\u001b\u0010)\u001a\u00020*2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030(H\u0000¢\u0006\u0002\b+J\u0013\u0010,\u001a\b\u0018\u00010-R\u00020\fH\u0000¢\u0006\u0002\b.J\u0015\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b2R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0018\u00010\u000bR\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00063"}, mo16641d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "key", "", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "cleanFiles", "", "Ljava/io/File;", "getCleanFiles$okhttp", "()Ljava/util/List;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "dirtyFiles", "getDirtyFiles$okhttp", "getKey$okhttp", "()Ljava/lang/String;", "lengths", "", "getLengths$okhttp", "()[J", "readable", "", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "sequenceNumber", "", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "invalidLengths", "Ljava/io/IOException;", "strings", "", "setLengths", "", "setLengths$okhttp", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot$okhttp", "writeLengths", "writer", "Lokio/BufferedSink;", "writeLengths$okhttp", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: DiskLruCache.kt */
    public final class Entry {
        private final List<File> cleanFiles = new ArrayList();
        private Editor currentEditor;
        private final List<File> dirtyFiles = new ArrayList();
        private final String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;

        public Entry(DiskLruCache diskLruCache, String str) {
            C10202j.m34178b(str, RoomNotification.KEY);
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            StringBuilder sb = new StringBuilder(this.key);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(diskLruCache.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final IOException invalidLengths(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) throws IOException {
            C10202j.m34178b(list, "strings");
            if (list.size() == this.this$0.getValueCount$okhttp()) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.lengths[i] = Long.parseLong(list.get(i));
                    }
                } catch (NumberFormatException unused) {
                    throw invalidLengths(list);
                }
            } else {
                throw invalidLengths(list);
            }
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final Snapshot snapshot$okhttp() {
            boolean holdsLock = Thread.holdsLock(this.this$0);
            if (!C10485x.f28360a || holdsLock) {
                ArrayList<C12892a0> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                    for (int i = 0; i < valueCount$okhttp; i++) {
                        arrayList.add(this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i)));
                    }
                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (C12892a0 closeQuietly : arrayList) {
                        Util.closeQuietly((Closeable) closeQuietly);
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            } else {
                throw new AssertionError("Assertion failed");
            }
        }

        public final void writeLengths$okhttp(C12909g gVar) throws IOException {
            C10202j.m34178b(gVar, "writer");
            for (long i : this.lengths) {
                gVar.writeByte(32).mo41175i(i);
            }
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo16641d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "key", "", "sequenceNumber", "", "sources", "", "Lokio/Source;", "lengths", "", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "close", "", "edit", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "getLength", "index", "", "getSource", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: DiskLruCache.kt */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<C12892a0> sources;
        final /* synthetic */ DiskLruCache this$0;

        public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends C12892a0> list, long[] jArr) {
            C10202j.m34178b(str, RoomNotification.KEY);
            C10202j.m34178b(list, "sources");
            C10202j.m34178b(jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        public void close() {
            for (C12892a0 closeQuietly : this.sources) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }

        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final C12892a0 getSource(int i) {
            return this.sources.get(i);
        }

        public final String key() {
            return this.key;
        }
    }

    public DiskLruCache(FileSystem fileSystem2, File file, int i, int i2, long j, Executor executor2) {
        C10202j.m34178b(fileSystem2, "fileSystem");
        C10202j.m34178b(file, "directory");
        C10202j.m34178b(executor2, "executor");
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i2;
        this.executor = executor2;
        this.maxSize = j;
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    private final C12909g newJournalWriter() throws FileNotFoundException {
        return C12919p.m41674a((C12932y) new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            C10202j.m34174a((Object) next, "i.next()");
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp((Editor) null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|(1:21)(1:22)|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.redundantOpCount = r7 - r9.lruEntries.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r1.mo41169g() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        rebuildJournal$okhttp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r9.journalWriter = newJournalWriter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        r0 = kotlin.C10483v.f28357a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        kotlin.p257io.C10182a.m34136a(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        kotlin.p257io.C10182a.m34136a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b9, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0064=Splitter:B:18:0x0064, B:26:0x0084=Splitter:B:26:0x0084} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readJournal() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r9.fileSystem
            java.io.File r2 = r9.journalFile
            s.a0 r1 = r1.source(r2)
            s.h r1 = p413s.C12919p.m41675a((p413s.C12892a0) r1)
            java.lang.String r2 = r1.mo41184n()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r1.mo41184n()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = r1.mo41184n()     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r1.mo41184n()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.mo41184n()     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = MAGIC     // Catch:{ all -> 0x00b2 }
            boolean r7 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r7, (java.lang.Object) r2)     // Catch:{ all -> 0x00b2 }
            r8 = 1
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            java.lang.String r7 = VERSION_1     // Catch:{ all -> 0x00b2 }
            boolean r7 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r7, (java.lang.Object) r3)     // Catch:{ all -> 0x00b2 }
            r7 = r7 ^ r8
            if (r7 != 0) goto L_0x0084
            int r7 = r9.appVersion     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b2 }
            boolean r4 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r7, (java.lang.Object) r4)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r9.valueCount     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b2 }
            boolean r4 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x00b2 }
            r4 = r4 ^ r8
            if (r4 != 0) goto L_0x0084
            int r4 = r6.length()     // Catch:{ all -> 0x00b2 }
            r7 = 0
            if (r4 <= 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            if (r8 != 0) goto L_0x0084
        L_0x005a:
            java.lang.String r0 = r1.mo41184n()     // Catch:{ EOFException -> 0x0064 }
            r9.readJournalLine(r0)     // Catch:{ EOFException -> 0x0064 }
            int r7 = r7 + 1
            goto L_0x005a
        L_0x0064:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch:{ all -> 0x00b2 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b2 }
            int r7 = r7 - r0
            r9.redundantOpCount = r7     // Catch:{ all -> 0x00b2 }
            boolean r0 = r1.mo41169g()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0077
            r9.rebuildJournal$okhttp()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x0077:
            s.g r0 = r9.newJournalWriter()     // Catch:{ all -> 0x00b2 }
            r9.journalWriter = r0     // Catch:{ all -> 0x00b2 }
        L_0x007d:
            kotlin.v r0 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x00b2 }
            r0 = 0
            kotlin.p257io.C10182a.m34136a(r1, r0)
            return
        L_0x0084:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00b2 }
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r3)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r5)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r6)     // Catch:{ all -> 0x00b2 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00b2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b2 }
            throw r4     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            kotlin.p257io.C10182a.m34136a(r1, r0)
            goto L_0x00ba
        L_0x00b9:
            throw r2
        L_0x00ba:
            goto L_0x00b9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
    }

    private final void readJournalLine(String str) throws IOException {
        String str2;
        String str3 = str;
        int a = C12131w.m40060a((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (a != -1) {
            int i = a + 1;
            int a2 = C12131w.m40060a((CharSequence) str, ' ', i, false, 4, (Object) null);
            if (a2 == -1) {
                if (str3 != null) {
                    str2 = str3.substring(i);
                    C10202j.m34174a((Object) str2, "(this as java.lang.String).substring(startIndex)");
                    if (a == REMOVE.length() && C12130v.m40056c(str3, REMOVE, false, 2, (Object) null)) {
                        this.lruEntries.remove(str2);
                        return;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else if (str3 != null) {
                str2 = str3.substring(i, a2);
                C10202j.m34174a((Object) str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(this, str2);
                this.lruEntries.put(str2, entry);
            }
            if (a2 != -1 && a == CLEAN.length() && C12130v.m40056c(str3, CLEAN, false, 2, (Object) null)) {
                int i2 = a2 + 1;
                if (str3 != null) {
                    String substring = str3.substring(i2);
                    C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                    List a3 = C12131w.m40073a((CharSequence) substring, new char[]{' '}, false, 0, 6, (Object) null);
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp((Editor) null);
                    entry.setLengths$okhttp(a3);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            } else if (a2 == -1 && a == DIRTY.length() && C12130v.m40056c(str3, DIRTY, false, 2, (Object) null)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
            } else if (a2 != -1 || a != READ.length() || !C12130v.m40056c(str3, READ, false, 2, (Object) null)) {
                throw new IOException("unexpected journal line: " + str3);
            }
        } else {
            throw new IOException("unexpected journal line: " + str3);
        }
    }

    private final void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.mo38744b(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    public synchronized void close() throws IOException {
        if (this.initialized) {
            if (!this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                C10202j.m34174a((Object) values, "lruEntries.values");
                Object[] array = values.toArray(new Entry[0]);
                if (array != null) {
                    for (Entry entry : (Entry[]) array) {
                        if (entry.getCurrentEditor$okhttp() != null) {
                            Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
                            if (currentEditor$okhttp != null) {
                                currentEditor$okhttp.abort();
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                        }
                    }
                    trimToSize();
                    C12909g gVar = this.journalWriter;
                    if (gVar != null) {
                        gVar.close();
                        this.journalWriter = null;
                        this.closed = true;
                        return;
                    }
                    C10202j.m34172a();
                    throw null;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        this.closed = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0122, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache.Editor r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.C10202j.m34178b(r10, r0)     // Catch:{ all -> 0x0133 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r10.getEntry$okhttp()     // Catch:{ all -> 0x0133 }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0133 }
            boolean r1 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r1, (java.lang.Object) r10)     // Catch:{ all -> 0x0133 }
            if (r1 == 0) goto L_0x0127
            r1 = 0
            r2 = 0
            if (r11 == 0) goto L_0x0065
            boolean r3 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0133 }
            if (r3 != 0) goto L_0x0065
            int r3 = r9.valueCount     // Catch:{ all -> 0x0133 }
            r4 = 0
        L_0x0021:
            if (r4 >= r3) goto L_0x0065
            boolean[] r5 = r10.getWritten$okhttp()     // Catch:{ all -> 0x0133 }
            if (r5 == 0) goto L_0x0061
            boolean r5 = r5[r4]     // Catch:{ all -> 0x0133 }
            if (r5 == 0) goto L_0x0047
            okhttp3.internal.io.FileSystem r5 = r9.fileSystem     // Catch:{ all -> 0x0133 }
            java.util.List r6 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0133 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x0133 }
            java.io.File r6 = (java.io.File) r6     // Catch:{ all -> 0x0133 }
            boolean r5 = r5.exists(r6)     // Catch:{ all -> 0x0133 }
            if (r5 != 0) goto L_0x0044
            r10.abort()     // Catch:{ all -> 0x0133 }
            monitor-exit(r9)
            return
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x0047:
            r10.abort()     // Catch:{ all -> 0x0133 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0133 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r11.<init>()     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0133 }
            r11.append(r4)     // Catch:{ all -> 0x0133 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0133 }
            r10.<init>(r11)     // Catch:{ all -> 0x0133 }
            throw r10     // Catch:{ all -> 0x0133 }
        L_0x0061:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x0133 }
            throw r2
        L_0x0065:
            int r10 = r9.valueCount     // Catch:{ all -> 0x0133 }
        L_0x0067:
            if (r1 >= r10) goto L_0x00ad
            java.util.List r3 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0133 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0133 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0133 }
            if (r11 == 0) goto L_0x00a5
            okhttp3.internal.io.FileSystem r4 = r9.fileSystem     // Catch:{ all -> 0x0133 }
            boolean r4 = r4.exists(r3)     // Catch:{ all -> 0x0133 }
            if (r4 == 0) goto L_0x00aa
            java.util.List r4 = r0.getCleanFiles$okhttp()     // Catch:{ all -> 0x0133 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0133 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0133 }
            okhttp3.internal.io.FileSystem r5 = r9.fileSystem     // Catch:{ all -> 0x0133 }
            r5.rename(r3, r4)     // Catch:{ all -> 0x0133 }
            long[] r3 = r0.getLengths$okhttp()     // Catch:{ all -> 0x0133 }
            r5 = r3[r1]     // Catch:{ all -> 0x0133 }
            okhttp3.internal.io.FileSystem r3 = r9.fileSystem     // Catch:{ all -> 0x0133 }
            long r3 = r3.size(r4)     // Catch:{ all -> 0x0133 }
            long[] r7 = r0.getLengths$okhttp()     // Catch:{ all -> 0x0133 }
            r7[r1] = r3     // Catch:{ all -> 0x0133 }
            long r7 = r9.size     // Catch:{ all -> 0x0133 }
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.size = r7     // Catch:{ all -> 0x0133 }
            goto L_0x00aa
        L_0x00a5:
            okhttp3.internal.io.FileSystem r4 = r9.fileSystem     // Catch:{ all -> 0x0133 }
            r4.delete(r3)     // Catch:{ all -> 0x0133 }
        L_0x00aa:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x00ad:
            int r10 = r9.redundantOpCount     // Catch:{ all -> 0x0133 }
            r1 = 1
            int r10 = r10 + r1
            r9.redundantOpCount = r10     // Catch:{ all -> 0x0133 }
            r0.setCurrentEditor$okhttp(r2)     // Catch:{ all -> 0x0133 }
            s.g r10 = r9.journalWriter     // Catch:{ all -> 0x0133 }
            if (r10 == 0) goto L_0x0123
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0133 }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00e4
            if (r11 == 0) goto L_0x00c7
            goto L_0x00e4
        L_0x00c7:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r11 = r9.lruEntries     // Catch:{ all -> 0x0133 }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x0133 }
            r11.remove(r1)     // Catch:{ all -> 0x0133 }
            java.lang.String r11 = REMOVE     // Catch:{ all -> 0x0133 }
            s.g r11 = r10.mo41155b(r11)     // Catch:{ all -> 0x0133 }
            r11.writeByte(r4)     // Catch:{ all -> 0x0133 }
            java.lang.String r11 = r0.getKey$okhttp()     // Catch:{ all -> 0x0133 }
            r10.mo41155b(r11)     // Catch:{ all -> 0x0133 }
            r10.writeByte(r3)     // Catch:{ all -> 0x0133 }
            goto L_0x0109
        L_0x00e4:
            r0.setReadable$okhttp(r1)     // Catch:{ all -> 0x0133 }
            java.lang.String r1 = CLEAN     // Catch:{ all -> 0x0133 }
            s.g r1 = r10.mo41155b(r1)     // Catch:{ all -> 0x0133 }
            r1.writeByte(r4)     // Catch:{ all -> 0x0133 }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x0133 }
            r10.mo41155b(r1)     // Catch:{ all -> 0x0133 }
            r0.writeLengths$okhttp(r10)     // Catch:{ all -> 0x0133 }
            r10.writeByte(r3)     // Catch:{ all -> 0x0133 }
            if (r11 == 0) goto L_0x0109
            long r1 = r9.nextSequenceNumber     // Catch:{ all -> 0x0133 }
            r3 = 1
            long r3 = r3 + r1
            r9.nextSequenceNumber = r3     // Catch:{ all -> 0x0133 }
            r0.setSequenceNumber$okhttp(r1)     // Catch:{ all -> 0x0133 }
        L_0x0109:
            r10.flush()     // Catch:{ all -> 0x0133 }
            long r10 = r9.size     // Catch:{ all -> 0x0133 }
            long r0 = r9.maxSize     // Catch:{ all -> 0x0133 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x011a
            boolean r10 = r9.journalRebuildRequired()     // Catch:{ all -> 0x0133 }
            if (r10 == 0) goto L_0x0121
        L_0x011a:
            java.util.concurrent.Executor r10 = r9.executor     // Catch:{ all -> 0x0133 }
            java.lang.Runnable r11 = r9.cleanupRunnable     // Catch:{ all -> 0x0133 }
            r10.execute(r11)     // Catch:{ all -> 0x0133 }
        L_0x0121:
            monitor-exit(r9)
            return
        L_0x0123:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x0133 }
            throw r2
        L_0x0127:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0133 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0133 }
            r11.<init>(r10)     // Catch:{ all -> 0x0133 }
            throw r11     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0137
        L_0x0136:
            throw r10
        L_0x0137:
            goto L_0x0136
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) throws IOException {
        return edit$default(this, str, 0, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C10202j.m34178b(r6, r0)     // Catch:{ all -> 0x0084 }
            r5.initialize()     // Catch:{ all -> 0x0084 }
            r5.checkNotClosed()     // Catch:{ all -> 0x0084 }
            r5.validateKey(r6)     // Catch:{ all -> 0x0084 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch:{ all -> 0x0084 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0084 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0084 }
            long r1 = ANY_SEQUENCE_NUMBER     // Catch:{ all -> 0x0084 }
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x0028
            long r1 = r0.getSequenceNumber$okhttp()     // Catch:{ all -> 0x0084 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x002a
        L_0x0028:
            monitor-exit(r5)
            return r3
        L_0x002a:
            if (r0 == 0) goto L_0x0031
            okhttp3.internal.cache.DiskLruCache$Editor r7 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0084 }
            goto L_0x0032
        L_0x0031:
            r7 = r3
        L_0x0032:
            if (r7 == 0) goto L_0x0036
            monitor-exit(r5)
            return r3
        L_0x0036:
            boolean r7 = r5.mostRecentTrimFailed     // Catch:{ all -> 0x0084 }
            if (r7 != 0) goto L_0x007b
            boolean r7 = r5.mostRecentRebuildFailed     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x003f
            goto L_0x007b
        L_0x003f:
            s.g r7 = r5.journalWriter     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0077
            java.lang.String r8 = DIRTY     // Catch:{ all -> 0x0084 }
            s.g r8 = r7.mo41155b(r8)     // Catch:{ all -> 0x0084 }
            r1 = 32
            s.g r8 = r8.writeByte(r1)     // Catch:{ all -> 0x0084 }
            s.g r8 = r8.mo41155b(r6)     // Catch:{ all -> 0x0084 }
            r1 = 10
            r8.writeByte(r1)     // Catch:{ all -> 0x0084 }
            r7.flush()     // Catch:{ all -> 0x0084 }
            boolean r7 = r5.hasJournalErrors     // Catch:{ all -> 0x0084 }
            if (r7 == 0) goto L_0x0061
            monitor-exit(r5)
            return r3
        L_0x0061:
            if (r0 != 0) goto L_0x006d
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch:{ all -> 0x0084 }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x0084 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r7 = r5.lruEntries     // Catch:{ all -> 0x0084 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0084 }
        L_0x006d:
            okhttp3.internal.cache.DiskLruCache$Editor r6 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x0084 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0084 }
            r0.setCurrentEditor$okhttp(r6)     // Catch:{ all -> 0x0084 }
            monitor-exit(r5)
            return r6
        L_0x0077:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x0084 }
            throw r3
        L_0x007b:
            java.util.concurrent.Executor r6 = r5.executor     // Catch:{ all -> 0x0084 }
            java.lang.Runnable r7 = r5.cleanupRunnable     // Catch:{ all -> 0x0084 }
            r6.execute(r7)     // Catch:{ all -> 0x0084 }
            monitor-exit(r5)
            return r3
        L_0x0084:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.edit(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        Collection<Entry> values = this.lruEntries.values();
        C10202j.m34174a((Object) values, "lruEntries.values");
        Object[] array = values.toArray(new Entry[0]);
        if (array != null) {
            for (Entry entry : (Entry[]) array) {
                C10202j.m34174a((Object) entry, "entry");
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public synchronized void flush() throws IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            C12909g gVar = this.journalWriter;
            if (gVar != null) {
                gVar.flush();
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)     // Catch:{ all -> 0x0063 }
            r3.initialize()     // Catch:{ all -> 0x0063 }
            r3.checkNotClosed()     // Catch:{ all -> 0x0063 }
            r3.validateKey(r4)     // Catch:{ all -> 0x0063 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r3.lruEntries     // Catch:{ all -> 0x0063 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0063 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0063 }
            r1 = 0
            if (r0 == 0) goto L_0x0061
            java.lang.String r2 = "lruEntries[key] ?: return null"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0063 }
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x0063 }
            if (r2 != 0) goto L_0x0027
            monitor-exit(r3)
            return r1
        L_0x0027:
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot$okhttp()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x005f
            int r2 = r3.redundantOpCount     // Catch:{ all -> 0x0063 }
            int r2 = r2 + 1
            r3.redundantOpCount = r2     // Catch:{ all -> 0x0063 }
            s.g r2 = r3.journalWriter     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x005b
            java.lang.String r1 = READ     // Catch:{ all -> 0x0063 }
            s.g r1 = r2.mo41155b(r1)     // Catch:{ all -> 0x0063 }
            r2 = 32
            s.g r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0063 }
            s.g r4 = r1.mo41155b(r4)     // Catch:{ all -> 0x0063 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0063 }
            boolean r4 = r3.journalRebuildRequired()     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0059
            java.util.concurrent.Executor r4 = r3.executor     // Catch:{ all -> 0x0063 }
            java.lang.Runnable r1 = r3.cleanupRunnable     // Catch:{ all -> 0x0063 }
            r4.execute(r1)     // Catch:{ all -> 0x0063 }
        L_0x0059:
            monitor-exit(r3)
            return r0
        L_0x005b:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x0063 }
            throw r1
        L_0x005f:
            monitor-exit(r3)
            return r1
        L_0x0061:
            monitor-exit(r3)
            return r1
        L_0x0063:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.get(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        boolean holdsLock = Thread.holdsLock(this);
        if (C10485x.f28360a) {
            if (!holdsLock) {
                throw new AssertionError("Assertion failed");
            }
        }
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.Companion.get();
                    platform.log(5, "DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", e);
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        kotlin.p257io.C10182a.m34136a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void rebuildJournal$okhttp() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            s.g r0 = r7.journalWriter     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00c5 }
        L_0x0008:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.journalFileTmp     // Catch:{ all -> 0x00c5 }
            s.y r0 = r0.sink(r1)     // Catch:{ all -> 0x00c5 }
            s.g r0 = p413s.C12919p.m41674a((p413s.C12932y) r0)     // Catch:{ all -> 0x00c5 }
            r1 = 0
            java.lang.String r2 = MAGIC     // Catch:{ all -> 0x00be }
            s.g r2 = r0.mo41155b(r2)     // Catch:{ all -> 0x00be }
            r3 = 10
            r2.writeByte(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = VERSION_1     // Catch:{ all -> 0x00be }
            s.g r2 = r0.mo41155b(r2)     // Catch:{ all -> 0x00be }
            r2.writeByte(r3)     // Catch:{ all -> 0x00be }
            int r2 = r7.appVersion     // Catch:{ all -> 0x00be }
            long r4 = (long) r2     // Catch:{ all -> 0x00be }
            s.g r2 = r0.mo41175i(r4)     // Catch:{ all -> 0x00be }
            r2.writeByte(r3)     // Catch:{ all -> 0x00be }
            int r2 = r7.valueCount     // Catch:{ all -> 0x00be }
            long r4 = (long) r2     // Catch:{ all -> 0x00be }
            s.g r2 = r0.mo41175i(r4)     // Catch:{ all -> 0x00be }
            r2.writeByte(r3)     // Catch:{ all -> 0x00be }
            r0.writeByte(r3)     // Catch:{ all -> 0x00be }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r2 = r7.lruEntries     // Catch:{ all -> 0x00be }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00be }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00be }
        L_0x004a:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00be }
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00be }
            okhttp3.internal.cache.DiskLruCache$Entry r4 = (okhttp3.internal.cache.DiskLruCache.Entry) r4     // Catch:{ all -> 0x00be }
            okhttp3.internal.cache.DiskLruCache$Editor r5 = r4.getCurrentEditor$okhttp()     // Catch:{ all -> 0x00be }
            r6 = 32
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = DIRTY     // Catch:{ all -> 0x00be }
            s.g r5 = r0.mo41155b(r5)     // Catch:{ all -> 0x00be }
            r5.writeByte(r6)     // Catch:{ all -> 0x00be }
            java.lang.String r4 = r4.getKey$okhttp()     // Catch:{ all -> 0x00be }
            r0.mo41155b(r4)     // Catch:{ all -> 0x00be }
            r0.writeByte(r3)     // Catch:{ all -> 0x00be }
            goto L_0x004a
        L_0x0072:
            java.lang.String r5 = CLEAN     // Catch:{ all -> 0x00be }
            s.g r5 = r0.mo41155b(r5)     // Catch:{ all -> 0x00be }
            r5.writeByte(r6)     // Catch:{ all -> 0x00be }
            java.lang.String r5 = r4.getKey$okhttp()     // Catch:{ all -> 0x00be }
            r0.mo41155b(r5)     // Catch:{ all -> 0x00be }
            r4.writeLengths$okhttp(r0)     // Catch:{ all -> 0x00be }
            r0.writeByte(r3)     // Catch:{ all -> 0x00be }
            goto L_0x004a
        L_0x0089:
            kotlin.v r2 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x00be }
            kotlin.p257io.C10182a.m34136a(r0, r1)     // Catch:{ all -> 0x00c5 }
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.journalFile     // Catch:{ all -> 0x00c5 }
            boolean r0 = r0.exists(r1)     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00a1
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.journalFile     // Catch:{ all -> 0x00c5 }
            java.io.File r2 = r7.journalFileBackup     // Catch:{ all -> 0x00c5 }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00c5 }
        L_0x00a1:
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.journalFileTmp     // Catch:{ all -> 0x00c5 }
            java.io.File r2 = r7.journalFile     // Catch:{ all -> 0x00c5 }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00c5 }
            okhttp3.internal.io.FileSystem r0 = r7.fileSystem     // Catch:{ all -> 0x00c5 }
            java.io.File r1 = r7.journalFileBackup     // Catch:{ all -> 0x00c5 }
            r0.delete(r1)     // Catch:{ all -> 0x00c5 }
            s.g r0 = r7.newJournalWriter()     // Catch:{ all -> 0x00c5 }
            r7.journalWriter = r0     // Catch:{ all -> 0x00c5 }
            r0 = 0
            r7.hasJournalErrors = r0     // Catch:{ all -> 0x00c5 }
            r7.mostRecentRebuildFailed = r0     // Catch:{ all -> 0x00c5 }
            monitor-exit(r7)
            return
        L_0x00be:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r2 = move-exception
            kotlin.p257io.C10182a.m34136a(r0, r1)     // Catch:{ all -> 0x00c5 }
            throw r2     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r7)
            goto L_0x00c9
        L_0x00c8:
            throw r0
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.rebuildJournal$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean remove(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C10202j.m34178b(r7, r0)     // Catch:{ all -> 0x0033 }
            r6.initialize()     // Catch:{ all -> 0x0033 }
            r6.checkNotClosed()     // Catch:{ all -> 0x0033 }
            r6.validateKey(r7)     // Catch:{ all -> 0x0033 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r6.lruEntries     // Catch:{ all -> 0x0033 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0033 }
            okhttp3.internal.cache.DiskLruCache$Entry r7 = (okhttp3.internal.cache.DiskLruCache.Entry) r7     // Catch:{ all -> 0x0033 }
            r0 = 0
            if (r7 == 0) goto L_0x0031
            java.lang.String r1 = "lruEntries[key] ?: return false"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r7, (java.lang.String) r1)     // Catch:{ all -> 0x0033 }
            boolean r7 = r6.removeEntry$okhttp(r7)     // Catch:{ all -> 0x0033 }
            if (r7 == 0) goto L_0x002f
            long r1 = r6.size     // Catch:{ all -> 0x0033 }
            long r3 = r6.maxSize     // Catch:{ all -> 0x0033 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x002f
            r6.mostRecentTrimFailed = r0     // Catch:{ all -> 0x0033 }
        L_0x002f:
            monitor-exit(r6)
            return r7
        L_0x0031:
            monitor-exit(r6)
            return r0
        L_0x0033:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.remove(java.lang.String):boolean");
    }

    public final boolean removeEntry$okhttp(Entry entry) throws IOException {
        C10202j.m34178b(entry, "entry");
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths$okhttp()[i2];
            entry.getLengths$okhttp()[i2] = 0;
        }
        this.redundantOpCount++;
        C12909g gVar = this.journalWriter;
        if (gVar != null) {
            gVar.mo41155b(REMOVE).writeByte(32).mo41155b(entry.getKey$okhttp()).writeByte(10);
            this.lruEntries.remove(entry.getKey$okhttp());
            if (journalRebuildRequired()) {
                this.executor.execute(this.cleanupRunnable);
            }
            return true;
        }
        C10202j.m34172a();
        throw null;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            this.executor.execute(this.cleanupRunnable);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            Entry next = this.lruEntries.values().iterator().next();
            C10202j.m34174a((Object) next, "lruEntries.values.iterator().next()");
            removeEntry$okhttp(next);
        }
        this.mostRecentTrimFailed = false;
    }
}
