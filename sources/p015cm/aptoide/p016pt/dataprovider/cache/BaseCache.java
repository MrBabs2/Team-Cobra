package p015cm.aptoide.p016pt.dataprovider.cache;

/* renamed from: cm.aptoide.pt.dataprovider.cache.BaseCache */
public abstract class BaseCache<K, V, Tout> implements Cache<K, V> {
    final KeyAlgorithm<K, Tout> keyAlgorithm;

    public BaseCache(KeyAlgorithm<K, Tout> keyAlgorithm2) {
        this.keyAlgorithm = keyAlgorithm2;
    }
}
