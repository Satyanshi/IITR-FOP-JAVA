package com.lab.dsa;

public class BalanceBracket {
	
	public boolean isBracketBalanced(String str, int size) {
		StackImplemetation stack = new StackImplemetation(size);
        for (int i = 0; i < size; i++) {
            char b = str.charAt(i);
            if (b == '(' || b == '[' || b == '{') {
                stack.push(b);
                continue;
            }
            if (stack.isEmpty()) {
            	return false;
            }
            char check;
            switch (b) {
                case ')':
                    check = stack.pop();
                    if (check == ')') return true;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '}') return true;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == ']') return true;
                    break;
            }
        }
        return (stack.isEmpty());
}
}
