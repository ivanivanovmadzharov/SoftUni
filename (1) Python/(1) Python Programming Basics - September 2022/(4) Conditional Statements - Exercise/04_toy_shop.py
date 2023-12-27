trip_price = float(input())
puzzles = int(input())
dolls = int(input())
teddy_bears = int(input())
minions = int(input())
trucks = int(input())

total_money = (puzzles * 2.6) + (dolls * 3) + (teddy_bears * 4.1) + (minions * 8.2) + (trucks * 2)
total_products = puzzles + dolls + teddy_bears + minions + trucks

if total_products >= 50:
    total_money = total_money * 0.75

total_money = total_money * 0.90

if total_money >= trip_price:
    print(f"Yes! {(total_money - trip_price):.2f} lv left.")
elif total_money < trip_price:
    print(f"Not enough money! {(trip_price - total_money):.2f} lv needed.")
