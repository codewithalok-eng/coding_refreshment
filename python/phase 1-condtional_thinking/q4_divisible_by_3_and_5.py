"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 1: Simple Conditions (Getting started)
Question 4: Check if a number is divisible by both 3 and 5.

Mentor Tips (Python 3.14+):
- Combine conditions using logical AND ('and' in Python, '&&' in Java).
"""

def solve(number: int) -> bool:
    # TODO: Implement this method to solve the question
    if number % 3 ==0 and number % 5 ==0:
        return True
    return False

def main():
    number = int(input("Enter an integer: "))
    result = solve(number)
    print(f"Divisible by 3 and 5: {result}")

if __name__ == "__main__":
    main()
