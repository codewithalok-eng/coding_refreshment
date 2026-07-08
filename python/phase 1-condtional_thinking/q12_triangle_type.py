"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 2: Nested If & Multiple Conditions
Question 12: If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.

Mentor Tips (Python 3.14+):
- First check if it is a valid triangle (Q11). If so: 3 equal sides = equilateral, 2 equal sides = isosceles, 0 equal sides = scalene.
"""

def solve(s1: float, s2: float, s3: float) -> str:
    # TODO: Implement this method to solve the question
    if s1+s2>s3 and s2+s3>s1 and s1+s3>s2:
        if s1 == s2 == s3:
            return "equilateral"
        elif s1 == s2 or s2 == s3 or s1 == s3:
            return "isosceles"
        else:
            return "scalene"
    else:
        return "not a valid triangle"

def main():
    s1 = float(input("Side 1: "))
    s2 = float(input("Side 2: "))
    s3 = float(input("Side 3: "))
    print(f"Triangle type: {solve(s1, s2, s3)}")

if __name__ == "__main__":
    main()
