package p015cm.aptoide.p016pt.account.view;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.logger.Logger;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0006R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/ImageInfoProvider;", "", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;)V", "TAG", "", "kotlin.jvm.PlatformType", "getInfo", "Lcm/aptoide/pt/account/view/ImageInfo;", "imagePath", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.ImageInfoProvider */
/* compiled from: ImageInfoProvider.kt */
public final class ImageInfoProvider {
    private final String TAG = ImageInfoProvider.class.getName();
    private final ContentResolver contentResolver;

    public ImageInfoProvider(ContentResolver contentResolver2) {
        C10202j.m34178b(contentResolver2, "contentResolver");
        this.contentResolver = contentResolver2;
    }

    public final ImageInfo getInfo(String str) {
        C10202j.m34178b(str, "imagePath");
        String[] strArr = {"_data", "height", "width", "_size"};
        Uri parse = Uri.parse(str);
        if (C12130v.m40054b(parse != null ? parse.getScheme() : null, "content", false, 2, (Object) null)) {
            Cursor query = this.contentResolver.query(parse, strArr, (String) null, (String[]) null, (String) null);
            if (query != null) {
                try {
                    query.moveToFirst();
                    int i = query.getInt(query.getColumnIndex("width"));
                    int i2 = query.getInt(query.getColumnIndex("height"));
                    long j = query.getLong(query.getColumnIndex("_size"));
                    query.close();
                    return new ImageInfo(i2, i, j);
                } catch (Exception e) {
                    Logger.getInstance().mo12981e(this.TAG, (Throwable) e);
                }
            }
        } else {
            if (C12130v.m40054b(parse != null ? parse.getScheme() : null, "file", false, 2, (Object) null)) {
                try {
                    File file = new File(str);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                    return new ImageInfo(options.outHeight, options.outWidth, file.length());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return null;
    }
}
