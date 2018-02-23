import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UnitTests {

    @Test
    public void SelectionAlgorithmTest1(){

        int a[]={34,23,22,12,1,2,5,7,99,100,123,43,55,78,79,72,35,29,6};
        SelectionAlgorithm ins=new SelectionAlgorithm();
        ArrayList<Integer> array=new ArrayList<>();
        for(int i:a)
            array.add(i);
        List<Integer> sortedArray=new ArrayList<>(array);
        Collections.sort(sortedArray);
        int K=10;
        int expectedResult=sortedArray.get(K);
        int actualResult=ins.Selection(array,K);

        assertSame(expectedResult,actualResult);

    }

    @Test
    public void SelectionAlgorithmTest2(){

        int a[]={34,23,22,12,1,2,5,7,99,100,123,43,55,78,79,72,35,29,6};
        SelectionAlgorithm ins=new SelectionAlgorithm();
        ArrayList<Integer> array=new ArrayList<>();
        for(int i:a)
            array.add(i);
        List<Integer> sortedArray=new ArrayList<>(array);
        Collections.sort(sortedArray);
        int K=array.size()+2;
        int expectedResult=-1;
        int actualResult=ins.Selection(array,K);

        assertSame(expectedResult,actualResult);

    }
    @Test
    public void SelectionAlgorithmTest3(){

        int a[]={};
        SelectionAlgorithm ins=new SelectionAlgorithm();
        ArrayList<Integer> array=new ArrayList<>();
        for(int i:a)
            array.add(i);
        List<Integer> sortedArray=new ArrayList<>(array);
        Collections.sort(sortedArray);
        int K=3;
        int expectedResult=-1;
        int actualResult=ins.Selection(array,K);

        assertSame(expectedResult,actualResult);

    }

}