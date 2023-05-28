package androidx.room.p006t;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* renamed from: androidx.room.t.d */
/* compiled from: FileUtil */
public class C0778d {
    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public static void m3541a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            } else {
                fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
