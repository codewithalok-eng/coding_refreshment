"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 4: Logical Operators & Compound Statements
Question 38: Take a weekday number (1-7) and determine if it is a weekday or weekend.

Mentor Tips (Python 3.14+):
- Weekday is 1 to 5, weekend is 6 and 7. You can check: day in [6, 7] or day == 6 || day == 7.
"""

def solve(day: int) -> str:
    # TODO: Implement this method to solve the question
    return "Invalid"

def main():
    day = int(input("Day number (1-7): "))\n    print(f"Type: {solve(day)}")

if __name__ == "__main__":
    main()
