product = input()
city = input()
number_of_products = float(input())

if city == "Sofia":
    if product == "coffee":
        print(0.5 * number_of_products)
    elif product == "water":
        print(0.8 * number_of_products)
    elif product == "beer":
        print(1.2 * number_of_products)
    elif product == "sweets":
        print(1.45 * number_of_products)
    elif product == "peanuts":
        print(1.6 * number_of_products)
elif city == "Plovdiv":
    if product == "coffee":
        print(0.4 * number_of_products)
    elif product == "water":
        print(0.7 * number_of_products)
    elif product == "beer":
        print(1.15 * number_of_products)
    elif product == "sweets":
        print(1.30 * number_of_products)
    elif product == "peanuts":
        print(1.5 * number_of_products)
elif city == "Varna":
    if product == "coffee":
        print(0.45 * number_of_products)
    elif product == "water":
        print(0.7 * number_of_products)
    elif product == "beer":
        print(1.1 * number_of_products)
    elif product == "sweets":
        print(1.35 * number_of_products)
    elif product == "peanuts":
        print(1.55 * number_of_products)
