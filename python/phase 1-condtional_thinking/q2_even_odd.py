"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 1: Simple Conditions (Getting started)
Question 2: Check if a number is even or odd.

Mentor Tips (Python 3.14+):
- Use the modulo operator (%) to find the remainder when divided by 2.
"""

def solve(number: int) -> str:
    # TODO: Implement this method to solve the question
    if number % 2 == 0:
        return "even"
    else:
        return "odd"                    

def main():
    number = int(input("Enter an integer: "))
    result = solve(number)
    print(f"Result: {result}")

if __name__ == "__main__":
    main()
