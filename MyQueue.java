import java.util.LinkedList;

public class MyQueue {
    private static LinkedList<Integer> linkedList = new LinkedList<>();
    private static int[] arr = new int[10];
    private static int size = 0;
    

    public static void enqueue(int n){
        linkedList.addLast(n);
    }

    public static int dequeue(){
        return linkedList.pollFirst();
    }

    public static int first(){
        return linkedList.getFirst();
    }

    public static void enq(int n) {
        arr[size] = n; 
        size++;       
    }

    public static void deq(){
        int n = 0;
        n = arr[0];
        if (size > 0){
            System.out.println("Первый элемент в очереди был: " + n); 
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];                
            }
            size--;
        }
        else{
            System.out.println("Чисел в очереди нет!");
            }      

    }
        public static void First(){
            int n = 0;
            n = arr[0];
            if (size > 0){
                System.out.println("Первый элемент в очереди: " + n);    
            }
            else{
                System.out.println("Чисел в очереди нет!");
            }    
        
    }


}
