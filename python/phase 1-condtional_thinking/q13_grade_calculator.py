"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 2: Nested If & Multiple Conditions
Question 13: Take marks (0-100) and print the corresponding grade (A/B/C/D/F).

Mentor Tips (Python 3.14+):
- Use an if-elif-else chain mapping marks to standard thresholds (e.g. 90+ A, 80+ B, 70+ C, 60+ D, else F).
"""

def solve(marks: float) -> str:
    # TODO: Implement this method to solve the question
    return "A" if marks >=90 else "B" if marks >=80 else "C" if marks >=70 else "D" if marks >=60 else "F"

def main():
    marks = float(input("Enter marks (0-100): "))
    print(f"Grade: {solve(marks)}")

if __name__ == "__main__":
    main()
