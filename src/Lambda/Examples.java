package Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Titan on 15-10-2017.
 */
class Lambda{
    int value;
    Lambda(int value){
        this.value = value;
    }
    public String toString(){
        return ""+value;
    }
    public static void main(String[] args) {
        Lambda[] dataArr = new Lambda[]{ new Lambda(1), new Lambda(2), new Lambda(3), new Lambda(4) };
        List<Lambda> dataList = Arrays.asList(dataArr);

        for(Lambda element :  dataList){
            dataList.removeIf( (Lambda d) -> { return d.value%2 ==  0; } );
            System.out.println("Removed "+", "); //3
        }
    }
}
