"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 4: Logical Operators & Compound Statements
Question 35: Take income and age, and check if eligible for tax (age > 18 and income > 5 L).

Mentor Tips (Python 3.14+):
- Combine conditions using logical AND.
"""

def solve(age: int, income: float) -> bool:
    # TODO: Implement this method to solve the question
    if age > 18 and income > 5:
        return True
    return False
    

def main():
    age = int(input("Age: "))
    inc = float(input("Income (in Lakhs): "))
    print(f"Eligible for tax: {solve(age, inc)}")

if __name__ == "__main__":
    main()
