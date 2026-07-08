"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 1: Simple Conditions (Getting started)
Question 10: Take a character and check whether it's uppercase, lowercase, a digit, or a special character.

Mentor Tips (Python 3.14+):
- In Python, use character methods isupper(), islower(), isdigit(). In Java, use Character.isUpperCase(), Character.isLowerCase(), Character.isDigit().
"""

def solve(char: str) -> str:
    # TODO: Implement this method to solve the question
    if char.isupper():
        return "uppercase"
    elif char.islower():
        return "lowercase"
    elif char.isdigit():
        return "digit"
    else:
        return "special"

def main():
    char = input("Enter a single character: ")
    result = solve(char)
    print(f"Result: {result}")

if __name__ == "__main__":
    main()
