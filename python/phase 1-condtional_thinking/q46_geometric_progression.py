"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 5: Creative / Tricky Logical Scenarios
Question 46: Take three numbers and check if they are in geometric progression.

Mentor Tips (Python 3.14+):
- Three numbers a, b, c are in GP if b / a == c / b, which can be cross-multiplied as b * b == a * c (which avoids float division problems and division by zero!).
"""

def solve(a: float, b: float, c: float) -> bool:
    # TODO: Implement this method to solve the question
    if b * b == a * c:
        return True
    return False

def main():
    a = float(input("a: "))
    b = float(input("b: "))
    c = float(input("c: "))
    print(f"Geometric progression: {solve(a, b, c)}")

if __name__ == "__main__":
    main()
