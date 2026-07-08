"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 1: Simple Conditions (Getting started)
Question 3: Check if a number is divisible by 5.

Mentor Tips (Python 3.14+):
- A number is divisible by 5 if the remainder when divided by 5 is 0 (number % 5 == 0).
"""

def solve(number: int) -> bool:
    # TODO: Implement this method to solve the question
    if number % 5 == 0:
        return True
    else :
        return False  

def main():
    number = int(input("Enter an integer: "))
    result = solve(number)
    print(f"Divisible by 5: {result}")

if __name__ == "__main__":
    main()
