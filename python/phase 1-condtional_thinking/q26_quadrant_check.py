"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 3: Math and Number Logic
Question 26: Take coordinates (x, y) and determine which quadrant the point lies in.

Mentor Tips (Python 3.14+):
- Q1: x > 0, y > 0; Q2: x < 0, y > 0; Q3: x < 0, y < 0; Q4: x > 0, y < 0. Don't forget the cases when x = 0 or y = 0.
"""

def solve(x: float, y: float) -> str:
    # TODO: Implement this method to solve the question
    return "origin" # or "Q1", "Q2", "Q3", "Q4" or "axis"

def main():
    x = float(input("x: "))\n    y = float(input("y: "))\n    print(f"Quadrant: {solve(x, y)}")

if __name__ == "__main__":
    main()
