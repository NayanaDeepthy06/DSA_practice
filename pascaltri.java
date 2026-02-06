import java.util.*;

public class pascaltri {
     public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i =1;i<=numRows;i++){
            triangle.add(generateRows(i));
        }
        return triangle;
    }
    private List<Integer> generateRows(int rows){
        List<Integer> rowlist  = new ArrayList<>();
        long ans =1;
        rowlist.add(1);
        for(int col =1;col<rows;col++){
            ans = ans*(rows-col);
            ans = ans/col;
            rowlist.add((int)ans);
        }
        return rowlist;
    }
}
