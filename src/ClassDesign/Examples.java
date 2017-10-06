package Inheritance;

interface i1 {
abstract String test();
}

interface interfaceRegels extends i1 {
    /* Regels
        - Variabelen beginnen altijd met public static final
        - Methoden mogen geen body bevatten, BEHALVE, als het een static of default is
        - default en static gaan niet samen
        - Interface kan niet worden geinstantieerd
        - Interface mag andere interfaces EXTENDEN
        - Mogen geen abstracte members hebben
    */

    // Variabelen
    public static final String NIET_AANPASBARE_STRING = "";

    //Methoden
    static void voidMethode() {}
    String stringMethode();
    default String getString(){
        return "";
    }
}

abstract class abstractRegels implements interfaceRegels {
    /*  Regels
        - Kunnen abstracte members hebben
        - Abstracte members moeten een implementatie hebben
        - Bij het implementeren van een interface hoeft er nog geen implementaties gedaan te worden
            TOTDAT, een concrete klasse de abstracte klasse extend. Dan moet de abstracte klasse of concrete klasse de methoden van de interface implementeren
            met ACCESS MODIFIER & BODY (return type).
        - Geen abstracte methode moet een body hebben
    */
    static String test;
    public abstract String test();

    public abstractRegels(int i) {

    }
}

class concreteClassRegels extends abstractRegels {
    int i = 500;
    /*  Regels
        - Bij extenden kijken naar of de super een constructor heeft met waarden, anders moet de waarden gevuld worden
    */
    public String test(){return "";}

    public concreteClassRegels() {
        super(5);
    }

    public static void main(String... args) {

    }

    public String stringMethode(){
        return "";
    }

}


// ---------------------------- Voorbeelden ---------------------------

// Voorbeeld 1, print QBANK
class Super { static String ID = "QBANK"; }

class Sub extends Super{
    static { System.out.print("In Sub"); }
}
class Test{
    public static void main(String[] args){
        System.out.println(Sub.ID);
    }
}

//Voorbeeld 2, object/class casting
class A implements interfaceRegels {
    public String stringMethode() {
        return "";
    }
    public String test() {
        return "";
    }
}

class B extends A implements i1 {
    public static void main(String... args) {
        A a = new A();
        B b = new B();

        Object o1 = a;
        interfaceRegels ir1 = (interfaceRegels) o1;

        Object o2 = b;
        interfaceRegels ir2 = (interfaceRegels) o2;
    }
}

// Voorbeeld 3
interface I{
}
class AA implements I{
}

class BB extends AA {
}

class CC extends BB{
}

class Voorbeeld3 {
    public static void main(String... args) {
        AA a = new AA();
        BB b = new BB();
        a = (BB)(I) b;
        b = (BB)(I) a;
    }
}

// Voorbeeld 4
class CorbaComponent{
    String ior;
    CorbaComponent(){ startUp("IOR"); }
    void startUp(String s){ ior  =  s; }
    void print(){ System.out.println(ior); }
}

class OrderManager extends CorbaComponent{
    OrderManager(){  }
    void startUp(String s){  ior = getIORFromURL(s);   }
    String getIORFromURL(String s){  return "URL://"+s; }
}

class Application{
    public static void main(String args[]){ start(new OrderManager()); }
    static void start(CorbaComponent cc){ cc.print(); }
}