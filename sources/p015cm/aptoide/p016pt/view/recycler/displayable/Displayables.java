package p015cm.aptoide.p016pt.view.recycler.displayable;

import android.os.Bundle;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import p015cm.aptoide.p016pt.view.LifecycleSchim;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.Displayables */
public class Displayables implements LifecycleSchim {
    private final List<Displayable> displayables = new LinkedList();
    private final Queue<Displayable> temporaryDisplayables = new LinkedList();

    private void addDisplayableGroup(int i, DisplayableGroup displayableGroup) {
        this.temporaryDisplayables.clear();
        this.temporaryDisplayables.addAll(displayableGroup.getChildren());
        LinkedList linkedList = new LinkedList();
        while (!this.temporaryDisplayables.isEmpty()) {
            Displayable poll = this.temporaryDisplayables.poll();
            if (poll instanceof DisplayableGroup) {
                this.temporaryDisplayables.addAll(((DisplayableGroup) poll).getChildren());
            } else {
                linkedList.add(poll);
            }
        }
        Collections.reverse(linkedList);
        this.displayables.addAll(i, linkedList);
    }

    private boolean shouldIgnore(Displayable displayable) {
        return displayable instanceof EmptyDisplayable;
    }

    public void add(int i, List<? extends Displayable> list) {
        Collections.reverse(list);
        for (Displayable add : list) {
            add(i, add);
        }
    }

    public void clear() {
        this.displayables.clear();
    }

    public Displayable get(Integer num) {
        if (this.displayables.size() > num.intValue()) {
            return this.displayables.get(num.intValue());
        }
        return null;
    }

    public int getPosition(Displayable displayable) {
        return this.displayables.indexOf(displayable);
    }

    public void onDestroyView() {
        for (Displayable onDestroyView : this.displayables) {
            onDestroyView.onDestroyView();
        }
    }

    public void onPause() {
        for (Displayable onPause : this.displayables) {
            onPause.onPause();
        }
    }

    public void onResume() {
        for (Displayable onResume : this.displayables) {
            onResume.onResume();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        for (Displayable onSaveInstanceState : this.displayables) {
            onSaveInstanceState.onSaveInstanceState(bundle);
        }
    }

    public void onViewCreated() {
        for (Displayable onViewCreated : this.displayables) {
            onViewCreated.onViewCreated();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        for (Displayable onViewStateRestored : this.displayables) {
            onViewStateRestored.onViewStateRestored(bundle);
        }
    }

    public Displayable pop() {
        if (this.displayables.size() <= 0) {
            return null;
        }
        List<Displayable> list = this.displayables;
        return list.remove(list.size() - 1);
    }

    public int remove(int i, int i2) {
        if (i < 0 || i >= size() || i2 < i || i2 > size()) {
            return 0;
        }
        int i3 = (i2 + 1) - i;
        if (i3 == 0) {
            remove(i);
            return 1;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            this.displayables.remove(i);
        }
        return i3;
    }

    public int size() {
        return this.displayables.size();
    }

    public void add(int i, Displayable displayable) {
        if (!shouldIgnore(displayable)) {
            if (displayable instanceof DisplayableGroup) {
                addDisplayableGroup(i, (DisplayableGroup) displayable);
            } else {
                this.displayables.add(i, displayable);
            }
        }
    }

    public void remove(int i) {
        if (i >= 0 && i < this.displayables.size()) {
            this.displayables.remove(i);
        }
    }

    public void remove(Displayable displayable) {
        this.displayables.remove(displayable);
    }

    public void add(List<? extends Displayable> list) {
        for (Displayable add : list) {
            add(add);
        }
    }

    public void add(Displayable displayable) {
        if (!shouldIgnore(displayable)) {
            if (displayable instanceof DisplayableGroup) {
                addDisplayableGroup((DisplayableGroup) displayable);
            } else {
                this.displayables.add(displayable);
            }
        }
    }

    private void addDisplayableGroup(DisplayableGroup displayableGroup) {
        this.temporaryDisplayables.clear();
        this.temporaryDisplayables.addAll(displayableGroup.getChildren());
        while (!this.temporaryDisplayables.isEmpty()) {
            Displayable poll = this.temporaryDisplayables.poll();
            if (poll instanceof DisplayableGroup) {
                this.temporaryDisplayables.addAll(((DisplayableGroup) poll).getChildren());
            } else {
                this.displayables.add(poll);
            }
        }
    }
}
