"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 5: Creative / Tricky Logical Scenarios
Question 42: Take three numbers and check if they can form a Pythagorean triplet.

Mentor Tips (Python 3.14+):
- A Pythagorean triplet satisfies a^2 + b^2 = c^2, but the inputs may not be in order! Check all three combinations: a^2+b^2=c^2, a^2+c^2=b^2, b^2+c^2=a^2.
"""

def solve(a: float, b: float, c: float) -> bool:
    # TODO: Implement this method to solve the question
    False

def main():
    a = float(input("a: "))\n    b = float(input("b: "))\n    c = float(input("c: "))\n    print(f"Pythagorean triplet: {solve(a, b, c)}")

if __name__ == "__main__":
    main()
