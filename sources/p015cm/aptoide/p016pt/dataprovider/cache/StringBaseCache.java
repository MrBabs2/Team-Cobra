package p015cm.aptoide.p016pt.dataprovider.cache;

/* renamed from: cm.aptoide.pt.dataprovider.cache.StringBaseCache */
abstract class StringBaseCache<K, V> extends BaseCache<K, V, String> {
    StringBaseCache(KeyAlgorithm<K, String> keyAlgorithm) {
        super(keyAlgorithm);
    }

    public boolean contains(K k) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm != null) {
            return contains((String) keyAlgorithm.getKeyFrom(k));
        }
        throw new UnsupportedOperationException("Initialize cache using init() first");
    }

    /* access modifiers changed from: package-private */
    public abstract boolean contains(String str);

    public V get(K k) {
        if (this.keyAlgorithm == null) {
            throw new UnsupportedOperationException("Initialize cache using init() first");
        } else if (isValid(k)) {
            return get((String) this.keyAlgorithm.getKeyFrom(k), k);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract V get(String str, K k);

    public boolean isValid(K k) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm != null) {
            String str = (String) keyAlgorithm.getKeyFrom(k);
            return contains(str) && isValid(str);
        }
        throw new UnsupportedOperationException("Initialize cache using init() first");
    }

    /* access modifiers changed from: package-private */
    public abstract boolean isValid(String str);

    public void put(K k, V v) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm != null) {
            put((String) keyAlgorithm.getKeyFrom(k), v);
            return;
        }
        throw new UnsupportedOperationException("Initialize cache using init() first");
    }

    /* access modifiers changed from: package-private */
    public abstract void put(String str, V v);

    public void remove(K k) {
        KeyAlgorithm<K, Tout> keyAlgorithm = this.keyAlgorithm;
        if (keyAlgorithm != null) {
            remove((String) keyAlgorithm.getKeyFrom(k));
            return;
        }
        throw new UnsupportedOperationException("Initialize cache using init() first");
    }

    /* access modifiers changed from: package-private */
    public abstract void remove(String str);
}
