public class HierarchicalInheritance {
    public static void main(String[] args) {
        SubA a = new SubA();
        SubB b = new SubB();
        a.parentMethod();
        b.parentMethod();
        a.subAMethod();
        b.subBMethod();
    }
}

class ParentH {
    void parentMethod() {
        System.out.println("ParentH: parentMethod()");
    }
}

class SubA extends ParentH {
    void subAMethod() {
        System.out.println("SubA: subAMethod()");
    }
}

class SubB extends ParentH {
    void subBMethod() {
        System.out.println("SubB: subBMethod()");
    }
}
