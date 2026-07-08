"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 4: Logical Operators & Compound Statements
Question 36: Take two numbers and check if both are positive and their sum is less than 100.

Mentor Tips (Python 3.14+):
- All three conditions (a > 0, b > 0, a + b < 100) must be true.
"""

def solve(a: float, b: float) -> bool:
    # TODO: Implement this method to solve the question
    if a > 0 and b > 0 and (a + b) < 100:
        return True
    return False

def main():
    a = float(input("a: "))
    b = float(input("b: "))
    print(f"Condition met: {solve(a, b)}")

if __name__ == "__main__":
    main()
