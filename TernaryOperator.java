/*Description:
    the only ternary operator in java is conditional operator. it works like if-else statement.
    with the difference that it occupies less memory than if-else. 
    Its syntax is simpler than if-else and we can use this operator instead of nested if-else.
    syntax:
        condition ? statement1 : statement2;
        
    If the condition is met, it executes the statement1, otherwise it executes the statement2.    
*/

public class TernaryOperator{
    public static void main(String[] args){
        
        //simple example
        int n = 3;
        String state = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(state);
        //output: Odd

        //if-else equivalent:
        if(n % 2 == 0)
            state = "Even";
        else
            state = "Odd";    

        //nested example
        int A = 1, B = 2;
        char s1 = '1', s2 = '0';  //Suppose s1, s2 only take zero or one values
        int res = (s2 == '1') ? ( (s1 == '1') ? A + B : A - B) : ( (s1 == '1') ? A & B : A | B);
        System.out.println(res);
        //output: 0

        //if-else equivalent:
        if(s2 == '1'){
            if(s1 == '1')
                res = A + B;
            else
                res = A - B;    
        }
        else{
            if(s1 == '1')
                res = A & B;
            else
                res = A | B;    
        }
    }
}