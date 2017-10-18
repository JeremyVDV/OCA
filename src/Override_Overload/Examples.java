package Override_Overload;

class Overloading {
    static class TestClass{
        void probe(int... x) { System.out.println("In ..."); }

        void probe(Integer x) { System.out.println("In Integer"); }

        void probe(long x) { System.out.println("In long"); }

        void probe(Long x) { System.out.println("In LONG"); }

        void probe(String x) { System.out.println("In STRING"); }

        void probe(Object x) { System.out.println("In OBJECT"); }

        public static void main(String[] args){
            Integer a = 4;
            new TestClass().probe(a);
            int b = 4;
            new TestClass().probe(b);
        }
    }
}

class Overriding {
    static class Class1{
        void eat(int food) { System.out.println("In Class1"); }
    }

    static class Class2 extends Class1{
        int eat(String food) { System.out.println("In Class2"); return 5; }
    }

    static class Class3 extends Class2 {

    }

    public static void main(String[] args){
        Class2 c2 = new Class2();
        c2.eat("Test");
    }
}

class BaapAndBeta {
    static class Baap {
        public int h = 4;

        public int getH() {
            System.out.println("Baap " + h);
            return h;
        }
    }

    static class Beta extends Baap {
        public int h = 44;

        public int getH() {
            System.out.println("Beta " + h);
            return h;
        }

        public static void main(String[] args) {
            Baap b = new Beta();
            System.out.println(b.h + " " + b.getH());
            Beta bb = (Beta) b;
            System.out.println(bb.h + " " + bb.getH());
        }
    }
}

