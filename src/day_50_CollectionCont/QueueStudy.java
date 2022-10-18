package day_50_CollectionCont;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {

        Queue<Integer> numQue = new LinkedList<>();

        numQue.offer(1);
        numQue.offer(2);
        numQue.offer(4);
        numQue.offer(7);
        numQue.offer(8);
        numQue.offer(9);

        System.out.println("numQue = " + numQue);
        //[1, 2, 4, 7, 8, 9]

        //remove()
        numQue.remove();
        System.out.println("numQue = " + numQue); //FİFO-->[2, 4, 7, 8, 9]

        //peek()
        System.out.println("numQue.peek() = " + numQue.peek()); //numQue.peek() = 2 (sıradakini gösterir)

        //element()
        System.out.println("numQue.element() = " + numQue.element()); //numQue.element() = 2 //peek ten farkı sırada element yoksa exception atar

        //[2, 4, 7, 8, 9]

        while (!numQue.isEmpty()){
            System.out.println("numQue.poll() = " + numQue.poll());
            //numQue.element(); //exception atar
            System.out.println("numQue.peek() = " + numQue.peek());
        }
        System.out.println("numQue = " + numQue); //numQue = []
        System.out.println("numQue.poll() = " + numQue.poll()); //numQue.poll() = null
       // System.out.println("numQue.remove() = " + numQue.remove()); //exception atar

    }
}
