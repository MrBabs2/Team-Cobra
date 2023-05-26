package kotlin.p392j0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import kotlin.p220g0.C9143a;
import kotlin.p220g0.C9146c;
import kotlin.p391i0.C12079h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\n\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a:\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001aE\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b\u001c\u001a:\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0006\u001a4\u0010 \u001a\u0002H!\"\f\b\u0000\u0010\"*\u00020\u0002*\u0002H!\"\u0004\b\u0001\u0010!*\u0002H\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$H\b¢\u0006\u0002\u0010%\u001a4\u0010&\u001a\u0002H!\"\f\b\u0000\u0010\"*\u00020\u0002*\u0002H!\"\u0004\b\u0001\u0010!*\u0002H\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$H\b¢\u0006\u0002\u0010%\u001a&\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a;\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b)\u001a&\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010*\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010+\u001a\u00020\u0006*\u00020\u00022\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010+\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\r\u0010.\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u0010/\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u00100\u001a\u00020\r*\u00020\u0002H\b\u001a \u00101\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00102\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00103\u001a\u000204*\u00020\u0002H\u0002\u001a&\u00105\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u00105\u001a\u00020\u0006*\u00020\u00022\u0006\u0010*\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u00106\u001a\u00020\u0006*\u00020\u00022\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u00106\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0010\u00107\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u0002\u001a\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u0002\u001a\u0015\u0010;\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\f\u001a\u000f\u0010<\u001a\u00020\n*\u0004\u0018\u00010\nH\b\u001a\u001c\u0010=\u001a\u00020\u0002*\u00020\u00022\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010=\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010@\u001a\u00020\u0002*\u00020\u00022\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010@\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001aG\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000108*\u00020\u00022\u000e\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010F\u001a=\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000108*\u00020\u00022\u0006\u0010B\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0002\bE\u001a4\u0010G\u001a\u00020\r*\u00020\u00022\u0006\u0010H\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0012\u0010J\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u0002\u001a\u0012\u0010J\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u0002\u001a\u001a\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006\u001a\u0012\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u001d\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\b\u001a\u0015\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0001H\b\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a+\u0010Q\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\b\u0010R\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00020SH\b\u001a\u001d\u0010Q\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\nH\b\u001a$\u0010V\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010V\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010X\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010X\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Y\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Y\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Z\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Z\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001d\u0010[\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\nH\b\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0002\u001a\u001a\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u0002\u001a%\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0002H\b\u001a\u001d\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u0002H\b\u001a=\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0012\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006¢\u0006\u0002\u0010^\u001a0\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\n\u0010B\u001a\u00020-\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006\u001a/\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0006\u0010P\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0002\b_\u001a%\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010D\u001a\u00020\u0006H\b\u001a=\u0010`\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u00022\u0012\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006¢\u0006\u0002\u0010a\u001a0\u0010`\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u00022\n\u0010B\u001a\u00020-\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006\u001a\u001c\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a$\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u001d\u0010c\u001a\u00020\u0002*\u00020\n2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\b\u001a\u001f\u0010f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u0006H\b\u001a\u0012\u0010f\u001a\u00020\n*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u0012\u0010f\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0001\u001a\u001c\u0010g\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010g\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010h\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010h\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010i\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010i\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010j\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010j\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\n\u0010k\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010k\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010k\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010k\u001a\u00020\n*\u00020\nH\b\u001a!\u0010k\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010k\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\n\u0010m\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010m\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010m\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010m\u001a\u00020\n*\u00020\nH\b\u001a!\u0010m\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010m\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\n\u0010n\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010n\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010n\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010n\u001a\u00020\n*\u00020\nH\b\u001a!\u0010n\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010n\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006o"}, mo16641d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, mo16642k = 5, mo16643mv = {1, 1, 16}, mo16645xi = 1, mo16646xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.j0.w */
/* compiled from: Strings.kt */
class C12131w extends C12130v {

