"""
Phase 1: Conditional Thinking (If-Else, Boolean Logic)
Level 5: Creative / Tricky Logical Scenarios
Question 44: Take time (hours and minutes) and print the smaller angle between the hour and minute hands.

Mentor Tips (Python 3.14+):
- Hour hand moves 0.5 deg per minute. Minute hand moves 6 deg per minute. Hour hand also moves 30 deg per hour. Calculate absolute difference, then return min(diff, 360 - diff).
"""

def solve(hours: int, minutes: int) -> float:
    # TODO: Implement this method to solve the question
    if not (0 <= hours <= 23) or not (0 <= minutes <= 59):
        raise ValueError("Hours must be in the range 0-23 and minutes in the range 0-59.")
    hour_angle = (hours % 12) * 30 + minutes * 0.5
    minute_angle = minutes * 6
    diff = abs(hour_angle - minute_angle)
    return min(diff, 360 - diff)

def main():
    h = int(input("Hours (1-12 or 0-23): "))
    m = int(input("Minutes (0-59): "))
    print(f"Smaller angle: {solve(h, m)}")

if __name__ == "__main__":
    main()
