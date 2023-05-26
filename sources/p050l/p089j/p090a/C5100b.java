package p050l.p089j.p090a;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: l.j.a.b */
/* compiled from: FocusStrategy */
class C5100b {

    /* renamed from: l.j.a.b$a */
    /* compiled from: FocusStrategy */
    public interface C5101a<T> {
        /* renamed from: a */
        void mo17688a(T t, Rect rect);
    }

    /* renamed from: l.j.a.b$b */
    /* compiled from: FocusStrategy */
    public interface C5102b<T, V> {
        /* renamed from: a */
        int mo17690a(T t);

        /* renamed from: a */
        V mo17692a(T t, int i);
    }

    /* renamed from: l.j.a.b$c */
    /* compiled from: FocusStrategy */
    private static class C5103c<T> implements Comparator<T> {

        /* renamed from: f */
        private final Rect f8982f = new Rect();

        /* renamed from: g */
        private final Rect f8983g = new Rect();

        /* renamed from: h */
        private final boolean f8984h;

        /* renamed from: i */
        private final C5101a<T> f8985i;

        C5103c(boolean z, C5101a<T> aVar) {
            this.f8984h = z;
            this.f8985i = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f8982f;
            Rect rect2 = this.f8983g;
            this.f8985i.mo17688a(t, rect);
            this.f8985i.mo17688a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (this.f8984h) {
                    return 1;
                }
                return -1;
            } else if (i3 <= i4) {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (this.f8984h) {
                        return 1;
                    }
                    return -1;
                } else if (i7 <= i8) {
                    return 0;
                } else {
                    if (this.f8984h) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.f8984h) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* renamed from: a */
    private static int m9326a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: a */
    public static <L, T> T m9328a(L l, C5102b<L, T> bVar, C5101a<T> aVar, T t, int i, boolean z, boolean z2) {
        int a = bVar.mo17690a(l);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(bVar.mo17692a(l, i2));
        }
        Collections.sort(arrayList, new C5103c(z, aVar));
        if (i == 1) {
            return m9333b(t, arrayList, z2);
        }
        if (i == 2) {
            return m9327a(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: b */
    private static <T> T m9333b(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: c */
    private static int m9336c(int i, Rect rect, Rect rect2) {
        return Math.max(0, m9337d(i, rect, rect2));
    }

    /* renamed from: d */
    private static int m9337d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: e */
    private static int m9338e(int i, Rect rect, Rect rect2) {
        return Math.max(1, m9339f(i, rect, rect2));
    }

    /* renamed from: f */
    private static int m9339f(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: g */
    private static int m9340g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    /* renamed from: b */
    private static boolean m9335b(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m9332a(rect, rect2, i)) {
            return false;
        }
        if (!m9332a(rect, rect3, i) || m9331a(i, rect, rect2, rect3)) {
            return true;
        }
        if (!m9331a(i, rect, rect3, rect2) && m9326a(m9336c(i, rect, rect2), m9340g(i, rect, rect2)) < m9326a(m9336c(i, rect, rect3), m9340g(i, rect, rect3))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static <T> T m9327a(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: a */
    public static <L, T> T m9329a(L l, C5102b<L, T> bVar, C5101a<T> aVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int a = bVar.mo17690a(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < a; i2++) {
            T a2 = bVar.mo17692a(l, i2);
            if (a2 != t) {
                aVar.mo17688a(a2, rect3);
                if (m9335b(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a2;
                }
            }
        }
        return t2;
    }

    /* renamed from: b */
    private static boolean m9334b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        return rect.bottom <= rect2.top;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m9331a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean a = m9330a(i, rect, rect2);
        if (m9330a(i, rect, rect3) || !a) {
            return false;
        }
        if (m9334b(i, rect, rect3) && i != 17 && i != 66 && m9336c(i, rect, rect2) >= m9338e(i, rect, rect3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m9332a(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: a */
    private static boolean m9330a(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }
}
