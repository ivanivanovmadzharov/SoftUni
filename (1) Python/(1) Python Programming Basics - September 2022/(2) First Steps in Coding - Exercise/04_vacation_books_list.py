pages_count = int(input())
pages_for_hour = int(input())
day_count = int(input())

total_hours_needed = pages_count // pages_for_hour
hours_per_day = total_hours_needed / day_count

print(int(hours_per_day))
