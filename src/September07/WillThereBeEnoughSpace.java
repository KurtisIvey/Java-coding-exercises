package September07;
/*
 capacity - currently on - waiting.
    will be less than zero if space

 */
public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        // your code here
        return cap - on - wait < 0? -(cap - on - wait): 0;
        /*
        better option using Math.max to compare the greater one
        on and wait would exceed cap. no negative would need to be applied then
        return Math.max(0, on + wait - cap);
         */
    }
}
