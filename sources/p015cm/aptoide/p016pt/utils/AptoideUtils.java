package p015cm.aptoide.p016pt.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URI;
import java.net.URLDecoder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UnknownFormatConversionException;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.permissions.ApkPermission;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.utils.AptoideUtils */
public class AptoideUtils {

    @Deprecated
    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$Benchmarking */
    public static class Benchmarking {
        private static final String TAG = "Benchmarking";
        private String methodName;
        private long startTime;

        public static Benchmarking start(String str) {
            Benchmarking benchmarking = new Benchmarking();
            benchmarking.methodName = str;
            benchmarking.startTime = System.currentTimeMillis();
            return benchmarking;
        }

        public void end() {
            long currentTimeMillis = System.currentTimeMillis();
            Logger instance = Logger.getInstance();
            String str = TAG;
            instance.mo12975d(str, "Thread: " + Thread.currentThread().getId() + " Method:" + this.methodName + " - Total execution time: " + (currentTimeMillis - this.startTime) + "ms");
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$Core */
    public static class Core {
        private static final String TAG = "Core";

        public static String getDefaultVername(Context context) {
            String str;
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                str = "";
            }
            return "aptoide-" + str;
        }

        public static int getVerCode(Context context) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                Logger.getInstance().mo12981e(TAG, (Throwable) e);
                return -1;
            }
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$HtmlU */
    public static class HtmlU {
        public static CharSequence parse(String str) {
            return Html.fromHtml(str.replace("\n", "<br/>").replace("&", "&amp;"));
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$IconSizeU */
    public static class IconSizeU {
        private static final String AVATAR_STRING = "_avatar";
        public static final int DEFAULT_SCREEN_DENSITY = -1;
        public static final int ICONS_SIZE_TYPE = 0;
        public static final int STORE_ICONS_SIZE_TYPE = 1;
        private static final String TAG = "cm.aptoide.pt.utils.AptoideUtils$IconSizeU";
        private static final int baseLine = 96;
        private static final int baseLineAvatar = 150;
        private static int baseLineScreenshotLand = 256;
        private static int baseLineScreenshotPort = 96;
        private static final int baseLineXNotification = 320;
        private static final int baseLineYNotification = 180;
        public static final HashMap<Integer, String> mIconSizes;
        public static final HashMap<Integer, String> mStoreIconSizes;
        private static final Pattern urlWithDimensionPattern = Pattern.compile("_{1}[1-9]{3}(x|X){1}[1-9]{3}.{1}.{3,4}\\b");

        static {
            HashMap<Integer, String> hashMap = new HashMap<>();
            mStoreIconSizes = hashMap;
            hashMap.put(480, "450x450");
            HashMap<Integer, String> hashMap2 = mStoreIconSizes;
            Integer valueOf = Integer.valueOf(baseLineXNotification);
            hashMap2.put(valueOf, "300x300");
            mStoreIconSizes.put(240, "225x225");
            mStoreIconSizes.put(160, "150x150");
            mStoreIconSizes.put(120, "113x113");
            HashMap<Integer, String> hashMap3 = new HashMap<>();
            mIconSizes = hashMap3;
            hashMap3.put(640, "384x384");
            mIconSizes.put(480, "288x288");
            mIconSizes.put(valueOf, "192x192");
            mIconSizes.put(240, "144x144");
            mIconSizes.put(160, "127x127");
            mIconSizes.put(120, "96x96");
        }

        public static String cleanImageUrl(String str) {
            int lastIndexOf = str.lastIndexOf(95);
            if (lastIndexOf == -1) {
                return str;
            }
            if (!urlWithDimensionPattern.matcher(str.substring(lastIndexOf)).matches()) {
                return str;
            }
            int lastIndexOf2 = str.lastIndexOf(46);
            return str.substring(0, lastIndexOf) + str.substring(lastIndexOf2);
        }

        private static Float densityMultiplier(Resources resources) {
            float f = resources.getDisplayMetrics().density;
            float f2 = 3.0f;
            if (f <= 0.75f) {
                f2 = 0.75f;
            } else if (f <= 1.0f) {
                f2 = 1.0f;
            } else if (f <= 1.333f) {
                f2 = 1.33125f;
            } else if (f <= 1.5f) {
                f2 = 1.5f;
            } else if (f <= 2.0f) {
                f2 = 2.0f;
            } else if (f > 3.0f) {
                f2 = 4.0f;
            }
            return Float.valueOf(f2);
        }

        public static String generateSizeStoreString(String str, Resources resources, WindowManager windowManager) {
            if (str == null) {
                return "";
            }
            String str2 = mStoreIconSizes.get(Integer.valueOf(resources.getDisplayMetrics().densityDpi));
            if (TextUtils.isEmpty(str2)) {
                str2 = getDefaultSize(1, windowManager);
            }
            if (TextUtils.isEmpty(str2)) {
                return str;
            }
            String[] splitUrlExtension = splitUrlExtension(str);
            return splitUrlExtension[0] + "_" + str2 + "." + splitUrlExtension[1];
        }

        private static String generateSizeString(Resources resources, WindowManager windowManager) {
            String str = mIconSizes.get(Integer.valueOf(resources.getDisplayMetrics().densityDpi));
            return str != null ? str : getDefaultSize(0, windowManager);
        }

        private static String generateSizeStringScreenshotsdd(String str, WindowManager windowManager, Resources resources) {
            int i;
            float floatValue = densityMultiplier(resources).floatValue();
            if (str == null || !str.equals("portrait")) {
                i = baseLineScreenshotLand;
            } else {
                i = baseLineScreenshotPort;
            }
            int i2 = i * ((int) floatValue);
            return i2 + "x" + ScreenU.getDensityDpi(windowManager);
        }

        public static String generateStringAvatar(String str, Resources resources, WindowManager windowManager) {
            if (str == null) {
                return "";
            }
            Math.round(densityMultiplier(resources).floatValue() * 150.0f);
            String[] splitUrlExtension = splitUrlExtension(str);
            return splitUrlExtension[0] + "_" + getUserAvatarIconSize(windowManager) + "." + splitUrlExtension[1];
        }

        @Deprecated
        public static String generateStringNotification(String str, Resources resources) {
            if (str == null) {
                return "";
            }
            float floatValue = densityMultiplier(resources).floatValue();
            String[] splitUrlExtension = splitUrlExtension(str);
            return splitUrlExtension[0] + "_" + ((int) (320.0f * floatValue)) + "x" + ((int) (floatValue * 180.0f)) + "." + splitUrlExtension[1];
        }

        private static String getDefaultSize(int i, WindowManager windowManager) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                if (ScreenU.getDensityDpi(windowManager) < 240) {
                    return mStoreIconSizes.get(120);
                }
                return mStoreIconSizes.get(480);
            } else if (ScreenU.getDensityDpi(windowManager) < 240) {
                return mIconSizes.get(120);
            } else {
                return mIconSizes.get(640);
            }
        }

