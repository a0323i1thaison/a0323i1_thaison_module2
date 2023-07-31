package ss10_DSA_stack_queue.bai_tap;
import java.util.Stack;
public class dao_nguoc_stack {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0 ; i < arr.length; i++){
            stack.push(arr[i]);
        }
        int [] nArr =new int [arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            nArr[i] = stack.pop();
        }
        for ( int i = 0 ; i < nArr.length ; i++){
            System.out.println(nArr[i] + " ");
        }
    }
}
