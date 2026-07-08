"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 5: Creative / Tricky Logical Scenarios
Question 44: Take time (hours and minutes) and print the smaller angle between the hour and minute hands.

Mentor Tips (Python 3.14+):
- Hour hand moves 0.5 deg per minute. Minute hand moves 6 deg per minute. Hour hand also moves 30 deg per hour. Calculate absolute difference, then return min(diff, 360 - diff).
"""

def solve(hours: int, minutes: int) -> float:
    # TODO: Implement this method to solve the question
    0.0

def main():
    h = int(input("Hours (1-12 or 0-23): "))\n    m = int(input("Minutes (0-59): "))\n    print(f"Smaller angle: {solve(h, m)}")

if __name__ == "__main__":
    main()
