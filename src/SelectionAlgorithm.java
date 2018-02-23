import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SelectionAlgorithm {

    /*This is the selection algorithm to find the kth smallest element in an array. It takes linear time*/
    public int Selection(ArrayList<Integer> a, int K){
        /*To check if the kth smallest is greater than the size of the array*/
        if(a.size()<K)
            return -1;
        /*If the array size is too small then we can just any sorting and then access the kth smallest using an index*/
        if(a.size()<5) {
            Collections.sort(a);
            return a.get(K);
        }
        /*Now comes the part where we find the median of medians to always get the best pivot*/
        else {
            int groups = a.size() / 5;
            ArrayList<Integer> medians = new ArrayList<>();
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < groups; i++) {
                temp = new ArrayList<>();
                for (int j = i*5; j < i*5 + 5; j++)
                    temp.add(a.get(j));


                Collections.sort(temp);
                medians.add(temp.get((temp.size() - 1) / 2));
            }

            if(a.size()>(groups*5)) {
                temp = new ArrayList<>();
                for (int j =(groups*5); j < a.size(); j++)
                    temp.add(a.get(j));

                Collections.sort(temp);
                medians.add(temp.get((temp.size() - 1) / 2));
            }

            int y = Selection(medians, medians.size() / 2);

            ArrayList<Integer> a1 = new ArrayList<>();
            ArrayList<Integer> a2 = new ArrayList<>();

            for (int i : a) {
                if (i < y)
                    a1.add(i);
                else if (i > y)
                    a2.add(i);
            }
            int c = a1.size();

            if (K < c)
                return Selection(a1, K);
            if (K > c)
                return Selection(a2, K - c - 1);
            else return y;
        }


    }

}
