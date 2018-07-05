package reusing;

import static Succinct.Print.*;

class WithFinal {
    final void f() { print("WithFinal.f()"); }
    void g() { print("WithFinal.g()"); }
    final void h() { print("WitFinal.h()"); }
}

class OverrideFinal extends WithFinal {
    // attempt to override:
    // public final void f() { print("OverrideFinal.f()"); } // no can do
    @Override public void g() { print("OverrideFinal.g()"); } // OK, not final
    // final void h(); { print("OVerrideFinal.h()"); } // cannot override final
}

public class FinalOverrideEx {
    public static void main(String[] args) {
        WithFinal wf = new WithFinal();
        wf.f();
        wf.g();
        wf.h();
        OverrideFinal of = new OverrideFinal();
        of.f();
        of.g();
        of.h();
        WithFinal wf2 = of;
        wf2.f();
        wf2.g();
        wf2.h();
    }
}