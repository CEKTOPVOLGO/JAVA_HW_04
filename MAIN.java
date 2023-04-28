import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * MAIN
 */
public class MAIN {

    public static void main(String[] args) {
        System.out.println("Введите номер задачи (1 - 4): ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
        case 1:
            task1();
            break;
        case 2:
            task2();
            break;
        case 3:
            task3();
            break;
        case 4:
            task4();
            break;
        }

    }

    /*
     *  
        
        3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
        4. *реализовать вторую задачу через собственный класс используя в основе массив
     */

    public static void task1() {
        /*
         * 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
         */
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            linkedList.add(i);         
        }                
        System.out.println(reverceLinkedList(linkedList));          
    }
    public static LinkedList<Integer> reverceLinkedList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        while (!linkedList.isEmpty()) {
            linkedList2.add(linkedList.pollLast());
        }
        return linkedList2;        
    }

    public static void task2() {
        /*
         2. Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент 
        из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
         */
        
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введите команду(enqueue, dequeue, first, exit): ");
            String command = scanner.nextLine();
            switch (command) {
                case "enqueue":
                    System.out.println("Введите число: ");
                    int n = scanner.nextInt();
                    MyQueue.enqueue(n);
                    break;
                case "dequeue":
                    System.out.println("Первый элемент в очереди был: " + MyQueue.dequeue());
                    break;
                case "first":
                    System.out.println("Первый элемент в очереди: " + MyQueue.first());
                    break;
                case "exit":
                    System.out.println("До скорой встречи");                    
                    work = false;
                    break;            
                default:
                    System.out.println("Такой команды не существует, введите команду еще раз: ");
                    break;
            }
            System.out.println();
        }
        
    }

    public static void task3() {
        /*
         * 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
         */
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            linkedList.add(i);            
        }
        System.out.println("LinkedList: " + linkedList);
        ListIterator<Integer> listIter = linkedList.listIterator();
        int sum = 0;
        while(listIter.hasNext()){
            sum += listIter.next();
        }
        System.out.println("Сумма чисел LinkedList = " + sum);        
    }

    public static void task4() {
        /* 
        4. *реализовать вторую задачу через собственный класс используя в основе массив
        */
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введите команду(enq, deq, First, exit): ");
            String command = scanner.nextLine();
            switch (command) {
                case "enq":
                    System.out.println("Введите число: ");
                    int n = scanner.nextInt();
                    MyQueue.enq(n);
                break;                    
                case "deq":
                    MyQueue.deq();                  
                    break;
                case "First":
                    MyQueue.First();
                    break;
                case "exit":
                    System.out.println("До скорой встречи");                    
                    work = false;
                    break;            
                default:
                    System.out.println("Такой команды не существует, введите команду еще раз: ");
                    break;
            }
            System.out.println();
        }
        
    }
}