"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 1: Simple Conditions (Getting started)
Question 1: Take a number and print whether it's positive, negative, or zero.

Mentor Tips (Python 3.14+):
- Think about comparison operators (> , < , ==). You can write this using standard if-elif-else logic or match-case.
"""

def solve(number: float) -> str:
    # TODO: Implement this method to solve the question
    if number > 0:
        return "positive"
    elif number < 0:
        return "negative"
    else:
        return "zero"

def main():
    number = float(input("Enter a number: "))
    result = solve(number)
    print(f"Result: {result}")

if __name__ == "__main__":
    main()
