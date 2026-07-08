"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 2: Nested If & Multiple Conditions
Question 12: If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.

Mentor Tips (Python 3.14+):
- First check if it is a valid triangle (Q11). If so: 3 equal sides = equilateral, 2 equal sides = isosceles, 0 equal sides = scalene.
"""

def solve(s1: float, s2: float, s3: float) -> str:
    # TODO: Implement this method to solve the question
    return "invalid" # or "equilateral" or "isosceles" or "scalene"

def main():
    s1 = float(input("Side 1: "))\n    s2 = float(input("Side 2: "))\n    s3 = float(input("Side 3: "))\n    print(f"Triangle type: {solve(s1, s2, s3)}")

if __name__ == "__main__":
    main()
