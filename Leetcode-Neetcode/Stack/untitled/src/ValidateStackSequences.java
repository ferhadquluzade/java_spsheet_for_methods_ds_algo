import java.util.Stack;

class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0;//track the popped element using variable j
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i < pushed.length; i ++){
            System.out.println("==========================");
            System.out.println(pushed[i]);
            s.push(pushed[i]); //pushing the element into stack
            //peek() element is present in popped array then pop() the peek() element
            while(!s.isEmpty() && j != popped.length){
                if(s.peek() == popped[j]){
                    System.out.println("icinde olan...");
                    System.out.println(s.peek());
                    System.out.println(popped[j]);
                    s.pop(); //pop the element
                    j++; //increase the j pointer
                }else{
                    System.out.println("beraber olmayan:::");
                    System.out.println(s.peek());
                    System.out.println(popped[j]);
                    break;//break from the while loop not the for loop
                }
            }
        };
//        System.out.println(s.peek());
        return s.isEmpty();//check if the stack is empty or not if empty then all operation went successfull
    }
}