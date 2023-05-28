package p015cm.aptoide.p016pt.social.view;

/* renamed from: cm.aptoide.pt.social.view.Direction */
public class Direction {
    private static final int bottom = 8;
    private static final int left = 1;
    private static final int right = 2;
    private static final int top = 4;
    private final int direction;

    public Direction(int i, int i2) {
        int i3 = i > 0 ? 2 : i < 0 ? 1 : 0;
        if (i2 > 0) {
            i3 |= 8;
        } else if (i2 < 0) {
            i3 |= 4;
        }
        this.direction = i3;
    }

    public boolean bottom() {
        return (this.direction & 8) == 8;
    }

    public boolean left() {
        return (this.direction & 1) == 1;
    }

    public boolean right() {
        return (this.direction & 2) == 2;
    }

    public boolean top() {
        return (this.direction & 4) == 4;
    }
}
