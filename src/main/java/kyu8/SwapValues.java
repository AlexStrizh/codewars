/*
I would like to be able to pass an array with two elements to my swapValues function to swap the values.
However it appears that the values aren't changing.

Can you figure out what's wrong here?
 */
package kyu8;

public class SwapValues {
    public Object[] arguments;

    public SwapValues(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
        arguments = args;
    }
}
