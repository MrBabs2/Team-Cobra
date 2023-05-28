package p015cm.aptoide.p016pt.account.view;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: cm.aptoide.pt.account.view.UriToPathResolver */
public class UriToPathResolver {
    private static final String TAG = "cm.aptoide.pt.account.view.UriToPathResolver";
    private final ContentResolver contentResolver;

    public UriToPathResolver(ContentResolver contentResolver2) {
        this.contentResolver = contentResolver2;
    }

    public String getCameraStoragePath(Uri uri) {
        Cursor query = this.contentResolver.query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return uri.toString();
        }
        query.moveToFirst();
        return query.getString(query.getColumnIndex("_data"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r1.isClosed() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r1.isClosed() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        r1.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getMediaStoragePath(android.net.Uri r10) {
        /*
            r9 = this;
            java.lang.String r0 = "_data"
            if (r10 == 0) goto L_0x005f
            r1 = 0
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0039 }
            r2 = 0
            r5[r2] = r0     // Catch:{ Exception -> 0x0039 }
            android.content.ContentResolver r3 = r9.contentResolver     // Catch:{ Exception -> 0x0039 }
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x002e
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x0039 }
            r1.moveToFirst()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r10 = r1.getString(r0)     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x002d
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L_0x002d
            r1.close()
        L_0x002d:
            return r10
        L_0x002e:
            if (r1 == 0) goto L_0x004e
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L_0x004e
            goto L_0x004b
        L_0x0037:
            r10 = move-exception
            goto L_0x0053
        L_0x0039:
            r0 = move-exception
            cm.aptoide.pt.logger.Logger r2 = p015cm.aptoide.p016pt.logger.Logger.getInstance()     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = TAG     // Catch:{ all -> 0x0037 }
            r2.mo12981e((java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x004e
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L_0x004e
        L_0x004b:
            r1.close()
        L_0x004e:
            java.lang.String r10 = r10.toString()
            return r10
        L_0x0053:
            if (r1 == 0) goto L_0x005e
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L_0x005e
            r1.close()
        L_0x005e:
            throw r10
        L_0x005f:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "content Uri is null"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.account.view.UriToPathResolver.getMediaStoragePath(android.net.Uri):java.lang.String");
    }
}
