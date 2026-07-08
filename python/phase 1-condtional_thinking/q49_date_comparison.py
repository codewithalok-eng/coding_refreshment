"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 5: Creative / Tricky Logical Scenarios
Question 49: Take two dates (day and month) and determine which one comes first in the calendar.

Mentor Tips (Python 3.14+):
- Compare months first. If months are different, the smaller month comes first. If months are the same, compare the days.
"""

def solve(d1: int, m1: int, d2: int, m2: int) -> str:
    # TODO: Implement this method to solve the question
    if m1 < m2:
        return "first"
    elif m1 > m2:
        return "second"
    else:  # months are the same
        if d1 < d2:
            return "first"
        elif d1 > d2:
            return "second"
        else:
            return "same"  # both dates are the same
    return "first" # or "second" or "same"

def main():
    d1 = int(input("Day 1: "))
    m1 = int(input("Month 1: "))
    d2 = int(input("Day 2: "))
    m2 = int(input("Month 2: "))
    print(f"Earlier date: {solve(d1, m1, d2, m2)}")

if __name__ == "__main__":
    main()
