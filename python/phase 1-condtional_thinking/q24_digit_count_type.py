"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 3: Math and Number Logic
Question 24: Check whether a given integer is single-digit, double-digit, or multi-digit.

Mentor Tips (Python 3.14+):
- Take the absolute value of the number first. If it's 0-9: single-digit. If 10-99: double-digit. Else: multi-digit.
"""

def solve(num: int) -> str:
    # TODO: Implement this method to solve the question
    abs_num = abs(num)
    if abs_num < 10:
        return "single-digit"
    elif abs_num < 100:
        return "double-digit"
    else:
        return "multi-digit"

def main():
    num = int(input("Enter an integer: "))
    print(f"Digit type: {solve(num)}")

if __name__ == "__main__":
    main()
