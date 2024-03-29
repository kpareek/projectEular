/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2<k> {
   public static void main(String[]args) {
       int limit = 4000000;

       int i = 1;
       int j = 2;
       int k = 0;
       int count = 2 ;
       while ( j < limit){
           k = i + j;
           i = j;
           j = k;
           if (k % 2 == 0){
           count = count + k;
            }
       }

       System.out.println(count);


   }
}
