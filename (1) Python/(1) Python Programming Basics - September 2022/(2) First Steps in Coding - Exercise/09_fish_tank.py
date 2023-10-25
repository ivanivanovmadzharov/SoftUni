length_in_cm = int(input())
width_in_cm = int(input())
height_in_cm = int(input())
filled_space_percent = float(input())

tank_size_in_cm3 = length_in_cm * width_in_cm * height_in_cm
tank_size_in_liters = tank_size_in_cm3 / 1000
filled_space_percent = 1 - (filled_space_percent / 100)

needed_water_in_liters = tank_size_in_liters * filled_space_percent

print(needed_water_in_liters)
