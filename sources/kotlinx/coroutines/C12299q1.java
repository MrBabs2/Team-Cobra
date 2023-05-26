package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9069g;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.C12277k1;
import kotlinx.coroutines.p393g2.C12219g;
import kotlinx.coroutines.p393g2.C12220h;
import kotlinx.coroutines.p393g2.C12226k;
import kotlinx.coroutines.p393g2.C12229n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020X2\u00020\u00172\u00030\u00012\u00030Å\u0001:\u0006Ô\u0001Õ\u0001Ö\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010&\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010\"J\u0019\u0010)\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\"J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\"J!\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002072\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b=\u0010>J(\u0010C\u001a\u00020@2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\rH\b¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u0001082\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u00060#j\u0002`$¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00060#j\u0002`$H\u0016¢\u0006\u0004\bJ\u0010IJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u0002072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\rH\u0014¢\u0006\u0004\bU\u0010\"J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0010¢\u0006\u0004\bV\u0010+J\u0019\u0010\\\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010XH\u0000¢\u0006\u0004\bZ\u0010[JF\u0010e\u001a\u00020d2\u0006\u0010]\u001a\u00020\u00012\u0006\u0010^\u001a\u00020\u00012'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110_j\u0002`b¢\u0006\u0004\be\u0010fJ6\u0010e\u001a\u00020d2'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110_j\u0002`b¢\u0006\u0004\be\u0010gJ\u0013\u0010h\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0004\bh\u0010\u001dJ\u000f\u0010i\u001a\u00020\u0001H\u0002¢\u0006\u0004\bi\u0010jJ\u0013\u0010k\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0004\bk\u0010\u001dJ&\u0010n\u001a\u00020m2\u0014\u0010l\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110_H\b¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bp\u0010-J\u0019\u0010r\u001a\u00020\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bq\u0010(J\u001b\u0010t\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bs\u0010-JD\u0010u\u001a\u0006\u0012\u0002\b\u00030\t2'\u0010c\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b`\u0012\b\ba\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110_j\u0002`b2\u0006\u0010]\u001a\u00020\u0001H\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010x\u001a\u00020/H\u0010¢\u0006\u0004\bw\u00101J\u001f\u0010y\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\by\u0010zJ2\u0010|\u001a\u00020\u0011\"\u000e\b\u0000\u0010{\u0018\u0001*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\b¢\u0006\u0004\b|\u0010zJ\u0019\u0010]\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b]\u0010+J\u0019\u0010}\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b}\u0010\u0016J\u0010\u0010\u0001\u001a\u00020\u0011H\u0010¢\u0006\u0004\b~\u0010J\u001a\u0010\u0001\u001a\u00020\u00112\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0014\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001e\u0010\u0001\u001a\u00020\u00112\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tH\u0002¢\u0006\u0006\b\u0001\u0010\u0001JI\u0010\u0001\u001a\u00020\u0011\"\u0005\b\u0000\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010l\u001a\u0019\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050_ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001JX\u0010\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010{\"\u0005\b\u0001\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u00012$\u0010l\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001e\u0010\u0001\u001a\u00020\u00112\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0006\b\u0001\u0010\u0001JX\u0010\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010{\"\u0005\b\u0001\u0010\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u00012$\u0010l\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\u0001¢\u0006\u0005\b\u0001\u0010jJ\u001d\u0010\u0001\u001a\u00030\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020/2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020/H\u0007¢\u0006\u0005\b\u0001\u00101J\u0011\u0010\u0001\u001a\u00020/H\u0016¢\u0006\u0005\b\u0001\u00101J$\u0010 \u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\"\u0010¢\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J(\u0010¤\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J&\u0010¦\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J-\u0010¨\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002072\u0006\u0010\u0018\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0010¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010«\u0001\u001a\u0004\u0018\u000108*\u00030ª\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001f\u0010­\u0001\u001a\u00020\u0011*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0005\b­\u0001\u0010zJ&\u0010®\u0001\u001a\u00060#j\u0002`$*\u00020\r2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0006\b®\u0001\u0010¯\u0001R\u001d\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020X0°\u00018F@\u0006¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u001a\u0010µ\u0001\u001a\u0004\u0018\u00010\r8D@\u0004X\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010OR\u0018\u0010·\u0001\u001a\u00020\u00018D@\u0004X\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010jR\u0018\u0010¹\u0001\u001a\u00020\u00018P@\u0010X\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010jR\u0018\u0010º\u0001\u001a\u00020\u00018V@\u0016X\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010jR\u0015\u0010»\u0001\u001a\u00020\u00018F@\u0006¢\u0006\u0007\u001a\u0005\b»\u0001\u0010jR\u0015\u0010¼\u0001\u001a\u00020\u00018F@\u0006¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010jR\u0015\u0010½\u0001\u001a\u00020\u00018F@\u0006¢\u0006\u0007\u001a\u0005\b½\u0001\u0010jR\u0018\u0010¾\u0001\u001a\u00020\u00018T@\u0014X\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010jR\u001b\u0010Â\u0001\u001a\u0007\u0012\u0002\b\u00030¿\u00018F@\u0006¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ä\u0001\u001a\u00020\u00018P@\u0010X\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010jR\u0017\u0010È\u0001\u001a\u00030Å\u00018F@\u0006¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R.\u0010Î\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010É\u0001\u001a\u0004\u0018\u00010\u00198@@@X\u000e¢\u0006\u0010\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058@@\u0000X\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010LR \u0010Ñ\u0001\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00058B@\u0002X\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010>R\u001d\u0010Ò\u0001\u001a\u00020\u0001*\u0002038B@\u0002X\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006×\u0001"}, mo16641d2 = {"Lkotlinx/coroutines/JobSupport;", "", "active", "<init>", "(Z)V", "", "expect", "Lkotlinx/coroutines/NodeList;", "list", "Lkotlinx/coroutines/JobNode;", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "", "rootCause", "", "exceptions", "", "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", "state", "afterCompletion", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternal", "awaitSuspend", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "cancelInternal", "(Ljava/lang/Throwable;)V", "cancelMakeCompleting", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancelParent", "", "cancellationExceptionMessage", "()Ljava/lang/String;", "childCancelled", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/ChildHandleNode;", "lastChild", "proposedUpdate", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "message", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "finalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;)Ljava/lang/Object;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", "exception", "handleJobException", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "Lkotlinx/coroutines/Job;", "parent", "initParentJobInternal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/Job;)V", "initParentJobInternal", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "joinInternal", "()Z", "joinSuspend", "block", "", "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "makeCancelling", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "makeCompletingOnce", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "nameString$kotlinx_coroutines_core", "nameString", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", "T", "notifyHandlers", "onCompletionInternal", "onStartInternal$kotlinx_coroutines_core", "()V", "onStartInternal", "Lkotlinx/coroutines/ParentJob;", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "removeNode$kotlinx_coroutines_core", "removeNode", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", "start", "", "startInternal", "(Ljava/lang/Object;)I", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "toString", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "notifyCompletion", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.q1 */
/* compiled from: JobSupport.kt */
public class C12299q1 implements C12277k1, C12289o, C12320w1 {

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f32114f = AtomicReferenceFieldUpdater.newUpdater(C12299q1.class, Object.class, "_state");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: kotlinx.coroutines.q1$a */
    /* compiled from: JobSupport.kt */
    private static final class C12300a extends C12296p1<C12277k1> {

