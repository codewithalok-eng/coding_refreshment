"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 2: Nested If & Multiple Conditions
Question 11: Take three sides and check if they form a valid triangle.

Mentor Tips (Python 3.14+):
- Triangle inequality theorem states that sum of any two sides must be strictly greater than the third side.
"""

def solve(s1: float, s2: float, s3: float) -> bool:
    # TODO: Implement this method to solve the question
    return False

def main():
    s1 = float(input("Side 1: "))\n    s2 = float(input("Side 2: "))\n    s3 = float(input("Side 3: "))\n    print(f"Valid triangle: {solve(s1, s2, s3)}")

if __name__ == "__main__":
    main()
