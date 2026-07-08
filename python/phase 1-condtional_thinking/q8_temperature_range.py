"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 1: Simple Conditions (Getting started)
Question 8: Take a temperature value and print 'Cold', 'Warm', or 'Hot' using range conditions.

Mentor Tips (Python 3.14+):
- Define your thresholds, e.g. < 15 is Cold, 15 to 30 is Warm, > 30 is Hot.
"""

def solve(temp: float) -> str:
    # TODO: Implement this method to solve the question
    return "Cold" if temp < 15 else "Warm" if 15 <= temp <= 30 else "Hot"

def main():
    temp = float(input("Enter temperature: "))
    result = solve(temp)
    print(f"Result: {result}")

if __name__ == "__main__":
    main()