        /* renamed from: j */
        private final C12299q1 f32115j;

        /* renamed from: k */
        private final C12301b f32116k;

        /* renamed from: l */
        private final C12286n f32117l;

        /* renamed from: m */
        private final Object f32118m;

        public C12300a(C12299q1 q1Var, C12301b bVar, C12286n nVar, Object obj) {
            super(nVar.f32098j);
            this.f32115j = q1Var;
            this.f32116k = bVar;
            this.f32117l = nVar;
            this.f32118m = obj;
        }

        /* renamed from: b */
        public void mo38940b(Throwable th) {
            this.f32115j.m40550a(this.f32116k, this.f32117l, this.f32118m);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38940b((Throwable) obj);
            return C10483v.f28357a;
        }

        public String toString() {
            return "ChildCompletion[" + this.f32117l + ", " + this.f32118m + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.q1$b */
    /* compiled from: JobSupport.kt */
    private static final class C12301b implements C12201f1 {
        private volatile Object _exceptionsHolder = null;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: f */
        private final C12311t1 f32119f;

        public C12301b(C12311t1 t1Var, boolean z, Throwable th) {
            this.f32119f = t1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: g */
        private final ArrayList<Throwable> m40601g() {
            return new ArrayList<>(4);
        }

        /* renamed from: h */
        private final Object m40602h() {
            return this._exceptionsHolder;
        }

        /* renamed from: a */
        public final void mo39020a(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: b */
        public boolean mo38848b() {
            return mo39018a() == null;
        }

        /* renamed from: c */
        public C12311t1 mo38849c() {
            return this.f32119f;
        }

        /* renamed from: d */
        public final boolean mo39023d() {
            return mo39018a() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
        /* renamed from: e */
        public final boolean mo39024e() {
            return this._isCompleting;
        }

        /* renamed from: f */
        public final boolean mo39025f() {
            return m40602h() == C12305r1.f32129e;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo39023d() + ", completing=" + mo39024e() + ", rootCause=" + mo39018a() + ", exceptions=" + m40602h() + ", list=" + mo38849c() + ']';
        }

        /* renamed from: a */
        public final Throwable mo39018a() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: b */
        public final List<Throwable> mo39021b(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object h = m40602h();
            if (h == null) {
                arrayList = m40601g();
            } else if (h instanceof Throwable) {
                ArrayList<Throwable> g = m40601g();
                g.add(h);
                arrayList = g;
            } else if (h instanceof ArrayList) {
                arrayList = (ArrayList) h;
            } else {
                throw new IllegalStateException(("State is " + h).toString());
            }
            Throwable a = mo39018a();
            if (a != null) {
                arrayList.add(0, a);
            }
            if (th != null && (!C10202j.m34176a((Object) th, (Object) a))) {
                arrayList.add(th);
            }
            m40600a((Object) C12305r1.f32129e);
            return arrayList;
        }

        /* renamed from: c */
        public final void mo39022c(Throwable th) {
            this._rootCause = th;
        }

        /* renamed from: a */
        private final void m40600a(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public final void mo39019a(Throwable th) {
            Throwable a = mo39018a();
            if (a == null) {
                mo39022c(th);
            } else if (th != a) {
                Object h = m40602h();
                if (h == null) {
                    m40600a((Object) th);
                } else if (h instanceof Throwable) {
                    if (th != h) {
                        ArrayList<Throwable> g = m40601g();
                        g.add(h);
                        g.add(th);
                        m40600a((Object) g);
                    }
                } else if (h instanceof ArrayList) {
                    ((ArrayList) h).add(th);
                } else {
                    throw new IllegalStateException(("State is " + h).toString());
                }
            }
        }
    }

    /* renamed from: kotlinx.coroutines.q1$c */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C12302c extends C12220h.C12221a {

        /* renamed from: d */
        final /* synthetic */ C12299q1 f32120d;

        /* renamed from: e */
        final /* synthetic */ Object f32121e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12302c(C12220h hVar, C12220h hVar2, C12299q1 q1Var, Object obj) {
            super(hVar2);
            this.f32120d = q1Var;
            this.f32121e = obj;
        }

        /* renamed from: a */
        public Object mo38864c(C12220h hVar) {
            if (this.f32120d.mo39013h() == this.f32121e) {
                return null;
            }
            return C12219g.m40265a();
        }
    }

    public C12299q1(boolean z) {
        this._state = z ? C12305r1.f32131g : C12305r1.f32130f;
        this._parentHandle = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006d, code lost:
        if (r2 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006f, code lost:
        m40552a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0072, code lost:
        r7 = m40545a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0076, code lost:
        if (r7 == null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007c, code lost:
        if (m40560b(r1, r7, r8) == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0080, code lost:
        return kotlinx.coroutines.C12305r1.f32126b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0085, code lost:
        return m40541a(r1, r8);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m40561c(kotlinx.coroutines.C12201f1 r7, java.lang.Object r8) {
        /*
            r6 = this;
            kotlinx.coroutines.t1 r0 = r6.m40556b((kotlinx.coroutines.C12201f1) r7)
            if (r0 == 0) goto L_0x0089
            boolean r1 = r7 instanceof kotlinx.coroutines.C12299q1.C12301b
            r2 = 0
            if (r1 != 0) goto L_0x000d
            r1 = r2
            goto L_0x000e
        L_0x000d:
            r1 = r7
        L_0x000e:
            kotlinx.coroutines.q1$b r1 = (kotlinx.coroutines.C12299q1.C12301b) r1
            if (r1 == 0) goto L_0x0013
            goto L_0x0019
        L_0x0013:
            kotlinx.coroutines.q1$b r1 = new kotlinx.coroutines.q1$b
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x0019:
            monitor-enter(r1)
            boolean r3 = r1.mo39024e()     // Catch:{ all -> 0x0086 }
            if (r3 == 0) goto L_0x0026
            kotlinx.coroutines.g2.o r7 = kotlinx.coroutines.C12305r1.f32125a     // Catch:{ all -> 0x0086 }
            monitor-exit(r1)
            return r7
        L_0x0026:
            r3 = 1
            r1.mo39020a((boolean) r3)     // Catch:{ all -> 0x0086 }
            if (r1 == r7) goto L_0x003a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f32114f     // Catch:{ all -> 0x0086 }
            boolean r4 = r4.compareAndSet(r6, r7, r1)     // Catch:{ all -> 0x0086 }
            if (r4 != 0) goto L_0x003a
            kotlinx.coroutines.g2.o r7 = kotlinx.coroutines.C12305r1.f32127c     // Catch:{ all -> 0x0086 }
            monitor-exit(r1)
            return r7
        L_0x003a:
            boolean r4 = kotlinx.coroutines.C12248i0.m40396a()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x004e
            boolean r4 = r1.mo39025f()     // Catch:{ all -> 0x0086 }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x0086 }
            r7.<init>()     // Catch:{ all -> 0x0086 }
            throw r7     // Catch:{ all -> 0x0086 }
        L_0x004e:
            boolean r4 = r1.mo39023d()     // Catch:{ all -> 0x0086 }
            boolean r5 = r8 instanceof kotlinx.coroutines.C12303r     // Catch:{ all -> 0x0086 }
            if (r5 != 0) goto L_0x0058
            r5 = r2
            goto L_0x0059
        L_0x0058:
            r5 = r8
        L_0x0059:
            kotlinx.coroutines.r r5 = (kotlinx.coroutines.C12303r) r5     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0062
            java.lang.Throwable r5 = r5.f32123a     // Catch:{ all -> 0x0086 }
            r1.mo39019a((java.lang.Throwable) r5)     // Catch:{ all -> 0x0086 }
        L_0x0062:
            java.lang.Throwable r5 = r1.mo39018a()     // Catch:{ all -> 0x0086 }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x006a
            r2 = r5
        L_0x006a:
            kotlin.v r3 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0086 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0072
            r6.m40552a((kotlinx.coroutines.C12311t1) r0, (java.lang.Throwable) r2)
        L_0x0072:
            kotlinx.coroutines.n r7 = r6.m40545a((kotlinx.coroutines.C12201f1) r7)
            if (r7 == 0) goto L_0x0081
            boolean r7 = r6.m40560b(r1, r7, r8)
            if (r7 == 0) goto L_0x0081
            kotlinx.coroutines.g2.o r7 = kotlinx.coroutines.C12305r1.f32126b
            return r7
        L_0x0081:
            java.lang.Object r7 = r6.m40541a((kotlinx.coroutines.C12299q1.C12301b) r1, (java.lang.Object) r8)
            return r7
        L_0x0086:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L_0x0089:
            kotlinx.coroutines.g2.o r7 = kotlinx.coroutines.C12305r1.f32127c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12299q1.m40561c(kotlinx.coroutines.f1, java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    private final Object mo38817e(Object obj) {
        Object a;
        do {
            Object h = mo39013h();
            if (!(h instanceof C12201f1) || ((h instanceof C12301b) && ((C12301b) h).mo39024e())) {
                return C12305r1.f32125a;
            }
            a = m40540a(h, (Object) new C12303r(mo38818f(obj), false, 2, (DefaultConstructorMarker) null));
        } while (a == C12305r1.f32127c);
        return a;
    }

    /* renamed from: f */
    private final boolean m40564f(Throwable th) {
        if (mo38901j()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C12283m g = mo39012g();
        if (g == null || g == C12314u1.f32138f) {
            return z;
        }
        if (g.mo38986a(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final String m40568j(Object obj) {
        if (obj instanceof C12301b) {
            C12301b bVar = (C12301b) obj;
            if (bVar.mo39023d()) {
                return "Cancelling";
            }
            if (bVar.mo39024e()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof C12201f1)) {
            return obj instanceof C12303r ? "Cancelled" : "Completed";
        } else {
            if (((C12201f1) obj).mo38848b()) {
                return "Active";
            }
            return "New";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38900a(Object obj) {
    }

    /* renamed from: b */
    public boolean mo38813b() {
        Object h = mo39013h();
        return (h instanceof C12201f1) && ((C12201f1) h).mo38848b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo38814c() {
        return "Job was cancelled";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo39010c(Throwable th) {
        return false;
    }

    public /* synthetic */ void cancel() {
        mo38982a((CancellationException) null);
    }

    /* renamed from: d */
    public final CancellationException mo38984d() {
        Object h = mo39013h();
        if (h instanceof C12301b) {
            Throwable a = ((C12301b) h).mo39018a();
            if (a != null) {
                CancellationException a2 = mo39002a(a, C12256j0.m40409a((Object) this) + " is cancelling");
                if (a2 != null) {
                    return a2;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (h instanceof C12201f1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (h instanceof C12303r) {
            return m40544a(this, ((C12303r) h).f32123a, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(C12256j0.m40409a((Object) this) + " has completed normally", (Throwable) null, this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo38815d(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo39011e(Throwable th) {
    }

    /* renamed from: e */
    public boolean mo38988e() {
        return true;
    }

    /* renamed from: f */
    public boolean mo38989f() {
        return false;
    }

    public <R> R fold(R r, C9117p<? super R, ? super C9069g.C9072b, ? extends R> pVar) {
        return C12277k1.C12278a.m40492a(this, r, pVar);
    }

    /* renamed from: g */
    public final C12283m mo39012g() {
        return (C12283m) this._parentHandle;
    }

    public <E extends C9069g.C9072b> E get(C9069g.C9074c<E> cVar) {
        return C12277k1.C12278a.m40493a((C12277k1) this, cVar);
    }

    public final C9069g.C9074c<?> getKey() {
        return C12277k1.f32093e;
    }

    /* renamed from: h */
    public final Object mo39013h() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C12226k)) {
                return obj;
            }
            ((C12226k) obj).mo38859a((Object) this);
        }
    }

    /* renamed from: i */
    public final boolean mo39014i() {
        return !(mo39013h() instanceof C12201f1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo38901j() {
        return false;
    }

    /* renamed from: k */
    public String mo38819k() {
        return C12256j0.m40409a((Object) this);
    }

    /* renamed from: l */
    public CancellationException mo39015l() {
        Throwable th;
        Object h = mo39013h();
        CancellationException cancellationException = null;
        if (h instanceof C12301b) {
            th = ((C12301b) h).mo39018a();
        } else if (h instanceof C12303r) {
            th = ((C12303r) h).f32123a;
        } else if (!(h instanceof C12201f1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + h).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new JobCancellationException("Parent job is " + m40568j(h), th, this);
    }

    /* renamed from: m */
    public void mo38820m() {
    }

    public C9069g minusKey(C9069g.C9074c<?> cVar) {
        return C12277k1.C12278a.m40498b(this, cVar);
    }

    /* renamed from: n */
    public final String mo39016n() {
        return mo38819k() + '{' + m40568j(mo39013h()) + '}';
    }

    public C9069g plus(C9069g gVar) {
        return C12277k1.C12278a.m40494a((C12277k1) this, gVar);
    }

    public final boolean start() {
        int i;
        do {
            i = m40567i(mo39013h());
            if (i == 0) {
                return false;
            }
        } while (i != 1);
        return true;
    }

    public String toString() {
        return mo39016n() + '@' + C12256j0.m40411b(this);
    }

    /* renamed from: g */
    private final Throwable m40565g(Object obj) {
        if (!(obj instanceof C12303r)) {
            obj = null;
        }
        C12303r rVar = (C12303r) obj;
        if (rVar != null) {
            return rVar.f32123a;
        }
        return null;
    }

    /* renamed from: i */
    private final int m40567i(Object obj) {
        if (obj instanceof C12319w0) {
            if (((C12319w0) obj).mo38848b()) {
                return 0;
            }
            if (!f32114f.compareAndSet(this, obj, C12305r1.f32131g)) {
                return -1;
            }
            mo38820m();
            return 1;
        } else if (!(obj instanceof C12196e1)) {
            return 0;
        } else {
            if (!f32114f.compareAndSet(this, obj, ((C12196e1) obj).mo38849c())) {
                return -1;
            }
            mo38820m();
            return 1;
        }
    }

    /* renamed from: b */
    private final boolean m40559b(C12201f1 f1Var, Object obj) {
        if (C12248i0.m40396a()) {
            if (!((f1Var instanceof C12319w0) || (f1Var instanceof C12296p1))) {
                throw new AssertionError();
            }
        }
        if (C12248i0.m40396a() && !(!(obj instanceof C12303r))) {
            throw new AssertionError();
        } else if (!f32114f.compareAndSet(this, f1Var, C12305r1.m40623a(obj))) {
            return false;
        } else {
            mo39011e((Throwable) null);
            mo38815d(obj);
            m40549a(f1Var, obj);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo39005a(C12283m mVar) {
        this._parentHandle = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        m40552a(((kotlinx.coroutines.C12299q1.C12301b) r2).mo38849c(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        return kotlinx.coroutines.C12305r1.m40624a();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m40566h(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo39013h()
            boolean r3 = r2 instanceof kotlinx.coroutines.C12299q1.C12301b
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.q1$b r3 = (kotlinx.coroutines.C12299q1.C12301b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo39025f()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.g2.o r7 = kotlinx.coroutines.C12305r1.f32128d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            kotlinx.coroutines.q1$b r3 = (kotlinx.coroutines.C12299q1.C12301b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo39023d()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0032
        L_0x0025:
            if (r1 == 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            java.lang.Throwable r1 = r6.mo38818f((java.lang.Object) r7)     // Catch:{ all -> 0x004f }
        L_0x002c:
            r7 = r2
            kotlinx.coroutines.q1$b r7 = (kotlinx.coroutines.C12299q1.C12301b) r7     // Catch:{ all -> 0x004f }
            r7.mo39019a((java.lang.Throwable) r1)     // Catch:{ all -> 0x004f }
        L_0x0032:
            r7 = r2
            kotlinx.coroutines.q1$b r7 = (kotlinx.coroutines.C12299q1.C12301b) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.mo39018a()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003e
            r0 = r7
        L_0x003e:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x004a
            kotlinx.coroutines.q1$b r2 = (kotlinx.coroutines.C12299q1.C12301b) r2
            kotlinx.coroutines.t1 r7 = r2.mo38849c()
            r6.m40552a((kotlinx.coroutines.C12311t1) r7, (java.lang.Throwable) r0)
        L_0x004a:
            kotlinx.coroutines.g2.o r7 = kotlinx.coroutines.C12305r1.f32125a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof kotlinx.coroutines.C12201f1
            if (r3 == 0) goto L_0x00a6
            if (r1 == 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            java.lang.Throwable r1 = r6.mo38818f((java.lang.Object) r7)
        L_0x005d:
            r3 = r2
            kotlinx.coroutines.f1 r3 = (kotlinx.coroutines.C12201f1) r3
            boolean r4 = r3.mo38848b()
            if (r4 == 0) goto L_0x0071
            boolean r2 = r6.m40555a((kotlinx.coroutines.C12201f1) r3, (java.lang.Throwable) r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.g2.o r7 = kotlinx.coroutines.C12305r1.f32125a
            return r7
        L_0x0071:
            kotlinx.coroutines.r r3 = new kotlinx.coroutines.r
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.m40540a((java.lang.Object) r2, (java.lang.Object) r3)
            kotlinx.coroutines.g2.o r4 = kotlinx.coroutines.C12305r1.f32125a
            if (r3 == r4) goto L_0x008b
            kotlinx.coroutines.g2.o r2 = kotlinx.coroutines.C12305r1.f32127c
            if (r3 != r2) goto L_0x008a
            goto L_0x0002
        L_0x008a:
            return r3
        L_0x008b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Cannot happen in "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x00a6:
            kotlinx.coroutines.g2.o r7 = kotlinx.coroutines.C12305r1.f32128d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12299q1.m40566h(java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo39004a(C12277k1 k1Var) {
        if (C12248i0.m40396a()) {
            if (!(mo39012g() == null)) {
                throw new AssertionError();
            }
        }
        if (k1Var == null) {
            mo39005a((C12283m) C12314u1.f32138f);
            return;
        }
        k1Var.start();
        C12283m a = k1Var.mo38980a((C12289o) this);
        mo39005a(a);
        if (mo39014i()) {
            a.dispose();
            mo39005a((C12283m) C12314u1.f32138f);
        }
    }

    /* renamed from: f */
    private final Throwable mo38818f(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            if (obj != null) {
                return (Throwable) obj;
            }
            return new JobCancellationException(mo38814c(), (Throwable) null, this);
        } else if (obj != null) {
            return ((C12320w1) obj).mo39015l();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: d */
    public void mo38816d(Throwable th) {
        throw th;
    }

    /* renamed from: b */
    private final void m40557b(C12296p1<?> p1Var) {
        p1Var.mo38876a((C12220h) new C12311t1());
        f32114f.compareAndSet(this, p1Var, p1Var.mo38878e());
    }

    /* renamed from: a */
    private final Object m40541a(C12301b bVar, Object obj) {
        boolean d;
        Throwable a;
        boolean z = true;
        if (C12248i0.m40396a()) {
            if (!(mo39013h() == bVar)) {
                throw new AssertionError();
            }
        }
        if (C12248i0.m40396a() && !(!bVar.mo39025f())) {
            throw new AssertionError();
        } else if (!C12248i0.m40396a() || bVar.mo39024e()) {
            C12303r rVar = (C12303r) (!(obj instanceof C12303r) ? null : obj);
            Throwable th = rVar != null ? rVar.f32123a : null;
            synchronized (bVar) {
                d = bVar.mo39023d();
                List<Throwable> b = bVar.mo39021b(th);
                a = m40543a(bVar, (List<? extends Throwable>) b);
                if (a != null) {
                    m40548a(a, (List<? extends Throwable>) b);
                }
            }
            if (!(a == null || a == th)) {
                obj = new C12303r(a, false, 2, (DefaultConstructorMarker) null);
            }
            if (a != null) {
                if (!m40564f(a) && !mo39010c(a)) {
                    z = false;
                }
                if (z) {
                    if (obj != null) {
                        ((C12303r) obj).mo39029b();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            if (!d) {
                mo39011e(a);
            }
            mo38815d(obj);
            boolean compareAndSet = f32114f.compareAndSet(this, bVar, C12305r1.m40623a(obj));
            if (!C12248i0.m40396a() || compareAndSet) {
                m40549a((C12201f1) bVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public boolean mo39008b(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo39007b((Object) th) || !mo38988e()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo39007b(Object obj) {
        Object a = C12305r1.f32125a;
        if (mo38989f() && (a = mo38817e(obj)) == C12305r1.f32126b) {
            return true;
        }
        if (a == C12305r1.f32125a) {
            a = m40566h(obj);
        }
        if (a == C12305r1.f32125a || a == C12305r1.f32126b) {
            return true;
        }
        if (a == C12305r1.f32128d) {
            return false;
        }
        mo38900a(a);
        return true;
    }

    /* renamed from: c */
    public final Object mo39009c(Object obj) {
        Object a;
        do {
            a = m40540a(mo39013h(), obj);
            if (a == C12305r1.f32125a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, " + "but is being completed with " + obj, m40565g(obj));
            }
        } while (a == C12305r1.f32127c);
        return a;
    }

    /* renamed from: b */
    private final C12311t1 m40556b(C12201f1 f1Var) {
        C12311t1 c = f1Var.mo38849c();
        if (c != null) {
            return c;
        }
        if (f1Var instanceof C12319w0) {
            return new C12311t1();
        }
        if (f1Var instanceof C12296p1) {
            m40557b((C12296p1<?>) (C12296p1) f1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + f1Var).toString());
    }

    /* renamed from: b */
    private final boolean m40560b(C12301b bVar, C12286n nVar, Object obj) {
        while (C12277k1.C12278a.m40495a(nVar.f32098j, false, false, new C12300a(this, bVar, nVar, obj), 1, (Object) null) == C12314u1.f32138f) {
            nVar = m40546a((C12220h) nVar);
            if (nVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final Throwable m40543a(C12301b bVar, List<? extends Throwable> list) {
        T t;
        boolean z;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(((Throwable) t) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof TimeoutCancellationException) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) t2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (bVar.mo39023d()) {
            return new JobCancellationException(mo38814c(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private final void m40558b(C12311t1 t1Var, Throwable th) {
        Object d = t1Var.mo38877d();
        if (d != null) {
            CompletionHandlerException completionHandlerException = null;
            for (C12220h hVar = (C12220h) d; !C10202j.m34176a((Object) hVar, (Object) t1Var); hVar = hVar.mo38878e()) {
                if (hVar instanceof C12296p1) {
                    C12296p1 p1Var = (C12296p1) hVar;
                    try {
                        p1Var.mo38940b(th);
                    } catch (Throwable th2) {
                        if (completionHandlerException != null) {
                            C9099c.m29803a(completionHandlerException, th2);
                            if (completionHandlerException != null) {
                            }
                        }
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + p1Var + " for " + this, th2);
                        C10483v vVar = C10483v.f28357a;
                    }
                }
            }
            if (completionHandlerException != null) {
                mo38816d((Throwable) completionHandlerException);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    private final void m40548a(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable b = !C12248i0.m40399d() ? th : C12229n.m40316b(th);
            for (Throwable th2 : list) {
                if (C12248i0.m40399d()) {
                    th2 = C12229n.m40316b(th2);
                }
                if (th2 != th && th2 != b && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C9099c.m29803a(th, th2);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m40549a(C12201f1 f1Var, Object obj) {
        C12283m g = mo39012g();
        if (g != null) {
            g.dispose();
            mo39005a((C12283m) C12314u1.f32138f);
        }
        Throwable th = null;
        if (!(obj instanceof C12303r)) {
            obj = null;
        }
        C12303r rVar = (C12303r) obj;
        if (rVar != null) {
            th = rVar.f32123a;
        }
        if (f1Var instanceof C12296p1) {
            try {
                ((C12296p1) f1Var).mo38940b(th);
            } catch (Throwable th2) {
                mo38816d((Throwable) new CompletionHandlerException("Exception in completion handler " + f1Var + " for " + this, th2));
            }
        } else {
            C12311t1 c = f1Var.mo38849c();
            if (c != null) {
                m40558b(c, th);
            }
        }
    }

    /* renamed from: a */
    private final void m40552a(C12311t1 t1Var, Throwable th) {
        mo39011e(th);
        Object d = t1Var.mo38877d();
        if (d != null) {
            CompletionHandlerException completionHandlerException = null;
            for (C12220h hVar = (C12220h) d; !C10202j.m34176a((Object) hVar, (Object) t1Var); hVar = hVar.mo38878e()) {
                if (hVar instanceof C12282l1) {
                    C12296p1 p1Var = (C12296p1) hVar;
                    try {
                        p1Var.mo38940b(th);
                    } catch (Throwable th2) {
                        if (completionHandlerException != null) {
                            C9099c.m29803a(completionHandlerException, th2);
                            if (completionHandlerException != null) {
                            }
                        }
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + p1Var + " for " + this, th2);
                        C10483v vVar = C10483v.f28357a;
                    }
                }
            }
            if (completionHandlerException != null) {
                mo38816d((Throwable) completionHandlerException);
            }
            m40564f(th);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    public static /* synthetic */ CancellationException m40544a(C12299q1 q1Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return q1Var.mo39002a(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final CancellationException mo39002a(Throwable th, String str) {
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = mo38814c();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: a */
    private final C12296p1<?> m40547a(C9113l<? super Throwable, C10483v> lVar, boolean z) {
        boolean z2 = true;
        C12282l1 l1Var = null;
        if (z) {
            if (lVar instanceof C12282l1) {
                l1Var = lVar;
            }
            C12282l1 l1Var2 = l1Var;
            if (l1Var2 != null) {
                if (C12248i0.m40396a()) {
                    if (l1Var2.f32112i != this) {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                if (l1Var2 != null) {
                    return l1Var2;
                }
            }
            return new C12249i1(this, lVar);
        }
        if (lVar instanceof C12296p1) {
            l1Var = lVar;
        }
        C12296p1<?> p1Var = l1Var;
        if (p1Var != null) {
            if (C12248i0.m40396a()) {
                if (p1Var.f32112i != this || (p1Var instanceof C12282l1)) {
                    z2 = false;
                }
                if (!z2) {
                    throw new AssertionError();
                }
            }
            if (p1Var != null) {
                return p1Var;
            }
        }
        return new C12257j1(this, lVar);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.e1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m40553a(kotlinx.coroutines.C12319w0 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.t1 r0 = new kotlinx.coroutines.t1
            r0.<init>()
            boolean r1 = r3.mo38848b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.e1 r1 = new kotlinx.coroutines.e1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f32114f
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12299q1.m40553a(kotlinx.coroutines.w0):void");
    }

    /* renamed from: a */
    public void mo39003a(Throwable th) {
        mo39007b((Object) th);
    }

    /* renamed from: a */
    public final void mo38990a(C12320w1 w1Var) {
        mo39007b((Object) w1Var);
    }

    /* renamed from: a */
    private final boolean m40555a(C12201f1 f1Var, Throwable th) {
        if (C12248i0.m40396a() && !(!(f1Var instanceof C12301b))) {
            throw new AssertionError();
        } else if (!C12248i0.m40396a() || f1Var.mo38848b()) {
            C12311t1 b = m40556b(f1Var);
            if (b == null) {
                return false;
            }
            if (!f32114f.compareAndSet(this, f1Var, new C12301b(b, false, th))) {
                return false;
            }
            m40552a(b, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private final Object m40540a(Object obj, Object obj2) {
        if (!(obj instanceof C12201f1)) {
            return C12305r1.f32125a;
        }
        if ((!(obj instanceof C12319w0) && !(obj instanceof C12296p1)) || (obj instanceof C12286n) || (obj2 instanceof C12303r)) {
            return m40561c((C12201f1) obj, obj2);
        }
        if (m40559b((C12201f1) obj, obj2)) {
            return obj2;
        }
        return C12305r1.f32127c;
    }

    /* renamed from: a */
    private final C12286n m40545a(C12201f1 f1Var) {
        C12286n nVar = (C12286n) (!(f1Var instanceof C12286n) ? null : f1Var);
        if (nVar != null) {
            return nVar;
        }
        C12311t1 c = f1Var.mo38849c();
        if (c != null) {
            return m40546a((C12220h) c);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m40550a(C12301b bVar, C12286n nVar, Object obj) {
        if (C12248i0.m40396a()) {
            if (!(mo39013h() == bVar)) {
                throw new AssertionError();
            }
        }
        C12286n a = m40546a((C12220h) nVar);
        if (a == null || !m40560b(bVar, a, obj)) {
            mo38900a(m40541a(bVar, obj));
        }
    }

    /* renamed from: a */
    private final C12286n m40546a(C12220h hVar) {
        while (hVar.mo38873g()) {
            hVar = hVar.mo38879f();
        }
        while (true) {
            hVar = hVar.mo38878e();
            if (!hVar.mo38873g()) {
                if (hVar instanceof C12286n) {
                    return (C12286n) hVar;
                }
                if (hVar instanceof C12311t1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    public final C12283m mo38980a(C12289o oVar) {
        C12313u0 a = C12277k1.C12278a.m40495a(this, true, false, new C12286n(this, oVar), 2, (Object) null);
        if (a != null) {
            return (C12283m) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* renamed from: a */
    public final C12313u0 mo38981a(boolean z, boolean z2, C9113l<? super Throwable, C10483v> lVar) {
        Throwable th;
        Throwable th2 = null;
        C12296p1<?> p1Var = null;
        while (true) {
            Object h = mo39013h();
            if (h instanceof C12319w0) {
                C12319w0 w0Var = (C12319w0) h;
                if (w0Var.mo38848b()) {
                    if (p1Var == null) {
                        p1Var = m40547a(lVar, z);
                    }
                    if (f32114f.compareAndSet(this, h, p1Var)) {
                        return p1Var;
                    }
                } else {
                    m40553a(w0Var);
                }
            } else if (h instanceof C12201f1) {
                C12311t1 c = ((C12201f1) h).mo38849c();
                if (c != null) {
                    C12313u0 u0Var = C12314u1.f32138f;
                    if (!z || !(h instanceof C12301b)) {
                        th = null;
                    } else {
                        synchronized (h) {
                            th = ((C12301b) h).mo39018a();
                            if (th == null || ((lVar instanceof C12286n) && !((C12301b) h).mo39024e())) {
                                if (p1Var == null) {
                                    p1Var = m40547a(lVar, z);
                                }
                                if (m40554a(h, c, p1Var)) {
                                    if (th == null) {
                                        return p1Var;
                                    }
                                    u0Var = p1Var;
                                }
                            }
                            C10483v vVar = C10483v.f28357a;
                        }
                    }
                    if (th != null) {
                        if (z2) {
                            lVar.invoke(th);
                        }
                        return u0Var;
                    }
                    if (p1Var == null) {
                        p1Var = m40547a(lVar, z);
                    }
                    if (m40554a(h, c, p1Var)) {
                        return p1Var;
                    }
                } else if (h != null) {
                    m40557b((C12296p1<?>) (C12296p1) h);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                }
            } else {
                if (z2) {
                    if (!(h instanceof C12303r)) {
                        h = null;
                    }
                    C12303r rVar = (C12303r) h;
                    if (rVar != null) {
                        th2 = rVar.f32123a;
                    }
                    lVar.invoke(th2);
                }
                return C12314u1.f32138f;
            }
        }
    }

    /* renamed from: a */
    private final boolean m40554a(Object obj, C12311t1 t1Var, C12296p1<?> p1Var) {
        int a;
        C12302c cVar = new C12302c(p1Var, p1Var, this, obj);
        do {
            a = t1Var.mo38879f().mo38875a(p1Var, t1Var, cVar);
            if (a == 1) {
                return true;
            }
        } while (a != 2);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39006a(kotlinx.coroutines.C12296p1<?> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo39013h()
            boolean r1 = r0 instanceof kotlinx.coroutines.C12296p1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f32114f
            kotlinx.coroutines.w0 r2 = kotlinx.coroutines.C12305r1.f32131g
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof kotlinx.coroutines.C12201f1
            if (r1 == 0) goto L_0x0027
            kotlinx.coroutines.f1 r0 = (kotlinx.coroutines.C12201f1) r0
            kotlinx.coroutines.t1 r0 = r0.mo38849c()
            if (r0 == 0) goto L_0x0027
            r4.mo38874h()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12299q1.mo39006a(kotlinx.coroutines.p1):void");
    }

    /* renamed from: a */
    public void mo38982a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo38814c(), (Throwable) null, this);
        }
        mo39003a((Throwable) cancellationException);
    }
}
