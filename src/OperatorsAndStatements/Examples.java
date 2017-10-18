package Loops;


import java.util.ArrayList;
import java.util.List;

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

        int z = m1(args.length);
        z +=  (++z) + (z = 2);
        System.out.println(z);

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
// Voorbeeld 8
class Test8{
    public static void main(String args[]){
        double daaa[][][] = new double[3][][];
        double d = 100.0;
        double[][] daa = new double[1][1];
        daa = daaa[0];
        daaa[0] = daa;

        double[] lol[][] = new double [2][][];
        double[] lol2[][] = new double [2][][];
        double[] lol3[] = new double [2][];


    }
}

//Voorbeeld 9
class Example9{
    public static void main(String args[]){
        int i;
        int j;
        for (i = 0, j = 0; j < i; ++j, i++){
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);
    }
}

// Voorbeeld 10
class LoopTest{
    public static void main(String args[]) {
        int counter = 0;
        outer:
        for (int i = 0; i < 3; i++) {
            middle:
            for (int j = 0; j < 3; j++) {
                inner:
                for (int k = 0; k < 3; k++) {
                    if (k - j > 0) {
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

// Voorbeeld 11
class Testtt {
    public static void main(String... args) {
        List s1 = new ArrayList();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");
        if(s1.remove("a")){
            if(s1.remove("a")){
                s1.remove("b");
            }else{
                s1.remove("c");
            }
        }
        System.out.println(s1);

        int i;
        int j;
        for (i = 0, j = 0 ; j < 1 ; ++j , i++){
            System.out.println( i + " " + j );
        }
        System.out.println( i + " " + j );
    }
}

// Voorbeeld 12
class InitializeArrays {
    public static void main(String... args) {
        /* Werkt niet
        int[][][] slecht1 = {{0, 1}, {2, 3}, {4, 5}};

        -- Toewijst 1 de

        -- Toewijst 1 dimensie, {} eromheen, of elk inpakken in {}
        int[][] array2D = new int[][]{0, 1};

        -- Mist komma
        int[][] slecht4 = new int[][] { { 0, 1, 2, 4} {5, 6}};
        */


        // Werkt wel
        int[][][] goed1 = {{{0, 1}, {2, 3}, {4, 5}}};

        int[] goed3[] = new int [2] [2];
        goed3[0] [0] = 1;
        goed3[0] [1] = 2;
        goed3[1] [0] = 3;

        int[][] slecht3 = new int[][]{{0}, {1}};

        int[] arr = {1, 2};
        int[][] arr2 = {arr, {1, 2}, new int[5]};
        int[][][] arr3 = new int[2][2][2];

        Integer[] slecht2[] = new Integer[][] {{1,2,3}};
    }
}
