//Java program to show inheritance

class Color {
    void name() {
        System.out.println("Color names : ");
    }
}

class Red extends Color {
    void name1() {
        System.out.println("Red");
    }
}

class Green extends Color {
    void name2() {
        System.out.println("Green");
    }
}

class Blue extends Color {
    void name3() {
        System.out.println("Blue");
    }
}

class Brown extends Red {
    void brown1() {
        System.out.println("Brown");
    }
}

class Pink extends Red {
    void red1() {
        System.out.println("Pink");
    }
}

class Violet extends Blue {
    void name4() {
        System.out.println("Violet");
    }
}

class Neon extends Green {
    void name5() {
        System.out.println("Neon");
    }
}

class Test {
    public static void main(String args[]) {
        Pink p = new Pink();
        p.name();
        p.name1();
        p.red1();
        Brown b = new Brown();
        b.brown1();
        Neon n = new Neon();
        n.name2();
        n.name5();
        Violet v = new Violet();
        v.name3();
        v.name4();
        
    }
}