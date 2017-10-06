package Loops;


// Voorbeeld 1
class SimpleLoop {
    public static void main(String[] args) {
        int i=0, j=10;
        int count = 0;
        while (i<j) {
            i++;
            j--;
            count++;
        }
        System.out.println(i+" "+j+" "+count);
    }
}

// Voorbeeld 2
class TestClass {

    public static int m1(int i){
        return ++i;
    }

    public static void main(String[] args) {

        int k = m1(args.length);
        k += 3 + ++k;
        System.out.println(k);

    }
}

// Voorbeeld 3
class TestClass2 {
    public static void main(String[] args) {
        char i;
        LOOP: for (i=0;i<5;i++){
            switch(i++){
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
            }
        }
    }
}

// Voorbeeld 4
// Komt niet in de forloop (domme ik)
class TestClass3{
    public static void main(String args[]){
        int x  = 0;
        labelA:   for (int i=10; i<0; i--){
            int j = 0;
            labelB:
            while (j < 10){
                if (j > i) break labelB;
                if (i == j){
                    x++;
                    continue labelA;
                }
                j++;
            }
            x--;
        }
        System.out.println(x);
    }
}

// Voorbeeld 5, ECHT NALOPEN
class Test{
    public static void main(String args[]){
        int c = 0;
        A: for(int i = 0; i < 2; i++){
            B: for(int j = 0; j < 2; j++){
                C: for(int k = 0; k < 3; k++){
                    c++;
                    if(k>j) break;
                }
            }
        }
        System.out.println(c);
    }
}

// Voorbeeld 6, Rustig nalopen
class Test2{
    public static void main(String args[]){
        int count = 0, sum = 0;
        do{
            if(count % 3 == 0) continue;
            sum+=count;
        }
        while(count++ < 11);
        System.out.println(sum);
    }
}

// Voorbeeld 7
class Test3{
    public static void main(String args[]){

        System.out.println(parseFloat("ij"));
        /*
        int i=0, j=11;
        do{
            if(i > j) { break; }
            j--;
        }while( ++i < 5);
        System.out.println(i+"  "+j);
        */
    }
    public static float parseFloat( String s ){
        float f = 0.0f;      // 1
        try{
            f = Float.valueOf( s ).floatValue();    // 2

        }
        catch(NumberFormatException nfe){
            f = Float.NaN ;    //
            return f;     // 5
        }
        finally {
        }
        return f ;    // 7
    }
}