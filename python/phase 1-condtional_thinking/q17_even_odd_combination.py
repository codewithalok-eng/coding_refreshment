"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 2: Nested If & Multiple Conditions
Question 17: Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

Mentor Tips (Python 3.14+):
- Check modular residues of both numbers and group them.
"""

def solve(a: int, b: int) -> str:
    # TODO: Implement this method to solve the question
    return "both even" # or "both odd" or "one even and one odd"

def main():
    a = int(input("First: "))\n    b = int(input("Second: "))\n    print(f"Result: {solve(a, b)}")

if __name__ == "__main__":
    main()
