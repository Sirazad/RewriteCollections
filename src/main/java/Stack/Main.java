package Stack;

public class Main {

    public static void main(String[] args) {
        StackRewrite sr = new StackRewrite();
        System.out.println("peek no elements: "+sr.peek());
        System.out.println("check if empty with no elements: "+sr.isEmpty());
        System.out.println("push element, returns element: "+sr.push(2));
        System.out.println("check size now: " +sr.size());
        System.out.println("peek element now: "+sr.peek());
        System.out.println("push new elements: "+ sr.push(4)+" "+sr.push(5));
        System.out.println("checking toString (inherited from List): "+sr.toString());
        System.out.println("remove element: "+sr.pop());
        System.out.println("elements now: "+sr.toString());
    }
}
