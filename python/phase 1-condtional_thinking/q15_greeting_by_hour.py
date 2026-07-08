"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 2: Nested If & Multiple Conditions
Question 15: Take the hour of the day (0-23) and print 'Good Morning', 'Good Afternoon', 'Good Evening', or 'Good Night'.

Mentor Tips (Python 3.14+):
- E.g. 5-11 Good Morning, 12-16 Good Afternoon, 17-21 Good Evening, else Good Night.
"""

def solve(hour: int) -> str:
    # TODO: Implement this method to solve the question
    return "Good Morning" if 5 <= hour <= 11 else "Good Afternoon" if 12 <= hour <= 16 else "Good Evening" if 17 <= hour <= 21 else "Good Night"

def main():
    hour = int(input("Hour (0-23): "))
    print(f"Greeting: {solve(hour)}")

if __name__ == "__main__":
    main()
