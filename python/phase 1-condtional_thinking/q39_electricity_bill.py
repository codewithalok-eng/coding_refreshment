"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 4: Logical Operators & Compound Statements
Question 39: Take electricity units consumed and calculate the bill as per slabs (using if-else).

Mentor Tips (Python 3.14+):
- Define slabs (e.g., first 100 units at $1/unit, next 200 at $2/unit, above that $5/unit). Calculate progressively.
"""

def solve(units: float) -> float:
    # TODO: Implement this method to solve the question
    if units <= 100:
        return units * 1.0
    elif units <= 300:
        return (100 * 1.0) + ((units - 100) * 2.0)
    else:
        return (100 * 1.0) + (200 * 2.0) + ((units - 300) * 5.0)
    return 0.0

def main():
    units = float(input("Enter units: "))
    print(f"Bill: {solve(units)}")

if __name__ == "__main__":
    main()
