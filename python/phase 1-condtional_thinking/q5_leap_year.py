"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 1: Simple Conditions (Getting started)
Question 5: Check if a given year is a leap year.

Mentor Tips (Python 3.14+):
- A year is a leap year if it is divisible by 4, except for end-of-century years, which must be divisible by 400.
"""

def solve(year: int) -> bool:
    # TODO: Implement this method to solve the question
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                return True
            else:
                return False
        else:
            return True
    return False

def main():
    year = int(input("Enter a year: "))
    result = solve(year)
    print(f"Leap year: {result}")

if __name__ == "__main__":
    main()