        public static String getNewImageUrl(String str, Resources resources, WindowManager windowManager) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("portrait")) {
                return parseScreenshots(str, windowManager);
            }
            return str.contains("_icon") ? parseIcon(str, resources, windowManager) : str;
        }

        private static String getThumbnailSize(int i, boolean z) {
            return !z ? i >= 640 ? "1024x640" : i >= 480 ? "768x480" : i >= baseLineXNotification ? "512x320" : i >= 240 ? "384x240" : i >= 213 ? "340x213" : i >= 160 ? "256x160" : "192x120" : i >= 640 ? "384x640" : i >= 480 ? "288x480" : i >= baseLineXNotification ? "192x320" : i >= 240 ? "144x240" : i >= 213 ? "127x213" : i >= 160 ? "96x160" : "72x120";
        }

        private static String getUserAvatarIconSize(WindowManager windowManager) {
            return ScreenU.getDensityDpi(windowManager) <= 240 ? "50x50" : "150x150";
        }

        private static String parseIcon(String str, Resources resources, WindowManager windowManager) {
            String generateSizeString;
            if (str == null) {
                return "";
            }
            try {
                if (!str.contains("_icon") || (generateSizeString = generateSizeString(resources, windowManager)) == null || generateSizeString.isEmpty()) {
                    return str;
                }
                String[] splitUrlExtension = splitUrlExtension(str);
                return splitUrlExtension[0] + "_" + generateSizeString + "." + splitUrlExtension[1];
            } catch (Exception e) {
                Logger.getInstance().mo12981e(TAG, (Throwable) e);
                throw e;
            }
        }

        private static String parseScreenshotUrl(String str, String str2, WindowManager windowManager, Resources resources) {
            String generateSizeStringScreenshotsdd = generateSizeStringScreenshotsdd(str2, windowManager, resources);
            String[] splitUrlExtension = splitUrlExtension(str);
            return splitUrlExtension[0] + "_" + generateSizeStringScreenshotsdd + "." + splitUrlExtension[1];
        }

        private static String parseScreenshots(String str, WindowManager windowManager) {
            if (str == null) {
                return "";
            }
            boolean z = str != null && str.equals("portrait");
            int densityDpi = ScreenU.getDensityDpi(windowManager);
            String[] splitUrlExtension = splitUrlExtension(str);
            return splitUrlExtension[0] + "_" + getThumbnailSize(densityDpi, z) + "." + splitUrlExtension[1];
        }

