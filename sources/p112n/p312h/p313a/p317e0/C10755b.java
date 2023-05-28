package p112n.p312h.p313a.p317e0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p112n.p312h.p313a.p318f0.C10763c;

/* renamed from: n.h.a.e0.b */
/* compiled from: FileDownloadRandomAccessFile */
public class C10755b implements C10754a {

    /* renamed from: a */
    private final RandomAccessFile f28820a;

    /* renamed from: n.h.a.e0.b$a */
    /* compiled from: FileDownloadRandomAccessFile */
    public static class C10756a implements C10763c.C10766c {
        /* renamed from: a */
        public C10754a mo36499a(File file) throws FileNotFoundException {
            return new C10755b(file);
        }

        /* renamed from: a */
        public boolean mo36500a() {
            return true;
        }
    }

    C10755b(File file) throws FileNotFoundException {
        this.f28820a = new RandomAccessFile(file, "rw");
    }

    /* renamed from: a */
    public void mo36494a() throws IOException {
        this.f28820a.getFD().sync();
    }

    /* renamed from: b */
    public void mo36496b(long j) throws IOException {
        this.f28820a.seek(j);
    }

    public void close() throws IOException {
        this.f28820a.close();
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f28820a.write(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo36495a(long j) throws IOException {
        this.f28820a.setLength(j);
    }
}
