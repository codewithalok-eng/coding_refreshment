"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 5: Creative / Tricky Logical Scenarios
Question 45: Take three numbers and check if they are in arithmetic progression.

Mentor Tips (Python 3.14+):
- Three numbers are in AP if b - a == c - b (when in order) or more generally if they can be ordered to have equal differences. Let's assume order is specified as a, b, c.
"""

def solve(a: float, b: float, c: float) -> bool:
    # TODO: Implement this method to solve the question
    False

def main():
    a = float(input("a: "))\n    b = float(input("b: "))\n    c = float(input("c: "))\n    print(f"Arithmetic progression: {solve(a, b, c)}")

if __name__ == "__main__":
    main()