        public static String screenshotToThumb(String str, String str2, WindowManager windowManager, Resources resources) {
            try {
                if (str.contains("_screen")) {
                    return parseScreenshotUrl(str, str2, windowManager, resources);
                }
                String[] split = str.split("/");
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i != split.length - 1; i++) {
                    sb.append(split[i]);
                    sb.append("/");
                }
                sb.append("thumbs/mobile/");
                sb.append(split[split.length - 1]);
                return sb.toString();
            } catch (Exception e) {
                Logger.getInstance().mo12981e(TAG, (Throwable) e);
                throw e;
            }
        }

        private static String[] splitUrlExtension(String str) {
            return str.split("\\.(?=[^\\.]+$)");
        }
    }

    @Deprecated
    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$LocaleU */
    public static final class LocaleU {
        public static final Locale DEFAULT = Locale.getDefault();
    }

    @Deprecated
    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$ObservableU */
    public static class ObservableU {
        public static <T> C5368e.C5369c<T, T> applySchedulers() {
            return C4452a.f7668f;
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$RegexU */
    public static class RegexU {
        private static final String SPLIT_URL_EXTENSION = "\\.(?=[^\\.]+$)";
        private static final String STORE_ID_FROM_GET_URL = "store_id\\=(\\d+)";
        private static Pattern STORE_ID_FROM_GET_URL_PATTERN = null;
        private static final String STORE_NAME_FROM_GET_URL = "store_name\\/(.*?)\\/";
        private static Pattern STORE_NAME_FROM_GET_URL_PATTERN;

        public static Pattern getStoreIdFromGetUrlPattern() {
            if (STORE_ID_FROM_GET_URL_PATTERN == null) {
                STORE_ID_FROM_GET_URL_PATTERN = Pattern.compile(STORE_ID_FROM_GET_URL);
            }
            return STORE_ID_FROM_GET_URL_PATTERN;
        }

        public static Pattern getStoreNameFromGetUrlPattern() {
            if (STORE_NAME_FROM_GET_URL_PATTERN == null) {
                STORE_NAME_FROM_GET_URL_PATTERN = Pattern.compile(STORE_NAME_FROM_GET_URL);
            }
            return STORE_NAME_FROM_GET_URL_PATTERN;
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$ResourseU */
    public static class ResourseU {
        public static Drawable getDrawable(int i, Resources resources) {
            return resources.getDrawable(i);
        }

        public static int getInt(int i, Resources resources) {
            return resources.getInteger(i);
        }

        public static String getString(int i, Resources resources) {
            return StringU.getResString(i, resources);
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$ScreenU */
    public static final class ScreenU {
        public static final float REFERENCE_WIDTH_DPI = 360.0f;
        private static int displayWidthCacheLandscape = -1;
        private static int displayWidthCachePortrait = -1;
        private static ScreenUtilsCache screenWidthInDipCache = new ScreenUtilsCache();

        /* renamed from: cm.aptoide.pt.utils.AptoideUtils$ScreenU$ScreenUtilsCache */
        private static class ScreenUtilsCache {
            /* access modifiers changed from: private */
            public int orientation;
            /* access modifiers changed from: private */
            public float value;

            private ScreenUtilsCache() {
                this.orientation = -1;
            }

            public void set(int i, float f) {
                this.orientation = i;
                this.value = f;
            }
        }

        @Deprecated
        /* renamed from: cm.aptoide.pt.utils.AptoideUtils$ScreenU$Size */
        public enum Size {
            notfound,
            small,
            normal,
            large,
            xlarge;
            
            private static final String TAG = null;

            static {
                TAG = Size.class.getSimpleName();
            }

            public static Size lookup(String str) {
                try {
                    return valueOf(str);
                } catch (Exception e) {
                    Logger.getInstance().mo12981e(TAG, (Throwable) e);
                    return notfound;
                }
            }
        }

        public static int getCachedDisplayWidth(int i, WindowManager windowManager) {
            if (i == 2) {
                if (displayWidthCacheLandscape == -1) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    if (Build.VERSION.SDK_INT >= 13) {
                        Point point = new Point();
                        defaultDisplay.getSize(point);
                        displayWidthCacheLandscape = point.x;
                    } else {
                        displayWidthCacheLandscape = defaultDisplay.getWidth();
                    }
                }
                return displayWidthCacheLandscape;
            }
            if (displayWidthCachePortrait == -1) {
                Display defaultDisplay2 = windowManager.getDefaultDisplay();
                if (Build.VERSION.SDK_INT >= 13) {
                    Point point2 = new Point();
                    defaultDisplay2.getSize(point2);
                    displayWidthCachePortrait = point2.y;
                } else {
                    displayWidthCachePortrait = defaultDisplay2.getHeight();
                }
            }
            return displayWidthCachePortrait;
        }

        public static int getCurrentOrientation(Resources resources) {
            return resources.getConfiguration().orientation;
        }

        public static int getDensityDpi(WindowManager windowManager) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.densityDpi;
            if (i <= 120) {
                return 120;
            }
            if (i <= 160) {
                return 160;
            }
            if (i <= 213) {
                return 213;
            }
            if (i <= 240) {
                return 240;
            }
            if (i <= 320) {
                return 320;
            }
            return i <= 480 ? 480 : 640;
        }

        public static int getNumericScreenSize(Resources resources) {
            return (getScreenSizeInt(resources) + 1) * 100;
        }

        public static int getPixelsForDip(int i, Resources resources) {
            return (int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
        }

        public static String getScreenSize(Resources resources) {
            return Size.values()[getScreenSizeInt(resources)].name().toLowerCase(Locale.ENGLISH);
        }

        private static int getScreenSizeInt(Resources resources) {
            return resources.getConfiguration().screenLayout & 15;
        }

        @Deprecated
        public static String getScreenSizePixels(Resources resources) {
            Configuration configuration = resources.getConfiguration();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            double d = (double) configuration.screenWidthDp;
            double d2 = (double) displayMetrics.density;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d * d2;
            double d4 = (double) displayMetrics.heightPixels;
            Double.isNaN(d4);
            double d5 = (double) displayMetrics.widthPixels;
            Double.isNaN(d5);
            return ((int) (d3 + 0.5d)) + "x" + ((int) (((d4 * d3) / d5) + 0.5d));
        }

        public static float getScreenWidthInDip(WindowManager windowManager, Resources resources) {
            if (getCurrentOrientation(resources) != screenWidthInDipCache.orientation) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                screenWidthInDipCache.set(getCurrentOrientation(resources), ((float) displayMetrics.widthPixels) / displayMetrics.density);
            }
            return screenWidthInDipCache.value;
        }

        public static File takeScreenshot(Activity activity, String str, String str2) {
            FileUtils.createDir(str);
            View rootView = activity.getWindow().getDecorView().getRootView();
            rootView.setDrawingCacheEnabled(true);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
                rootView.setDrawingCacheEnabled(false);
                File file = new File(str, str2);
                try {
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                } catch (FileNotFoundException e) {
                    Logger instance = Logger.getInstance();
                    instance.mo12979e("FeedBackActivity-screenshot", "FileNotFoundException: " + e.getMessage());
                    return null;
                } catch (IOException e2) {
                    Logger instance2 = Logger.getInstance();
                    instance2.mo12979e("FeedBackActivity-screenshot", "IOException: " + e2.getMessage());
                    return null;
                }
            } catch (Exception e3) {
                Logger instance3 = Logger.getInstance();
                instance3.mo12979e("FeedBackActivity-screenshot", "Exception: " + e3.getMessage());
                return null;
            }
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$SocialLinksU */
    public static final class SocialLinksU {
        public static String getFacebookPageURL(int i, String str) {
            if (i < 3002850) {
                return str;
            }
            return "fb://facewebmodal/f?href=" + str;
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$StringU */
    public static final class StringU {
        public static String commaSeparatedValues(List<?> list) {
            if (list.size() <= 0) {
                return "";
            }
            String obj = list.get(0).toString();
            for (int i = 1; i < list.size(); i++) {
                obj = obj + "," + list.get(i).toString();
            }
            return obj;
        }

        public static String formatBytes(long j, boolean z) {
            if (j < ((long) 1024)) {
                return j + " B";
            }
            double d = (double) j;
            double d2 = (double) 1024;
            int log = (int) (Math.log(d) / Math.log(d2));
            Locale locale = Locale.ENGLISH;
            double pow = Math.pow(d2, (double) log);
            Double.isNaN(d);
            String format = String.format(locale, "%.1f %sB", new Object[]{Double.valueOf(d / pow), "KMGTPE".charAt(log - 1) + ""});
            if (!z) {
                return format;
            }
            return format + "/s";
        }

        public static String formatBytesToBits(long j, boolean z) {
            long j2 = j * 8;
            if (j2 < ((long) 1024)) {
                return j2 + " B";
            }
            double d = (double) j2;
            double d2 = (double) 1024;
            int log = (int) (Math.log(d) / Math.log(d2));
            Locale locale = Locale.ENGLISH;
            double pow = Math.pow(d2, (double) log);
            Double.isNaN(d);
            String format = String.format(locale, "%.1f %sb", new Object[]{Double.valueOf(d / pow), "KMGTPE".charAt(log - 1) + ""});
            if (!z) {
                return format;
            }
            return format + "ps";
        }

        public static String getFormattedString(int i, Resources resources, Object... objArr) {
            try {
                return resources.getString(i, objArr);
            } catch (UnknownFormatConversionException unused) {
                String resourceEntryName = resources.getResourceEntryName(i);
                String displayLanguage = Locale.getDefault().getDisplayLanguage();
                Logger instance = Logger.getInstance();
                instance.mo12979e("UnknownFormatConversion", "String: " + resourceEntryName + " Locale: " + displayLanguage);
                return ResourseU.getString(i, resources);
            }
        }

        public static String getResString(int i, Resources resources) {
            return resources.getString(i);
        }

        public static String join(Iterable<?> iterable, String str) {
            if (iterable == null) {
                return null;
            }
            return join(iterable.iterator(), str);
        }

        public static Map<String, String> splitQuery(URI uri) throws UnsupportedEncodingException {
            String[] split;
            int i;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String query = uri.getQuery();
            if (!(query == null || (split = query.split("&")) == null)) {
                for (String str : split) {
                    int indexOf = str.indexOf("=");
                    if (indexOf > 0 && (i = indexOf + 1) < str.length()) {
                        linkedHashMap.put(URLDecoder.decode(str.substring(0, indexOf), "UTF-8"), URLDecoder.decode(str.substring(i), "UTF-8"));
                    }
                }
            }
            return linkedHashMap;
        }

        public static String toString(Object obj) {
            return obj == null ? "" : obj.toString();
        }

        public static String withSuffix(long j) {
            if (j < 1000) {
                return String.valueOf(j);
            }
            double d = (double) j;
            int log = (int) (Math.log(d) / Math.log(1000.0d));
            Locale locale = Locale.ENGLISH;
            double pow = Math.pow(1000.0d, (double) log);
            Double.isNaN(d);
            return String.format(locale, "%d %c", new Object[]{Integer.valueOf((int) (d / pow)), Character.valueOf("kMBTPE".charAt(log - 1))});
        }

        public static String join(Iterator<?> it, String str) {
            if (it == null) {
                return null;
            }
            if (!it.hasNext()) {
                return "";
            }
            Object next = it.next();
            if (!it.hasNext()) {
                return toString(next);
            }
            StringBuilder sb = new StringBuilder(256);
            if (next != null) {
                sb.append(next);
            }
            while (it.hasNext()) {
                if (str != null) {
                    sb.append(str);
                }
                Object next2 = it.next();
                if (next2 != null) {
                    sb.append(next2);
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$SystemU */
    public static class SystemU {
        private static final String TAG = "SystemU";
        public static final String TERMINAL_INFO = (getModel() + "(" + getProduct() + ");v" + getRelease() + ";" + System.getProperty("os.arch"));

        public static void clearApplicationData(Context context) {
            File file = new File(context.getCacheDir().getParent());
            if (file.exists()) {
                for (String str : file.list()) {
                    if (!str.equals("lib")) {
                        deleteDir(new File(file, str));
                    }
                }
            }
        }

        public static boolean deleteDir(File file) {
            String[] list;
            if (!(file == null || !file.isDirectory() || (list = file.list()) == null)) {
                for (String file2 : list) {
                    if (!deleteDir(new File(file, file2))) {
                        return false;
                    }
                }
            }
            if (file == null || !file.delete()) {
                return false;
            }
            return true;
        }

        @TargetApi(21)
        public static String getAbis() {
            String[] strArr = getSdkVer() >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i]);
                if (i < strArr.length - 1) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public static List<PackageInfo> getAllInstalledApps(PackageManager packageManager) {
            return packageManager.getInstalledPackages(64);
        }

        public static String getApkIconPath(PackageInfo packageInfo) {
            return "android.resource://" + packageInfo.packageName + "/" + packageInfo.applicationInfo.icon;
        }

        public static String getApkLabel(PackageInfo packageInfo, PackageManager packageManager) {
            return packageInfo.applicationInfo.loadLabel(packageManager).toString();
        }

        public static String getCarrierName(TelephonyManager telephonyManager) {
            return telephonyManager.getNetworkOperatorName();
        }

        public static String getConnectionType(ConnectivityManager connectivityManager) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getTypeName() == null) {
                return "unknown";
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return "mobile";
            }
            if (type != 1) {
                return type != 9 ? "unknown" : "ethernet";
            }
            return "wifi";
        }

        public static String getCountryCode(Resources resources) {
            return resources.getConfiguration().locale.getLanguage() + "_" + resources.getConfiguration().locale.getCountry();
        }

        public static String getGlEsVer(ActivityManager activityManager) {
            return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
        }

        public static String getModel() {
            return Build.MODEL.replaceAll(";", " ");
        }

        public static PackageInfo getPackageInfo(String str, PackageManager packageManager) {
            try {
                return packageManager.getPackageInfo(str, 64);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }

        public static String getProduct() {
            return Build.PRODUCT.replace(";", " ");
        }

        public static String getRelease() {
            return Build.VERSION.RELEASE.replaceAll(";", " ");
        }

        public static int getSdkVer() {
            return Build.VERSION.SDK_INT;
        }

        @Deprecated
        public static List<PackageInfo> getUserInstalledApps(PackageManager packageManager) {
            LinkedList linkedList = new LinkedList();
            for (PackageInfo next : getAllInstalledApps(packageManager)) {
                if ((next.applicationInfo.flags & 1) == 0) {
                    linkedList.add(next);
                }
            }
            return linkedList;
        }

        @Deprecated
        public static boolean hasRoot() {
            boolean z;
            try {
                Process exec = Runtime.getRuntime().exec("su");
                DataOutputStream dataOutputStream = new DataOutputStream(exec.getOutputStream());
                DataInputStream dataInputStream = new DataInputStream(exec.getInputStream());
                dataOutputStream.writeBytes("id\n");
                dataOutputStream.flush();
                String readLine = dataInputStream.readLine();
                boolean z2 = true;
                if (readLine == null) {
                    Logger.getInstance().mo12975d("ROOT", "Can't get root access or denied by user");
                    z = false;
                    z2 = false;
                } else if (readLine.contains("uid=0")) {
                    Logger.getInstance().mo12975d("ROOT", "Root access granted");
                    z = true;
                } else {
                    Logger instance = Logger.getInstance();
                    instance.mo12975d("ROOT", "Root access rejected: " + readLine);
                    z = false;
                }
                if (z2) {
                    dataOutputStream.writeBytes("exit\n");
                    dataOutputStream.flush();
                }
                return z;
            } catch (Exception e) {
                Logger instance2 = Logger.getInstance();
                instance2.mo12975d("ROOT", "Root access rejected [" + e.getClass().getName() + "] : " + e.getMessage());
                return false;
            }
        }

        @Deprecated
        public static void hideKeyboard(Activity activity) {
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        }

        public static void openApp(String str, PackageManager packageManager, Context context) {
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                context.startActivity(launchIntentForPackage);
            }
        }

        public static List<ApkPermission> parsePermissions(Context context, List<String> list) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            List<PermissionGroupInfo> allPermissionGroups = packageManager.getAllPermissionGroups(0);
            for (String next : list) {
                for (PermissionGroupInfo next2 : allPermissionGroups) {
                    try {
                        for (PermissionInfo next3 : packageManager.queryPermissionsByGroup(next2.name, 0)) {
                            if (next3.name.equals(next)) {
                                arrayList.add(new ApkPermission(next2.loadLabel(packageManager).toString(), next3.loadLabel(packageManager).toString()));
                            }
                        }
                    } catch (Exception e) {
                        Logger.getInstance().mo12981e(TAG, (Throwable) e);
                        throw new RuntimeException(e);
                    }
                }
            }
            Collections.sort(arrayList, C4454b.f7670f);
            return arrayList;
        }

        public static File readLogs(String str, String str2, String str3) {
            String readLine;
            try {
                Process exec = Runtime.getRuntime().exec("logcat -d");
                FileUtils.createDir(str);
                File file = new File(str, str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Android Build Version: " + Build.VERSION.SDK_INT + "\n");
                sb.append("Build Model: " + Build.MODEL + "\n");
                sb.append("Device: " + Build.DEVICE + "\n");
                sb.append("Brand: " + Build.BRAND + "\n");
                sb.append("CPU: " + Build.CPU_ABI + "\n");
                if (str3 != null) {
                    sb.append("Extra: " + str3 + "\n");
                }
                sb.append("\nLogs:\n");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                    for (int i = 0; i < 100 && (readLine = bufferedReader.readLine()) != null; i++) {
                        sb.append(readLine + "\n");
                    }
                    fileOutputStream.write(sb.toString().getBytes());
                    return file;
                } catch (IOException e) {
                    Logger.getInstance().mo12981e(TAG, (Throwable) e);
                    return file;
                }
            } catch (IOException e2) {
                Logger instance = Logger.getInstance();
                instance.mo12979e("FeedBackActivity-readLogs", "IOException: " + e2.getMessage());
                return null;
            }
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$ThreadU */
    public static final class ThreadU {
        private static final String TAG = "cm.aptoide.pt.utils.AptoideUtils$ThreadU";

        public static String getStack() {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement append : Thread.currentThread().getStackTrace()) {
                sb.append(append);
                sb.append("\n");
            }
            return sb.toString();
        }

        public static boolean isUiThread() {
            return Looper.getMainLooper().getThread() == Thread.currentThread();
        }

        public static void runOnIoThread(Runnable runnable) {
            C5368e.m10257c(null).mo18644a(Schedulers.m10352io()).mo18655a(new C4456c(runnable), (C5378b<Throwable>) C4462e.f7676f);
        }

        public static void runOnUiThread(Runnable runnable) {
            if (isUiThread()) {
                runnable.run();
            } else {
                C5368e.m10257c(null).mo18644a(C5376a.m10346b()).mo18655a(new C4464f(runnable), (C5378b<Throwable>) C4458d.f7674f);
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m7461a(Throwable th) {
            Logger.getInstance().mo12981e(TAG, th);
            throw new RuntimeException(th);
        }
    }

    public static long getMIUITimestamp() {
        String systemProperty = getSystemProperty("ro.miui.version.code_time");
        if (systemProperty == null) {
            return -1;
        }
        try {
            return Long.parseLong(systemProperty);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @SuppressLint({"PrivateApi"})
    private static String getSystemProperty(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
        } catch (Exception e) {
            Logger.getInstance().mo12987w("AptoideUtils", e.getMessage());
            return null;
        }
    }

    public static boolean isDeviceMIUI() {
        return !TextUtils.isEmpty(getSystemProperty("ro.miui.ui.version.name"));
    }

    public static boolean isMIUIwithAABFix() {
        boolean z;
        String systemProperty = getSystemProperty("ro.miui.version.code_time");
        if (systemProperty != null) {
            try {
                if (Long.parseLong(systemProperty) > 1583942400) {
                    z = true;
                    if (!TextUtils.isEmpty(systemProperty) || !z) {
                        return false;
                    }
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        z = false;
        if (!TextUtils.isEmpty(systemProperty)) {
        }
        return false;
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$AlgorithmU */
    public static class AlgorithmU {
        private static final String TAG = "cm.aptoide.pt.utils.AptoideUtils$AlgorithmU";

        public static String computeHmacSha1(String str, String str2) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), "HmacSHA1");
                Mac instance = Mac.getInstance("HmacSHA1");
                instance.init(secretKeySpec);
                return convToHex(instance.doFinal(str.getBytes("UTF-8")));
            } catch (NoSuchAlgorithmException e) {
                Logger.getInstance().mo12981e(TAG, (Throwable) e);
                return "";
            } catch (UnsupportedEncodingException e2) {
                Logger.getInstance().mo12981e(TAG, (Throwable) e2);
                return "";
            } catch (InvalidKeyException e3) {
                Logger.getInstance().mo12981e(TAG, (Throwable) e3);
                return "";
            }
        }

        public static String computeMd5(PackageInfo packageInfo) {
            return computeMd5(new File(packageInfo.applicationInfo.sourceDir));
        }

        public static String computeSha1(String str) {
            try {
                return convToHex(computeSha1(str.getBytes("iso-8859-1")));
            } catch (UnsupportedEncodingException e) {
                Logger.getInstance().mo12980e(TAG, "computeSha1(String)", e);
                return "";
            }
        }

        public static String computeSha1WithColon(byte[] bArr) {
            return convToHexWithColon(computeSha1(bArr)).toUpperCase(Locale.ENGLISH);
        }

        private static String convToHex(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (byte b : bArr) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        }

        private static String convToHexWithColon(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i++) {
                byte b = (bArr[i] >>> 4) & 15;
                int i2 = 0;
                while (true) {
                    if (b < 0 || b > 9) {
                        sb.append((char) ((b - 10) + 97));
                    } else {
                        sb.append((char) (b + 48));
                    }
                    b = bArr[i] & 15;
                    int i3 = i2 + 1;
                    if (i2 >= 1) {
                        break;
                    }
                    i2 = i3;
                }
                if (i < bArr.length - 1) {
                    sb.append(":");
                }
            }
            return sb.toString();
        }

        @Deprecated
        public static int randomBetween(int i, int i2) {
            int i3 = i2 - i;
            if (i3 > 0) {
                return new Random().nextInt(i3 + 1) + i;
            }
            throw new IllegalStateException("Minimum < maximum");
        }

        public static String computeMd5(File file) {
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = new byte[CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES];
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                }
                byte[] digest = instance.digest();
                String bigInteger = new BigInteger(1, digest).toString(16);
                fileInputStream.close();
                if (bigInteger.length() != 33) {
                    String str = "";
                    for (int i = 1; i < 33 - bigInteger.length(); i++) {
                        str = str.concat("0");
                    }
                    bigInteger = str.concat(bigInteger);
                }
                Logger instance2 = Logger.getInstance();
                String str2 = TAG;
                instance2.mo12985v(str2, "computeMd5: duration: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                return bigInteger;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        private static byte[] computeSha1(byte[] bArr) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(bArr, 0, bArr.length);
                return instance.digest();
            } catch (NoSuchAlgorithmException e) {
                Logger.getInstance().mo12981e(TAG, (Throwable) e);
                return new byte[0];
            }
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$MathU */
    public static final class MathU {
        public static double clamp(double d, double d2, double d3) {
            return Math.min(Math.max(d, d2), d3);
        }

        private static int greatestCommonDivisor(int i, int i2) {
            while (true) {
                int i3 = i2;
                int i4 = i;
                i = i3;
                if (i <= 0) {
                    return i4;
                }
                i2 = i4 % i;
            }
        }

        public static int leastCommonMultiple(int[] iArr) {
            int i = iArr[0];
            for (int i2 = 1; i2 < iArr.length; i2++) {
                i = leastCommonMultiple(i, iArr[i2]);
            }
            return i;
        }

        public static double mapValueFromRangeToRange(double d, double d2, double d3, double d4, double d5) {
            return d4 + (((d - d2) / (d3 - d2)) * (d5 - d4));
        }

        private static int leastCommonMultiple(int i, int i2) {
            if (i == 0 && i2 == 0) {
                return 0;
            }
            return (Math.abs(i) / greatestCommonDivisor(i, i2)) * Math.abs(i2);
        }
    }

    /* renamed from: cm.aptoide.pt.utils.AptoideUtils$DateTimeU */
    public static class DateTimeU extends DateUtils {
        private static DateTimeU instance = null;
        private static String mTimestampLabelDaysAgo = null;
        private static String mTimestampLabelHourAgo = null;
        private static String mTimestampLabelHoursAgo = null;
        private static String mTimestampLabelJustNow = null;
        private static String mTimestampLabelMinutesAgo = null;
        private static String mTimestampLabelMonthAgo = null;
        private static String mTimestampLabelMonthsAgo = null;
        private static String mTimestampLabelToday = null;
        private static String mTimestampLabelWeekAgo = null;
        private static String mTimestampLabelWeeksAgo = null;
        private static String mTimestampLabelYearAgo = null;
        private static String mTimestampLabelYearsAgo = null;
        private static String mTimestampLabelYesterday = null;
        private static final long millisInADay = 86400000;
        private static String[] weekdays = new DateFormatSymbols().getWeekdays();
        private final Context context;

        private DateTimeU(Context context2) {
            this.context = context2;
        }

        public static DateTimeU getInstance(Context context2) {
            if (instance == null) {
                instance = new DateTimeU(context2);
                mTimestampLabelYesterday = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_yesterday, context2.getResources());
                mTimestampLabelToday = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_today, context2.getResources());
                mTimestampLabelJustNow = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_just_now, context2.getResources());
                mTimestampLabelMinutesAgo = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_minutes_ago, context2.getResources());
                mTimestampLabelHoursAgo = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_hours_ago, context2.getResources());
                mTimestampLabelHourAgo = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_hour_ago, context2.getResources());
                mTimestampLabelDaysAgo = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_days_ago, context2.getResources());
                mTimestampLabelWeekAgo = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_week_ago2, context2.getResources());
                mTimestampLabelWeeksAgo = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_weeks_ago, context2.getResources());
                mTimestampLabelMonthAgo = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_month_ago, context2.getResources());
                mTimestampLabelMonthsAgo = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_months_ago, context2.getResources());
                mTimestampLabelYearAgo = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_year_ago, context2.getResources());
                mTimestampLabelYearsAgo = ResourseU.getString(C4449R.string.WidgetProvider_timestamp_years_ago, context2.getResources());
            }
            return instance;
        }

        private static boolean isYesterday(long j) {
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j);
            Calendar instance3 = Calendar.getInstance();
            instance3.add(5, -1);
            if (instance3.get(1) == instance2.get(1) && instance3.get(6) == instance2.get(6)) {
                return true;
            }
            return false;
        }

        public String getTimeDiffAll(Context context2, long j, Resources resources) {
            long time = new Date().getTime() - j;
            if (isYesterday(j) || DateUtils.isToday(j)) {
                getTimeDiffString(j, context2, resources);
                return getTimeDiffString(j, context2, resources);
            } else if (time < 604800000) {
                int intValue = Double.valueOf(Math.ceil((double) (time / 86400000))).intValue();
                if (intValue == 1) {
                    return mTimestampLabelYesterday;
                }
                return StringU.getFormattedString(C4449R.string.WidgetProvider_timestamp_days_ago, resources, Integer.valueOf(intValue));
            } else if (time < 2419200000L) {
                int intValue2 = Double.valueOf(Math.ceil((double) (time / 604800000))).intValue();
                if (intValue2 == 1) {
                    return mTimestampLabelWeekAgo;
                }
                return StringU.getFormattedString(C4449R.string.WidgetProvider_timestamp_weeks_ago, resources, Integer.valueOf(intValue2));
            } else if (time < 29030400000L) {
                int intValue3 = Double.valueOf(Math.ceil((double) (time / 2419200000L))).intValue();
                if (intValue3 == 1) {
                    return mTimestampLabelMonthAgo;
                }
                return StringU.getFormattedString(C4449R.string.WidgetProvider_timestamp_months_ago, resources, Integer.valueOf(intValue3));
            } else {
                int intValue4 = Double.valueOf(Math.ceil((double) (time / 29030400000L))).intValue();
                if (intValue4 == 1) {
                    return mTimestampLabelYearAgo;
                }
                return StringU.getFormattedString(C4449R.string.WidgetProvider_timestamp_years_ago, resources, Integer.valueOf(intValue4));
            }
        }

        public String getTimeDiffString(Context context2, long j, Resources resources) {
            long j2 = j;
            Resources resources2 = resources;
            Calendar instance2 = Calendar.getInstance();
            Calendar instance3 = Calendar.getInstance();
            instance3.setTimeInMillis(j2);
            long timeInMillis = instance2.getTimeInMillis() - instance3.getTimeInMillis();
            long j3 = timeInMillis / 3600000;
            long j4 = (timeInMillis / 60000) - (60 * j3);
            long j5 = timeInMillis / 1000;
            boolean isToday = DateUtils.isToday(j);
            boolean isYesterday = isYesterday(j);
            if (j3 <= 0 || j3 >= 12) {
                if (j3 <= 0) {
                    if (j4 <= 0) {
                        return mTimestampLabelJustNow;
                    }
                    return StringU.getFormattedString(C4449R.string.WidgetProvider_timestamp_minutes_ago, resources2, Long.valueOf(j4));
                } else if (isToday) {
                    return mTimestampLabelToday;
                } else {
                    if (isYesterday) {
                        return mTimestampLabelYesterday;
                    }
                    if (instance2.getTimeInMillis() - j2 < 518400000) {
                        return weekdays[instance3.get(7)];
                    }
                    return DateUtils.formatDateTime(context2, j2, 131072);
                }
            } else if (j3 == 1) {
                return StringU.getFormattedString(C4449R.string.WidgetProvider_timestamp_hour_ago, resources2, Long.valueOf(j3));
            } else {
                return StringU.getFormattedString(C4449R.string.WidgetProvider_timestamp_hours_ago, resources2, Long.valueOf(j3));
            }
        }

        public String getTimeDiffString(long j, Context context2, Resources resources) {
            return getTimeDiffString(context2, j, resources);
        }
    }
}
