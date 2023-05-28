package p015cm.aptoide.p016pt.dataprovider.cache;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Request;
import okhttp3.Response;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.logger.Logger;

/* renamed from: cm.aptoide.pt.dataprovider.cache.L2Cache */
public class L2Cache extends StringBaseCache<Request, Response> {
    private static final String CACHE_CONTROL_HEADER = "Cache-Control";
    private static final int MAX_COUNT = 15;
    private static final String TAG = "cm.aptoide.pt.dataprovider.cache.L2Cache";
    private ConcurrentHashMap<String, ResponseCacheEntry> cache;
    private final File cacheFile;
    private volatile boolean isPersisting = false;
    private final Pattern pattern = Pattern.compile("\\d+");
    private AtomicInteger persistenceCounter = new AtomicInteger(0);

    public L2Cache(KeyAlgorithm<Request, String> keyAlgorithm, File file) {
        super(keyAlgorithm);
        this.cacheFile = file;
        this.cache = new ConcurrentHashMap<>(60);
        try {
            load();
        } catch (IOException unused) {
        }
    }

    private int extractNumber(String str) {
        Matcher matcher = this.pattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(matcher.groupCount()));
        }
        return 0;
    }

    private void load() throws IOException {
        this.cache = (ConcurrentHashMap) new ObjectMapper().readValue(this.cacheFile, (TypeReference) new TypeReference<ConcurrentHashMap<String, ResponseCacheEntry>>() {
        });
        Logger.getInstance().mo12975d(TAG, "Loaded cache file");
    }

    private void persist() {
        this.isPersisting = true;
        removeInvalid();
        try {
            store();
        } catch (IOException e) {
            CrashReport.getInstance().log(e);
        }
        do {
        } while (!this.persistenceCounter.compareAndSet(this.persistenceCounter.get(), 0));
        this.isPersisting = false;
    }

    private void removeInvalid() {
        for (Map.Entry next : this.cache.entrySet()) {
            if (!((ResponseCacheEntry) next.getValue()).isValid()) {
                this.cache.remove(next.getKey());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039 A[Catch:{ Exception -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int shouldCacheUntil(okhttp3.Response r4) {
        /*
            r3 = this;
            r0 = 0
            okhttp3.Headers r4 = r4.headers()     // Catch:{ Exception -> 0x0054 }
            int r1 = r4.size()     // Catch:{ Exception -> 0x0054 }
            if (r1 > 0) goto L_0x0017
            cm.aptoide.pt.logger.Logger r4 = p015cm.aptoide.p016pt.logger.Logger.getInstance()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = TAG     // Catch:{ Exception -> 0x0054 }
            java.lang.String r2 = "not caching the response due to empty headers"
            r4.mo12975d((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0054 }
            return r0
        L_0x0017:
            java.lang.String r1 = "Cache-Control"
            java.util.List r4 = r4.values(r1)     // Catch:{ Exception -> 0x0054 }
            int r1 = r4.size()     // Catch:{ Exception -> 0x0054 }
            if (r1 > 0) goto L_0x002f
            cm.aptoide.pt.logger.Logger r4 = p015cm.aptoide.p016pt.logger.Logger.getInstance()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = TAG     // Catch:{ Exception -> 0x0054 }
            java.lang.String r2 = "not caching the response due to empty Cache-Control header"
            r4.mo12975d((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0054 }
            return r0
        L_0x002f:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0054 }
        L_0x0033:
            boolean r1 = r4.hasNext()     // Catch:{ Exception -> 0x0054 }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r4.next()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0054 }
            java.lang.String r2 = "max-age"
            boolean r2 = r1.startsWith(r2)     // Catch:{ Exception -> 0x0054 }
            if (r2 != 0) goto L_0x004f
            java.lang.String r2 = "s-maxage"
            boolean r2 = r1.startsWith(r2)     // Catch:{ Exception -> 0x0054 }
            if (r2 == 0) goto L_0x0033
        L_0x004f:
            int r4 = r3.extractNumber(r1)     // Catch:{ Exception -> 0x0054 }
            return r4
        L_0x0054:
            r4 = move-exception
            cm.aptoide.pt.crashreports.CrashReport r1 = p015cm.aptoide.p016pt.crashreports.CrashReport.getInstance()
            r1.log(r4)
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.dataprovider.cache.L2Cache.shouldCacheUntil(okhttp3.Response):int");
    }

    private void store() throws IOException {
        new ObjectMapper().writeValue(this.cacheFile, (Object) this.cache);
        Logger.getInstance().mo12975d(TAG, "Stored cache file");
    }

    public void clean() {
        ConcurrentHashMap<String, ResponseCacheEntry> concurrentHashMap = this.cache;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            this.cache.clear();
        }
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public void destroy() {
        persist();
        this.cache.clear();
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return super.get(obj);
    }

    public /* bridge */ /* synthetic */ boolean isValid(Object obj) {
        return super.isValid(obj);
    }

    public /* bridge */ /* synthetic */ void put(Object obj, Object obj2) {
        super.put(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void remove(Object obj) {
        super.remove(obj);
    }

    public boolean contains(String str) {
        return this.cache.containsKey(str);
    }

    public boolean isValid(String str) {
        ResponseCacheEntry responseCacheEntry = contains(str) ? this.cache.get(str) : null;
        if (responseCacheEntry != null) {
            return responseCacheEntry.isValid();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void remove(String str) {
        if (contains(str)) {
            this.cache.remove(str);
        }
    }

    public Response get(String str, Request request) {
        ResponseCacheEntry responseCacheEntry = this.cache.get(str);
        if (this.persistenceCounter.incrementAndGet() >= 15 && responseCacheEntry != null && !this.isPersisting) {
            persist();
        }
        return responseCacheEntry.getResponse(request);
    }

    public void put(String str, Response response) {
        int shouldCacheUntil = shouldCacheUntil(response);
        if (shouldCacheUntil >= 1) {
            this.cache.put(str, new ResponseCacheEntry(response, shouldCacheUntil));
        }
    }
}
