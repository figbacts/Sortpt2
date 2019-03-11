import java.util.Random;
public class sort{
  public static int partition (int [] data, int start, int end){
    int index = (int)(Math.random() * end - start +1);
    int value = data[index];
    int [] test = new int [end -start +1];
    int stop = end -start +1;
    int beg = start;
    for (int i = beg; i < stop; i++){
      if (data[i] > value){
        test[end] = data[i];
        end -=1;
      }
      if (data[i] < data[index]){
        test[start] = data[i];
        start += 1;
      }
    }
    test[start] = value;
    String ans = "";
    for(int r = 0; r < test.length; r++){
        ans += test[r] + " ";
    }
    System.out.println(ans);
    System.out.println(value);
    return start;
  }
  public static void main(String[] args) {
    int [] test = {17, 61, 67, 47, 93,12,	20,	4, 44,	68};
    System.out.println(partition(test,0,9));
  }
}
