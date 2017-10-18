package String;

class StringClass {
    public static void main(String... args) {
        StringClass sc = new StringClass();
        sc.comparingStrings();
        sc.stringMethods();
    }

    void comparingStrings(){
        String s1 = "Test";
        String s2 = new String("Test");

        System.out.println("----------------COMPARING STRINGS----------------");

        if(s1 == s2) {
            System.out.println("==, zonder intern");
        }
        s2 = s2.intern();
        if(s1 == s2) {
            System.out.println("==, met intern");
        }
        if(s1.equals(s2)) {
            System.out.println(".equals");
        }
        System.out.println("==, zonder intern");
        System.out.println("\n");
    }

    void stringMethods(){
        String s1 = "Dit is de StringClass";
        String s2 = "Dit is de StringClass";
        String s3 = "    Dit is de StringClass    ";

        System.out.println("----------------STRING METHODS----------------");


        System.out.println();
        System.out.println("s1: concat String: " + s1.concat(" concat String"));
        System.out.println("s1: charAt 2: " + s1.charAt(2));
        System.out.println("s1: indexOf concat string: " + s1.indexOf("i", 5));
        System.out.println("s1: length: " + s1.length());
        System.out.println("s1: equals: " + s1.equals("Dit is de StringClass"));
        System.out.println("s1: equalsIgnoreCase()e: " + s1.equalsIgnoreCase("Dit IS de StriNGClass"));
        System.out.println("s1: StartWith: " + s1.startsWith("D"));
        System.out.println("s1: EndWith: " + s1.endsWith("s"));
        System.out.println("s1: contains: " + s1.contains("Dit"));
        System.out.println("s3: trim: " + s3.trim());
        System.out.println("s3: replace: " + s3.replace("Dit", "Dat"));
        System.out.println("s3: toLowerCase: " + s3.toLowerCase());
        System.out.println("s3: toUpperCase: " + s3.toUpperCase());
        System.out.println("s3 compareTo s1: " + s3.compareTo(s1));
    }
}

class StringBuilderClass{
    public static void main(String args[ ] ){
        StringBuilderClass sbc = new StringBuilderClass();
        sbc.comparingStringBuilder();
        sbc.StringBuilderMethods();
    }

    void comparingStringBuilder(){
        StringBuilder sb1 = new StringBuilder("12345678");
        StringBuilder sb2 = new StringBuilder("12345678");

        System.out.println("----------------COMPARING STRINGBUILDER----------------");

        System.out.println(sb1);

        if(sb1 == sb2) {
            System.out.println("==, zonder intern");
        }

        if(sb1.equals(sb2)) {
            System.out.println(".equals");
        }

        System.out.println("\n");
    }

    void StringBuilderMethods(){
        StringBuilder sb1 = new StringBuilder("12345678");
        StringBuilder sb2 = new StringBuilder("12345678");

        System.out.println("----------------COMPARING STRINGS----------------");
        sb1.setLength(100);
        System.out.println("sb1: Stringbuilder set length 100");
        System.out.println(sb1.length());

        sb1.setLength(5);
        System.out.println("s1: Stringbuilder set length 5");
        System.out.println(sb1);

        sb2.append("91011");
        System.out.println("s2: Stringbuilder append 91011");
        System.out.println(sb2);

        sb2.delete(8,12);
        sb2.insert(8,9);
        sb2.deleteCharAt(0);
        System.out.println("s2: Stringbuilder delete 8,12, insert 8,9, deletecharat 0");
        System.out.println(sb2);

        System.out.println("s1: reverse: " + sb1.reverse());

        System.out.println("s1: capacity: " + sb1.capacity());

        sb1.ensureCapacity(200);
        System.out.println("s1: minimumCapacity: " + sb1);
    }
}

class InnerClassString {
    static class Class1 {
        public static String string1 = "Hello";
        public static String stringNew1 = new String("Hello");
    }

    static class Class2 {
        public static String string2 = "Hello";
        public static String stringNew2 = new String("Hello");
    }

    static class Class3 {
        public static String string3 = "Hello";
        public static String stringNew3 = new String("Hello");
    }

    public static void main(String... args) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();
        Class3 c3 = new Class3();
        if(c1.string1 == c2.string2) {
            System.out.println("== different classes is true");
        }
        if(c1.string1.equals(c2.stringNew2)) {
            System.out.println("equals new String different classes is true");
        }
        if(c1.string1 == c2.stringNew2.intern()) {
            System.out.println("equals == new String intern different classes is true");
        }
    }
}

class RandomStringTests {
    public static void main(String... args) {
        RandomStringTests rst = new RandomStringTests();
        rst.acceptMultipleString("Dit", "Is", "Een", "Test");
    }

    void acceptMultipleString(String test, String ... strings){
        for(String s : strings) {
            System.out.println(s);
        }
    }
}


