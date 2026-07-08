"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 4: Logical Operators & Compound Statements
Question 37: Take a single digit (0-9) and print its word form ('Zero' to 'Nine').

Mentor Tips (Python 3.14+):
- Use a match-case statement in Python 3.14, and switch statement/expression in Java 26.
"""

def solve(digit: int) -> str:
    # TODO: Implement this method to solve the question
    return {
        0: "Zero",
        1: "One",
        2: "Two",
        3: "Three",
        4: "Four",
        5: "Five",
        6: "Six",
        7: "Seven",
        8: "Eight",
        9: "Nine"
    }.get(digit, "Invalid")

def main():
    digit = int(input("Digit (0-9): "))
    print(f"Word: {solve(digit)}")

if __name__ == "__main__":
    main()
