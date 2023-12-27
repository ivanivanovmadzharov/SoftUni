import math

world_record = float(input())
distance_meters = float(input())
seconds_per_meter = float(input())

time = distance_meters * seconds_per_meter
time_with_water_resistance = math.floor(distance_meters / 15) * 12.5
total_time = time + time_with_water_resistance

if world_record <= total_time:
    print(f"No, he failed! He was {(total_time - world_record):.2f} seconds slower.")
else:
    print(f"Yes, he succeeded! The new world record is {total_time:.2f} seconds.")
