movie_budget = float(input())
extras = int(input())
clothing_price = float(input())

if extras > 150:
    money = extras * (clothing_price * 0.9)
    money = money + movie_budget * 0.1
else:
    money = extras * clothing_price
    money = money + movie_budget * 0.1

if money > movie_budget:
    print("Not enough money!")
    print(f"Wingard needs {money - movie_budget:.2f} leva more.")
elif money <= movie_budget:
    print("Action!")
    print(f"Wingard starts filming with {movie_budget - money:.2f} leva left.")
