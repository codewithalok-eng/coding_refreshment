"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 5: Creative / Tricky Logical Scenarios
Question 41: Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.

Mentor Tips (Python 3.14+):
- Origin if x == 0 and y == 0. X-axis if y == 0 (and x != 0). Y-axis if x == 0 (and y != 0).
"""

def solve(x: float, y: float) -> str:
    # TODO: Implement this method to solve the question
    return "somewhere" # or "origin", "X-axis", "Y-axis"

def main():
    x = float(input("x: "))\n    y = float(input("y: "))\n    print(f"Point lies on: {solve(x, y)}")

if __name__ == "__main__":
    main()
