import java.util.
*;
public class expression {
static int precedence(char op) {
switch (op) {
case '+':
case '-': 
    return 1;
case '*': case '/': return 2;
}
return -1;
}
public static String infixToPostfix(String expr) {
StringBuilder postfix = new StringBuilder();
Stack<Character> stack = new Stack<>();
for (char ch : expr.toCharArray()) {
if (Character.isDigit(ch)) {
postfix.append(ch);
} else if (ch == '(') {
stack.push(ch);
} else if (ch == ')') {
while (!stack.isEmpty() && stack.peek() != '(')
postfix.append(stack.pop());
stack.pop();
} else {
while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
postfix.append(stack.pop());
stack.push(ch);
}
}
while (!stack.isEmpty()) {
postfix.append(stack.pop());
}
return postfix.toString();
}
public static int evaluatePostfix(String postfix) {
Stack<Integer> stack = new Stack<>();
for (char ch : postfix.toCharArray()) {
if (Character.isDigit(ch)) {
stack.push(ch -
'0');
} else {
int b = stack.pop();
int a = stack.pop();
switch (ch) {
case '+': stack.push(a + b); break;
case '-': stack.push(a - b); break;
case '*': stack.push(a * b); break;
case '/': stack.push(a / b); break;
}
}
}
return stack.pop();
}
public static void main(String[] args) {
String expr = "98+(25+32*67/45)-12";
String postfix = infixToPostfix(expr);
System.out.println("Postfix: " + postfix);
System.out.println("Result: " + evaluatePostfix(postfix));
}
}