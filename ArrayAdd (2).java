/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viki
 */
public class ArrayAdd {
    private static int sum;
  private static int min;
public  static void main(String[] args){
    int[] a={10,20,30};int max = 0;
{
        for (int i=0;i<a.length;i++){
           sum = sum+a[i];
            
if(max < a [i]){
      max = a[i];

}
           
if(min > a [i]){
      min = a[i];

}

        }
    }System.out.println("Sum:"+sum);  System.out.println("Maximum value:"+max);System.out.println("Minimum value:"+min);
}
}
