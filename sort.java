import java.util.*;
public class sort{
  public static int partition (int [] data, int start, int end){
    Random random = new Random();
    int index = Math.abs(random.nextInt()) % (end - start + 1);
    int value = data[index];
    int placeholder =0;
    int beg = start;
    data[index] = data[start];
    data[start] = value;
    start += 1;
    while (start < end){
      if (data[start] < value){
        start +=1;
      }
      if (data[start] > value){
        placeholder = data[end];
        data[end] = data[start];
        data[start] = placeholder;
        end -=1;
      }
    }
    if(data[start] < value){
      data[beg] = data[start];
      data[start] = value;
      return start;
    }
    if(data[start] > value){
      data[beg] = data[start -1];
      data[start-1] = value;
      return start -1;
    }
    return start;
  }
  public static void main(String[] args) {
    int [] test = {17, 61, 67, 47, 93,12,	20,	4, 44,	68};
    System.out.println(partition(test,0,9));
  }
}
