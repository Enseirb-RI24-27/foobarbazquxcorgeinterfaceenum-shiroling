package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo  {
    private final IBaz baz;
    private final List<IBar> bars;
    private final IQux qux;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>();
        this.qux = new Qux();
    }

    public void addBar(IBar bar) {
        this.bars.add(bar);
    }

    public IBaz getBaz() {
        return this.baz;
    }

    public List<IBar> getBars() {
        return this.bars;
    }

    public IQux getQux() {
        return this.qux;
    }

    public ICorge getCorge() {
        return this.corge;
    }

    public void setCorge(ICorge corge) {
        if (this.corge != null) {
            this.corge.setFoo(null);
        }
        this.corge = corge;

        if (corge != null && corge.getFoo() != this) {
            corge.setFoo(this);
        }

    }
}