    /* renamed from: kotlin.j0.w$a */
    /* compiled from: Strings.kt */
    static final class C12132a extends C10203k implements C9117p<CharSequence, Integer, C10221n<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ char[] f31894f;

        /* renamed from: g */
        final /* synthetic */ boolean f31895g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12132a(char[] cArr, boolean z) {
            super(2);
            this.f31894f = cArr;
            this.f31895g = z;
        }

        /* renamed from: a */
        public final C10221n<Integer, Integer> mo38748a(CharSequence charSequence, int i) {
            C10202j.m34178b(charSequence, "$receiver");
            int a = C12131w.m40065a(charSequence, this.f31894f, i, this.f31895g);
            if (a < 0) {
                return null;
            }
            return C10481t.m35502a(Integer.valueOf(a), 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo38748a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: kotlin.j0.w$b */
    /* compiled from: Strings.kt */
    static final class C12133b extends C10203k implements C9117p<CharSequence, Integer, C10221n<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ List f31896f;

        /* renamed from: g */
        final /* synthetic */ boolean f31897g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12133b(List list, boolean z) {
            super(2);
            this.f31896f = list;
            this.f31897g = z;
        }

        /* renamed from: a */
        public final C10221n<Integer, Integer> mo38749a(CharSequence charSequence, int i) {
            C10202j.m34178b(charSequence, "$receiver");
            C10221n a = C12131w.m40100b(charSequence, (Collection<String>) this.f31896f, i, this.f31897g, false);
            if (a != null) {
                return C10481t.m35502a(a.mo35391c(), Integer.valueOf(((String) a.mo35392d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo38749a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: kotlin.j0.w$c */
    /* compiled from: Strings.kt */
    static final class C12134c extends C10203k implements C9113l<C9146c, String> {

        /* renamed from: f */
        final /* synthetic */ CharSequence f31898f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12134c(CharSequence charSequence) {
            super(1);
            this.f31898f = charSequence;
        }

        /* renamed from: a */
        public final String invoke(C9146c cVar) {
            C10202j.m34178b(cVar, "it");
            return C12131w.m40066a(this.f31898f, cVar);
        }
    }

    /* renamed from: kotlin.j0.w$d */
    /* compiled from: Strings.kt */
    static final class C12135d extends C10203k implements C9113l<C9146c, String> {

        /* renamed from: f */
        final /* synthetic */ CharSequence f31899f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12135d(CharSequence charSequence) {
            super(1);
            this.f31899f = charSequence;
        }

        /* renamed from: a */
        public final String invoke(C9146c cVar) {
            C10202j.m34178b(cVar, "it");
            return C12131w.m40066a(this.f31899f, cVar);
        }
    }

    /* renamed from: b */
    public static C9146c m40095b(CharSequence charSequence) {
        C10202j.m34178b(charSequence, "$this$indices");
        return new C9146c(0, charSequence.length() - 1);
    }

    /* renamed from: c */
    public static int m40105c(CharSequence charSequence) {
        C10202j.m34178b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: d */
    public static String m40111d(String str, char c, String str2) {
        C10202j.m34178b(str, "$this$substringBeforeLast");
        C10202j.m34178b(str2, "missingDelimiterValue");
        int b = m40087b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(0, b);
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public static final List<String> m40114e(CharSequence charSequence) {
        C10202j.m34178b(charSequence, "$this$lines");
        return C12090n.m39931g(m40113d(charSequence));
    }

    /* renamed from: f */
    public static CharSequence m40115f(CharSequence charSequence) {
        C10202j.m34178b(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = C12098a.m39942a(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!a) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: a */
    public static final String m40066a(CharSequence charSequence, C9146c cVar) {
        C10202j.m34178b(charSequence, "$this$substring");
        C10202j.m34178b(cVar, "range");
        return charSequence.subSequence(cVar.mo33495c().intValue(), cVar.mo33494b().intValue() + 1).toString();
    }

    /* renamed from: b */
    public static /* synthetic */ String m40094b(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m40108c(str, str2, str3);
    }

    /* renamed from: c */
    public static /* synthetic */ String m40107c(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m40106c(str, c, str2);
    }

    /* renamed from: a */
    public static /* synthetic */ String m40068a(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m40067a(str, c, str2);
    }

    /* renamed from: b */
    public static String m40093b(String str, String str2, String str3) {
        C10202j.m34178b(str, "$this$substringAfter");
        C10202j.m34178b(str2, "delimiter");
        C10202j.m34178b(str3, "missingDelimiterValue");
        int a = m40064a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(a + str2.length(), str.length());
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static final String m40106c(String str, char c, String str2) {
        C10202j.m34178b(str, "$this$substringBefore");
        C10202j.m34178b(str2, "missingDelimiterValue");
        int a = m40060a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(0, a);
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public static String m40112d(String str, String str2, String str3) {
        C10202j.m34178b(str, "$this$substringBeforeLast");
        C10202j.m34178b(str2, "delimiter");
        C10202j.m34178b(str3, "missingDelimiterValue");
        int b = m40089b((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (b == -1) {
            return str3;
        }
        String substring = str.substring(0, b);
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static final String m40067a(String str, char c, String str2) {
        C10202j.m34178b(str, "$this$substringAfter");
        C10202j.m34178b(str2, "missingDelimiterValue");
        int a = m40060a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(a + 1, str.length());
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static /* synthetic */ String m40092b(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m40091b(str, c, str2);
    }

    /* renamed from: c */
    public static final String m40108c(String str, String str2, String str3) {
        C10202j.m34178b(str, "$this$substringBefore");
        C10202j.m34178b(str2, "delimiter");
        C10202j.m34178b(str3, "missingDelimiterValue");
        int a = m40064a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(0, a);
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public static final C12079h<String> m40113d(CharSequence charSequence) {
        C10202j.m34178b(charSequence, "$this$lineSequence");
        return m40099b(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: a */
    public static /* synthetic */ String m40070a(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m40093b(str, str2, str3);
    }

    /* renamed from: b */
    public static String m40091b(String str, char c, String str2) {
        C10202j.m34178b(str, "$this$substringAfterLast");
        C10202j.m34178b(str2, "missingDelimiterValue");
        int b = m40087b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(b + 1, str.length());
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a */
    public static String m40069a(String str, CharSequence charSequence) {
        C10202j.m34178b(str, "$this$removePrefix");
        C10202j.m34178b(charSequence, "prefix");
        if (!m40104b((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m40110c(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40109c(charSequence, c, z);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m40102b(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40101b(charSequence, c, z);
    }

    /* renamed from: c */
    public static final boolean m40109c(CharSequence charSequence, char c, boolean z) {
        C10202j.m34178b(charSequence, "$this$startsWith");
        return charSequence.length() > 0 && C12099b.m39943a(charSequence.charAt(0), c, z);
    }

    /* renamed from: a */
    public static final boolean m40083a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C10202j.m34178b(charSequence, "$this$regionMatchesImpl");
        C10202j.m34178b(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C12099b.m39943a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m40101b(CharSequence charSequence, char c, boolean z) {
        C10202j.m34178b(charSequence, "$this$endsWith");
        return charSequence.length() > 0 && C12099b.m39943a(charSequence.charAt(m40105c(charSequence)), c, z);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m40104b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40103b(charSequence, charSequence2, z);
    }

    /* renamed from: a */
    public static final int m40065a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C10202j.m34178b(charSequence, "$this$indexOfAny");
        C10202j.m34178b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C9150f.m29847a(i, 0);
            int c = m40105c(charSequence);
            if (a > c) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        break;
                    } else if (C12099b.m39943a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return a;
                }
                if (a == c) {
                    return -1;
                }
                a++;
            }
        } else {
            return ((String) charSequence).indexOf(C10519k.m35612a(cArr), i);
        }
    }

    /* renamed from: b */
    public static final boolean m40103b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C10202j.m34178b(charSequence, "$this$startsWith");
        C10202j.m34178b(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C12130v.m40056c((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m40083a(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: b */
    public static final int m40090b(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C10202j.m34178b(charSequence, "$this$lastIndexOfAny");
        C10202j.m34178b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int b = C9150f.m29851b(i, m40105c(charSequence)); b >= 0; b--) {
                char charAt = charSequence.charAt(b);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C12099b.m39943a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return b;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C10519k.m35612a(cArr), i);
    }

    /* renamed from: a */
    static /* synthetic */ int m40062a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m40061a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: a */
    private static final int m40061a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C9143a aVar;
        if (!z2) {
            aVar = new C9146c(C9150f.m29847a(i, 0), C9150f.m29851b(i2, charSequence.length()));
        } else {
            aVar = C9150f.m29853c(C9150f.m29851b(i, m40105c(charSequence)), C9150f.m29847a(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int first = aVar.getFirst();
            int last = aVar.getLast();
            int a = aVar.mo33483a();
            if (a >= 0) {
                if (first > last) {
                    return -1;
                }
            } else if (first < last) {
                return -1;
            }
            while (true) {
                if (m40083a(charSequence2, 0, charSequence, first, charSequence2.length(), z)) {
                    return first;
                }
                if (first == last) {
                    return -1;
                }
                first += a;
            }
        } else {
            int first2 = aVar.getFirst();
            int last2 = aVar.getLast();
            int a2 = aVar.mo33483a();
            if (a2 >= 0) {
                if (first2 > last2) {
                    return -1;
                }
            } else if (first2 < last2) {
                return -1;
            }
            while (true) {
                if (C12130v.m40048a((String) charSequence2, 0, (String) charSequence, first2, charSequence2.length(), z)) {
                    return first2;
                }
                if (first2 == last2) {
                    return -1;
                }
                first2 += a2;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C10221n<Integer, String> m40100b(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        T t;
        T t2;
        if (z || collection.size() != 1) {
            C9143a cVar = !z2 ? new C9146c(C9150f.m29847a(i, 0), charSequence.length()) : C9150f.m29853c(C9150f.m29851b(i, m40105c(charSequence)), 0);
            if (charSequence instanceof String) {
                int first = cVar.getFirst();
                int last = cVar.getLast();
                int a = cVar.mo33483a();
                if (a < 0 ? first >= last : first <= last) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str = (String) t2;
                            if (C12130v.m40048a(str, 0, (String) charSequence, first, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) t2;
                        if (str2 == null) {
                            if (first == last) {
                                break;
                            }
                            first += a;
                        } else {
                            return C10481t.m35502a(Integer.valueOf(first), str2);
                        }
                    }
                }
            } else {
                int first2 = cVar.getFirst();
                int last2 = cVar.getLast();
                int a2 = cVar.mo33483a();
                if (a2 < 0 ? first2 >= last2 : first2 <= last2) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            String str3 = (String) t;
                            if (m40083a((CharSequence) str3, 0, charSequence, first2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) t;
                        if (str4 == null) {
                            if (first2 == last2) {
                                break;
                            }
                            first2 += a2;
                        } else {
                            return C10481t.m35502a(Integer.valueOf(first2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C10539w.m35810j(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i2 = i;
        int a3 = !z2 ? m40064a(charSequence2, str6, i2, false, 4, (Object) null) : m40089b(charSequence2, str6, i2, false, 4, (Object) null);
        if (a3 < 0) {
            return null;
        }
        return C10481t.m35502a(Integer.valueOf(a3), str5);
    }

    /* renamed from: a */
    public static /* synthetic */ int m40060a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m40059a(charSequence, c, i, z);
    }

    /* renamed from: a */
    public static final int m40059a(CharSequence charSequence, char c, int i, boolean z) {
        C10202j.m34178b(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m40065a(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ int m40064a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m40063a(charSequence, str, i, z);
    }

    /* renamed from: a */
    public static final int m40063a(CharSequence charSequence, String str, int i, boolean z) {
        C10202j.m34178b(charSequence, "$this$indexOf");
        C10202j.m34178b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m40062a(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m40085a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40084a(charSequence, charSequence2, z);
    }

    /* renamed from: a */
    public static final boolean m40084a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C10202j.m34178b(charSequence, "$this$contains");
        C10202j.m34178b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m40064a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m40062a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static /* synthetic */ int m40087b(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m40105c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m40086b(charSequence, c, i, z);
    }

    /* renamed from: b */
    public static final int m40086b(CharSequence charSequence, char c, int i, boolean z) {
        C10202j.m34178b(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m40090b(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m40082a(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m40081a(charSequence, c, z);
    }

    /* renamed from: a */
    public static final boolean m40081a(CharSequence charSequence, char c, boolean z) {
        C10202j.m34178b(charSequence, "$this$contains");
        return m40060a(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* renamed from: b */
    public static /* synthetic */ int m40089b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m40105c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m40088b(charSequence, str, i, z);
    }

    /* renamed from: a */
    static /* synthetic */ C12079h m40077a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m40076a(charSequence, cArr, i, z, i2);
    }

    /* renamed from: b */
    public static final int m40088b(CharSequence charSequence, String str, int i, boolean z) {
        C10202j.m34178b(charSequence, "$this$lastIndexOf");
        C10202j.m34178b(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m40061a(charSequence, (CharSequence) str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: a */
    private static final C12079h<C9146c> m40076a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C12101d(charSequence, i, i2, new C12132a(cArr, z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    /* renamed from: a */
    static /* synthetic */ C12079h m40079a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m40078a(charSequence, strArr, i, z, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ C12079h m40099b(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m40098b(charSequence, strArr, z, i);
    }

    /* renamed from: a */
    private static final C12079h<C9146c> m40078a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C12101d(charSequence, i, i2, new C12133b(C10516j.m35587a((T[]) strArr), z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    /* renamed from: b */
    public static final C12079h<String> m40098b(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C10202j.m34178b(charSequence, "$this$splitToSequence");
        C10202j.m34178b(strArr, "delimiters");
        return C12090n.m39926d(m40079a(charSequence, strArr, 0, z, i, 2, (Object) null), new C12134c(charSequence));
    }

    /* renamed from: b */
    public static /* synthetic */ C12079h m40097b(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m40096b(charSequence, cArr, z, i);
    }

    /* renamed from: b */
    public static final C12079h<String> m40096b(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C10202j.m34178b(charSequence, "$this$splitToSequence");
        C10202j.m34178b(cArr, "delimiters");
        return C12090n.m39926d(m40077a(charSequence, cArr, 0, z, i, 2, (Object) null), new C12135d(charSequence));
    }

    /* renamed from: a */
    public static /* synthetic */ List m40075a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m40074a(charSequence, strArr, z, i);
    }

    /* renamed from: a */
    public static final List<String> m40074a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C10202j.m34178b(charSequence, "$this$split");
        C10202j.m34178b(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m40071a(charSequence, str, z, i);
            }
        }
        Iterable<C9146c> c = C12090n.m39923c(m40079a(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C10531p.m35750a(c, 10));
        for (C9146c a : c) {
            arrayList.add(m40066a(charSequence, a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ List m40073a(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m40072a(charSequence, cArr, z, i);
    }

    /* renamed from: a */
    public static final List<String> m40072a(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C10202j.m34178b(charSequence, "$this$split");
        C10202j.m34178b(cArr, "delimiters");
        if (cArr.length == 1) {
            return m40071a(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C9146c> c = C12090n.m39923c(m40077a(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C10531p.m35750a(c, 10));
        for (C9146c a : c) {
            arrayList.add(m40066a(charSequence, a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static final List<String> m40071a(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int a = m40063a(charSequence, str, 0, z);
            if (a == -1 || i == 1) {
                return C10527n.m35729a(charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = C9150f.m29851b(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                if ((z2 && arrayList.size() == i - 1) || (a = m40063a(charSequence, str, i2, z)) == -1) {
                    arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                }
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                break;
            } while ((a = m40063a(charSequence, str, i2, z)) == -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }
}
