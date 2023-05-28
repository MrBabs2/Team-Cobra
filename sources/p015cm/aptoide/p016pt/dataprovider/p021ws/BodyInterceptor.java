package p015cm.aptoide.p016pt.dataprovider.p021ws;

import p123rx.Single;

/* renamed from: cm.aptoide.pt.dataprovider.ws.BodyInterceptor */
public interface BodyInterceptor<T> {
    Single<T> intercept(T t);
}
